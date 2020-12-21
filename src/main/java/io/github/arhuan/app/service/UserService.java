package io.github.arhuan.app.service;

import io.github.arhuan.app.dto.UserDTO;
import io.github.arhuan.app.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public UserDTO userSignUp(UserDTO user) {
        repository.findByEmail(user.getEmail());
        return new UserDTO();
    }
}
