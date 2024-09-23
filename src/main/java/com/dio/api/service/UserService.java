package com.dio.api.service;

import com.dio.api.domain.model.User;

public interface UserService {

    User findById(Long id);
    User create(User userToCreate);
}
