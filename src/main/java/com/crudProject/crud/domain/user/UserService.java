package com.crudProject.crud.domain.user;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudProject.crud.domain.user.entities.User;

@Service
public class UserService {

	@Autowired
	UserRepository repository;

	public List<User> findAll() {
		return repository.findAll();
	}

	public User findById(Long id) {
		Optional<User> user = repository.findById(id);
		return user.get();
	}

}
