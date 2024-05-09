package com.example.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}

}

/*
@Override
public UserDtoResponse createUser(UserDtoRequest request) {
	//from request to entity
	User user = userMapper.requestDtoToEntity(request);
	//save entity
	User newUser= userRepo.save(user);
	//from entity to dto
	return userMapper.entityToResponseDto(newUser);
}
*/
