package com.crudProject.crud.domain.user.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crudProject.crud.domain.user.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
