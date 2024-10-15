package com.crudProject.crud.domain.user.exceptions;

public class UserNotFountException extends RuntimeException{

	public UserNotFountException() {
		super("User not exists");
	}
	
	
	public UserNotFountException(String message) {
		super(message);
	}
	
	
}
