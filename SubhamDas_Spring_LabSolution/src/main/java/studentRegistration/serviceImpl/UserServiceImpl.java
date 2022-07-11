package studentRegistration.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import studentRegistration.entity.User;
import studentRegistration.repository.UserRepo;
import studentRegistration.security.StudentUserDetails;

public class UserServiceImpl implements UserDetailsService {

	@Autowired
	private UserRepo userRepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepo.getUserByUsername(username);
		
		if(user == null)
			throw new UsernameNotFoundException("Could not find user!!");
		return new StudentUserDetails(user);
	}
}