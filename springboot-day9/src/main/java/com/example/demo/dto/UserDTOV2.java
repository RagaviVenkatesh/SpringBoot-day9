package com.example.demo.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTOV2 {
    private Long id;
    private String name;
    private String email;
    private int postCount;
}
