package employeeManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import employeeManagement.entity.Role;
import employeeManagement.serviceImpl.RoleServiceImpl;

@RestController
@RequestMapping("/roles")
public class RoleController {
	
	@Autowired
	private RoleServiceImpl roleService;

	@GetMapping
	public List<Role> getRoles() {
		return roleService.showRoles();
	}
	
	@PostMapping
	public Role addRole(@RequestBody Role role) {
		role.setId(0);
		roleService.saveRole(role);
		return role;
	}
	
	@GetMapping("/{id}")
	public Role getRolebyId(@PathVariable Integer id) {
		return roleService.findRoleById(id);
	}
	
	@DeleteMapping("/{id}")
	public String deleteRole(@PathVariable Integer id) {
		Role role = roleService.findRoleById(id);
		roleService.deleteRole(role);
		return "Deleted role ID - " + id;
	}
}