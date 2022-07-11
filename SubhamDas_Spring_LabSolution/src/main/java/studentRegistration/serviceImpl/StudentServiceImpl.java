package studentRegistration.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import studentRegistration.entity.Student;
import studentRegistration.repository.StudentRepo;
import studentRegistration.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepo studentRepo;

	@Override
	public List<Student> viewAll() {
		return studentRepo.findAll();
	}

	@Override
	public void saveStudent(Student st) {
		studentRepo.save(st);
	}

	@Override
	public Student findStudentById(Integer student_id) {
		return studentRepo.findById(student_id).get();
	}

	@Override
	public void deleteStudent(Student st) {
		studentRepo.delete(st);
	}
}