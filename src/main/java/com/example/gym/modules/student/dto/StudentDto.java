package com.example.gym.modules.student.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.UUID;

@Data
public class StudentDto implements Serializable {
    private final UUID id;
    private final String name;
    private final String email;
    private final String phone;
}
