package com.murasa.spring_boot_microservice_api_gateway.security.jwt;

import com.murasa.spring_boot_microservice_api_gateway.model.User;
import com.murasa.spring_boot_microservice_api_gateway.security.UserPrincipal;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.core.Authentication;

public interface JwtProvider {
    String generateToken(UserPrincipal auth);

    String generateToken(User user);

    Authentication getAuthentication(HttpServletRequest request);

    boolean isTokenValid(HttpServletRequest request);
}
