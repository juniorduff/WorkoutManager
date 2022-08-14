package com.example.gym.modules.workout.usecase.findAllByStudent;

import com.example.gym.modules.workout.WorkoutRepository;
import com.example.gym.modules.workout.entity.WorkoutEntity;
import com.example.gym.modules.workout.usecase.findAllByStudent.implementation.FindAllWorkoutUseCaseImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class findAllWorkoutUseCase implements FindAllWorkoutUseCaseImpl {


    @Autowired
    private WorkoutRepository workoutRepository;

    @Override
    public List<WorkoutEntity> execute(UUID studentId) {
        return this.workoutRepository.findAllByStudentId(studentId);
    }
}
