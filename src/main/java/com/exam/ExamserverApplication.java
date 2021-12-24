package com.exam;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.exam.model.Role;
import com.exam.model.User;
import com.exam.model.UserRole;
import com.exam.services.UserService;

@SpringBootApplication
public class ExamserverApplication implements CommandLineRunner{
	
	@Autowired
	private UserService userService;
	
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	public static void main(String[] args) {
		SpringApplication.run(ExamserverApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("staring code");
		
		
		/*
		 * User user = new User();
		 * 
		 * user.setFirstName("Varun"); user.setLastName("Kashyap");
		 * user.setUsername("varun18");
		 * user.setPassword(this.passwordEncoder().encode("111"));
		 * user.setEmail("varun@gmail.com"); user.setPhone("11111111111");
		 * user.setProfile("default.png");
		 * 
		 * Role role1 = new Role();
		 * 
		 * role1.setRoleId(44L); role1.setRoleName("ADMIN");
		 * 
		 * UserRole userRole = new UserRole();
		 * 
		 * userRole.setRole(role1); userRole.setUser(user);
		 * 
		 * Set<UserRole> userRolesSet = new HashSet<UserRole>();
		 * userRolesSet.add(userRole);
		 * 
		 * User user1 = this.userService.createUser(user, userRolesSet);
		 * System.out.println(user1.getUsername());
		 */
	}

}
