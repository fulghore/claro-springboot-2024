package me.dio.claro.springboot.service;

import me.dio.claro.springboot.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
