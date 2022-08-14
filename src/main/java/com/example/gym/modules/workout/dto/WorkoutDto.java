package com.example.gym.modules.workout.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Data
public class WorkoutDto implements Serializable {
    private final UUID id;
    private final String repetitions;
    private final String rest_time;
    private final String Variation;
    private final String Observations;
    private final LocalDateTime created_at;
    private final LocalDateTime updated_at;
    private final UUID coachID;
    private final List<UUID> ExercicesIDs;
    private final UUID studentID;

}
