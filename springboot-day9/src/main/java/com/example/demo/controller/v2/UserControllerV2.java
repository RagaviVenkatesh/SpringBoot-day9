package com.example.demo.controller.v2;

import com.example.demo.dto.ApiResponse;
import com.example.demo.dto.UserDTOV2;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v2/users")
public class UserControllerV2 {

    @GetMapping
    public ApiResponse<List<UserDTOV2>> getUsers() {
        List<UserDTOV2> users = Arrays.asList(
            new UserDTOV2(1L, "Alice", "alice@example.com", 3),
            new UserDTOV2(2L, "Bob", "bob@example.com", 5)
        );
        return new ApiResponse<>(users, "success", "Fetched V2 users with post count", LocalDateTime.now());
    }
}
