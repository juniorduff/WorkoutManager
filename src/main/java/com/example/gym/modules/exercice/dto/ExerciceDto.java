package com.example.gym.modules.exercice.dto;

import com.example.gym.modules.workout.dto.WorkoutDto;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class ExerciceDto implements Serializable {
    private final UUID id;
    private final String name;
    private final String description;
    private final LocalDateTime created_at;
    private final LocalDateTime updated_at;
    private final WorkoutDto workout;
}
