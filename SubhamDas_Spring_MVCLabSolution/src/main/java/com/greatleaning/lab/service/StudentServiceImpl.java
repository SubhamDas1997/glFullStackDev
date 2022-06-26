package com.greatleaning.lab.service;

import java.util.List;
import javax.transaction.Transactional;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.greatleaning.lab.entity.Student;

@Repository
public class StudentServiceImpl implements StudentService {
	
	private SessionFactory sessionfactory;
	private Session session;
	
	public StudentServiceImpl(SessionFactory sessionfactory) {
		this.sessionfactory = sessionfactory;
		try {
			session = this.sessionfactory.getCurrentSession();
		} catch (HibernateException e) {
			session = this.sessionfactory.openSession();
			e.printStackTrace();
		}
	}

	@Transactional
	public List<Student> viewAll(){
		List<Student> studentList = session.createQuery("from Student").list();
		for(Student s:studentList)
			System.out.println(s);
		return studentList;
	}
	
	@Transactional
	public Student findStudentById(Integer student_id){
		Student student = session.get(Student.class, student_id);
		return student;
	}
	
	@Transactional
	public void saveStudent(Student student) {
		Transaction tr = session.beginTransaction();
		session.saveOrUpdate(student);
		tr.commit();
	}

	@Transactional
	public void deleteStudent(Student st) {
		Transaction tr = session.beginTransaction();
		session.delete(st);
		tr.commit();
	}
}
