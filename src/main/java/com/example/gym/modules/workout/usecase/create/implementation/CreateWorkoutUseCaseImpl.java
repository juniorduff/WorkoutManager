package com.example.gym.modules.workout.usecase.create.implementation;

import com.example.gym.modules.workout.dto.WorkoutDto;
import com.example.gym.modules.workout.entity.WorkoutEntity;
import org.springframework.http.ResponseEntity;

public interface CreateWorkoutUseCaseImpl {
    ResponseEntity<WorkoutEntity> execute(WorkoutDto workoutDto);
}
