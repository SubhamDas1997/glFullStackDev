package studentRegistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import studentRegistration.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
