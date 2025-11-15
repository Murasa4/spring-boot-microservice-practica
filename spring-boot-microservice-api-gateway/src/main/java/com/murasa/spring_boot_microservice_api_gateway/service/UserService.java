package com.murasa.spring_boot_microservice_api_gateway.service;

import com.murasa.spring_boot_microservice_api_gateway.model.Role;
import com.murasa.spring_boot_microservice_api_gateway.model.User;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;

import java.util.Optional;

public interface UserService {


    User saveUser(User user);

    Optional<User> findByUsername(String username);

    @Transactional
    @Modifying
    void changeRole(Role newRole, String username);

    User findByUsernameReturnToken(String username);
}
