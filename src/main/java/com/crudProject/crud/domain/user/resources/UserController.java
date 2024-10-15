package com.crudProject.crud.domain.user.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crudProject.crud.domain.user.dtos.ConvertDtosToEntities;
import com.crudProject.crud.domain.user.dtos.CreateUserDTO;
import com.crudProject.crud.domain.user.entities.User;
import com.crudProject.crud.domain.user.services.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserController {

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

	@PostMapping
	public ResponseEntity<User> create(@RequestBody CreateUserDTO body) {
		User user = service.create(ConvertDtosToEntities.userEntity(body));

		return ResponseEntity.ok().body(user);
	}

}
