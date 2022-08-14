package com.example.gym.modules.workout.usecase.findAllByStudent.implementation;

import com.example.gym.modules.workout.entity.WorkoutEntity;

import java.util.List;
import java.util.UUID;

public interface FindAllWorkoutUseCaseImpl {
     List<WorkoutEntity> execute(UUID studentId);
}
