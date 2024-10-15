package com.crudProject.crud.domain.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crudProject.crud.domain.user.entities.User;

@RestController
@RequestMapping(value = "/user")
public class UserResource {

	@Autowired
	UserService service;

	@GetMapping("/all")
	public ResponseEntity<List<User>> findAll() {

		List<User> users = service.findAll();

		return ResponseEntity.ok().body(users);
	}

	@GetMapping("/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id) {
		User user = service.findById(id);

		return ResponseEntity.ok().body(user);
	}

}