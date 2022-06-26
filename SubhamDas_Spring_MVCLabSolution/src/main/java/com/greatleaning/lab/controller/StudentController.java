package com.greatleaning.lab.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.greatleaning.lab.entity.Student;
import com.greatleaning.lab.service.StudentService;

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
			@RequestParam("department") String department, 
			@RequestParam("country") String country){
		/* System.out.println(student_id); */
		Student st = null;
		if(student_id != -1) {
			st = studentService.findStudentById(student_id);
			st.setFirst_name(first_name);
			st.setLast_name(last_name);
			st.setDepartment(department);
			st.setCountry(country);
		}
		else
			st = new Student(first_name, last_name, department, country);
		studentService.saveStudent(st);
		return "redirect:list";
	}
	
	@RequestMapping("/insertStudent")
	public String insertStudent(@RequestParam("student_id") Integer student_id, Model model) {
		/* System.out.println(student_id); */
		Student st = new Student();
		if(student_id != -1)
			st = studentService.findStudentById(student_id);
		else 
			st.setStudent_id(-1);
		model.addAttribute("student", st);			
		return "StudentInsertForm";
	}
	
	@RequestMapping("/deleteStudent")
	public String deleteStudent(@RequestParam("student_id") Integer student_id){
		Student st = null;
		if(student_id != -1) {
			st = studentService.findStudentById(student_id);
			studentService.deleteStudent(st);
		}
		return "redirect:list";
	}
}
