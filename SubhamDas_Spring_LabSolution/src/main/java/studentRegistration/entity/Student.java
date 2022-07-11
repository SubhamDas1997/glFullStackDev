package studentRegistration.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int student_id;
	private String first_name;
	private String last_name;
	private String course;
	private String country;

	public Student() {

	}
	
	public Student(String first_name, String last_name, String course, String country) {
		this.first_name = first_name;
		this.last_name = last_name;
		this.course = course;
		this.country = country;
	}

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "\nStudent details:- \nFirst name: " + first_name + "\nLast name: " + last_name + "\nCourse: " + course
				+ "\nCountry: " + country;
	}
}