package com.example.gym.modules.coach.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class CoachEntityDto implements Serializable {
    private final String name;
    private final String email;
    private final String phone;
    private final String password;
    private final LocalDateTime created_at;
    private final LocalDateTime updated_at;
}
