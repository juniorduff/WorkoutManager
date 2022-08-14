package com.example.gym.modules.workout.usecase.create;

import com.example.gym.modules.workout.dto.WorkoutDto;
import com.example.gym.modules.workout.entity.WorkoutEntity;
import com.example.gym.modules.workout.usecase.create.implementation.CreateWorkoutUseCaseImpl;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/workout")
@Api(tags = "Workout")

public class CreateWorkoutController {

    @Autowired
    private CreateWorkoutUseCaseImpl createWorkoutUseCase;

    @PostMapping("/create")
    public ResponseEntity<WorkoutEntity> handle(@RequestBody WorkoutDto workoutDto) {
        return this.createWorkoutUseCase.execute(workoutDto);
    }
}
