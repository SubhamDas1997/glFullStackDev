package studentRegistration.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import studentRegistration.entity.Student;
import studentRegistration.service.StudentService;

@Controller
@RequestMapping("/students")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/list")
	public String viewAll(Model model) {
		List<Student> studentList = studentService.viewAll();
		model.addAttribute("studentList", studentList);
		return "Students";
	}
	
	@RequestMapping("/save")
	public String saveStudent(@RequestParam("student_id") Integer student_id, 
			@RequestParam("first_name") String first_name, 
			@RequestParam("last_name") String last_name, 
			@RequestParam("course") String course, 
			@RequestParam("country") String country){
		/* System.out.println(student_id); */
		Student st = null;
		if(student_id != 0) {
			st = studentService.findStudentById(student_id);
			st.setFirst_name(first_name);
			st.setLast_name(last_name);
			st.setCourse(course);
			st.setCountry(country);
		}
		else
			st = new Student(first_name, last_name, course, country);
		studentService.saveStudent(st);
		return "redirect:list";
	}
	
	@RequestMapping("/insert-student")
	public String insertStudent(Model model) {
		Student st = new Student();
		model.addAttribute("student", st);		
		return "StudentInsertForm";
	}
	
	@RequestMapping("/update-student")
	public String updateStudent(@RequestParam("student_id") Integer student_id, Model model) {
		/* System.out.println(student_id); */
		Student st = new Student();
		st = studentService.findStudentById(student_id);
		model.addAttribute("student", st);			
		return "StudentInsertForm";
	}
	
	@RequestMapping("/delete-student")
	public String deleteStudent(@RequestParam("student_id") Integer student_id){
		Student st = null;
		if(student_id != 0) {
			st = studentService.findStudentById(student_id);
			studentService.deleteStudent(st);
		}
		return "redirect:list";
	}
	
	@RequestMapping("/access-denied")
	public ModelAndView accessDenied(Principal user) {
		ModelAndView model = new ModelAndView();
		
		if(user != null)
			model.addObject("msg", "Hey " + user.getName() + ", you are not allowed to access this page!!");
		else
			model.addObject("msg", "Hey guest, you are not allowed to access this page!!");
		
		model.setViewName("AccessDenied");
		return model;
	}
}