package com.example.gym.modules.workout.usecase.findAllByStudent;

import com.example.gym.modules.workout.entity.WorkoutEntity;
import com.example.gym.modules.workout.usecase.findAllByStudent.implementation.FindAllWorkoutUseCaseImpl;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;


@RestController
@RequestMapping("/workout")
@Api(tags = "Workout")
public class FindAllWorkoutController {

    @Autowired
    private FindAllWorkoutUseCaseImpl findAllWorkoutUseCase;

    @GetMapping("/{studentId}")
    public List<WorkoutEntity> handle(@PathVariable UUID studentId) {
        return this.findAllWorkoutUseCase.execute(studentId);
    }
}


