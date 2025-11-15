package com.murasa.spring_boot_microservice_api_gateway.service;

import com.murasa.spring_boot_microservice_api_gateway.model.User;

public interface AuthenticationService {
    User signInAndReturnJWT(User signInRequest);
}
