package studentRegistration.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import studentRegistration.entity.Role;
import studentRegistration.entity.User;

public class StudentUserDetails implements UserDetails {
	
	private User user;
	public StudentUserDetails(User user) {
		this.user = user;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		List<Role> roleList = user.getUserRoles();
		List<SimpleGrantedAuthority> grantedAuthorities = new ArrayList<>();
		
		for(Role role:roleList)
			grantedAuthorities.add(new SimpleGrantedAuthority(role.getName()));
		return grantedAuthorities;
	}

	@Override
	public String getPassword() {
		return user.getPassword();
	}

	@Override
	public String getUsername() {
		return user.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
}