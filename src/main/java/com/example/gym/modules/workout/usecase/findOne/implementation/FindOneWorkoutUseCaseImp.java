package com.example.gym.modules.workout.usecase.findOne.implementation;

import com.example.gym.modules.workout.entity.WorkoutEntity;

import java.util.Optional;
import java.util.UUID;

public interface FindOneWorkoutUseCaseImp {
    Optional<WorkoutEntity> execute(UUID workoutId);
}
