package com.murasa.spring_boot_microservice_api_gateway.service;

import com.murasa.spring_boot_microservice_api_gateway.model.Role;
import com.murasa.spring_boot_microservice_api_gateway.model.User;
import com.murasa.spring_boot_microservice_api_gateway.repository.UserRepository;
import com.murasa.spring_boot_microservice_api_gateway.security.jwt.JwtProvider;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private JwtProvider jwtProvider;

    @Override
    public User saveUser(User user){

        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRole(Role.USER);
        user.setFechaCreacion(LocalDateTime.now());
        User userCreado = userRepository.save(user);

        String jwt = jwtProvider.generateToken(userCreado);
        userCreado.setToken(jwt);

        return userCreado;

    }

    @Override
    public Optional<User> findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Transactional
    @Override
    public void changeRole(Role newRole, String username) {
        userRepository.updateUserRole(username, newRole);
    }

    @Override
    public User findByUsernameReturnToken(String username) {
        User user = userRepository.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("El usuario no existe: " + username));

        String jwt = jwtProvider.generateToken(user);
        user.setToken(jwt);
        return user;
    }

}
