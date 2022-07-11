package studentRegistration.service;

import java.util.List;

import studentRegistration.entity.Student;

public interface StudentService {
	
	public List<Student> viewAll();
	public void saveStudent(Student st);
	public Student findStudentById(Integer student_id);
	public void deleteStudent(Student st);
}