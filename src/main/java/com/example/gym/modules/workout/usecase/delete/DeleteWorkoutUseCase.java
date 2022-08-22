package com.example.gym.modules.workout.usecase.delete;

import com.example.gym.modules.workout.repository.WorkoutRepository;
import com.example.gym.modules.workout.usecase.delete.implementation.DeleteWorkoutUseCaseImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class DeleteWorkoutUseCase implements DeleteWorkoutUseCaseImpl {
    @Autowired
    private WorkoutRepository workoutRepository;

    public void execute(UUID workoutId) {
        workoutRepository.findById(workoutId)
                .ifPresent(workout -> workoutRepository.delete(workout));
    }

}
