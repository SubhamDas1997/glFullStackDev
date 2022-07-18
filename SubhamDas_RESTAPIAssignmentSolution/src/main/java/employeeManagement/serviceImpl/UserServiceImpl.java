package employeeManagement.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import employeeManagement.entity.User;
import employeeManagement.repository.UserRepo;
import employeeManagement.security.EmployeeUserDetails;

public class UserServiceImpl implements UserDetailsService {

	@Autowired
	private UserRepo userRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepo.getByUsername(username);
		if(user == null)
			throw new UsernameNotFoundException("Could not find user!!");
		return new EmployeeUserDetails(user);
	}
}