package com.example.gym.modules.coach.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class CoachDto implements Serializable {
    private final UUID id;
    private final String name;
    private final String email;
    private final String phone;
    private final String password;
    private final LocalDateTime created_at;
    private final LocalDateTime updated_at;

}
