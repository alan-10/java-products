package com.crudProject.crud.domain.user.dtos;

import com.crudProject.crud.domain.user.entities.User;

public class ConvertDtosToEntities {
	public static User userEntity(CreateUserDTO userDTO) {
		return new User(null, userDTO.getName(), userDTO.getEmail(), userDTO.getPhone(), userDTO.getPassword());
	}
}
