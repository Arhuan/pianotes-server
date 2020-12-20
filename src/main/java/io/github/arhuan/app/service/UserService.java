package io.github.arhuan.app.service;

import io.github.arhuan.app.dto.MetricsDTO;
import io.github.arhuan.app.dto.UserDTO;

public class UserService {

    public UserDTO userLogin() {
        return new UserDTO();
    }

    public UserDTO userSignUp() {
        return new UserDTO();
    }

    public UserDTO userSignOut() {
        return new UserDTO();
    }

    public MetricsDTO getMetrics() {
        return new MetricsDTO();
    }
}
