package com.example.demo.controller.v1;

import com.example.demo.dto.ApiResponse;
import com.example.demo.dto.UserDTO;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserControllerV1 {

    @GetMapping
    public ApiResponse<List<UserDTO>> getUsers() {
        List<UserDTO> users = Arrays.asList(
            new UserDTO(1L, "Alice", "alice@example.com"),
            new UserDTO(2L, "Bob", "bob@example.com")
        );
        return new ApiResponse<>(users, "success", "Fetched V1 users", LocalDateTime.now());
    }
}
