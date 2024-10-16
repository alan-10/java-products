package com.crudProject.crud.domain.user.exceptions;

public class UserNotFountException extends RuntimeException{

	private static final long serialVersionUID = 1L;


	public UserNotFountException() {
		super("User not exists");
	}
	
	
	public UserNotFountException(String message) {
		super(message);
	}
	
	
}
