package com.example.gym.modules.workout.usecase.update.implementation;

import com.example.gym.modules.workout.dto.WorkoutDto;
import com.example.gym.modules.workout.entity.WorkoutEntity;
import org.springframework.http.ResponseEntity;

import java.util.UUID;

public interface UpdateWorkoutUseCaseImpl {
    ResponseEntity<WorkoutEntity> execute(WorkoutDto workoutDto, UUID id);
}
