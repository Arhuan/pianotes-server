package io.github.arhuan.app.controller;

import io.github.arhuan.app.dto.UserDTO;
import io.github.arhuan.app.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserController {

    private UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping
    public UserDTO createUser() {
        return new UserDTO();
    }
}
