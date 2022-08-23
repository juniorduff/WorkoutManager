package com.example.gym.modules.workout.usecase.findOne;

import com.example.gym.modules.workout.entity.WorkoutEntity;
import com.example.gym.modules.workout.repository.WorkoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class FindOneWorkoutUseCase {
    @Autowired
    private WorkoutRepository workoutRepository;

    public Optional<WorkoutEntity> execute(UUID workoutId) {
        return workoutRepository.findById(workoutId);
    }
}

