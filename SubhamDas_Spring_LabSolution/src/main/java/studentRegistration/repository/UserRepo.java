package studentRegistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import studentRegistration.entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {

	@Query("from User u where u.username = ?1")
	public User getUserByUsername(String username);
}
