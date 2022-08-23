package com.example.gym.modules.workout.usecase.update;

import com.example.gym.modules.workout.dto.WorkoutDto;
import com.example.gym.modules.workout.entity.WorkoutEntity;
import com.example.gym.modules.workout.usecase.update.implementation.UpdateWorkoutUseCaseImpl;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@Api(tags = "Workout")
@RequestMapping("/workout")
public class UpdateWorkoutController {
    @Autowired
    private UpdateWorkoutUseCaseImpl updateWorkoutUseCase;
    @PutMapping("/update/{id}")
    public ResponseEntity<WorkoutEntity> handle(@RequestBody WorkoutDto workoutDto, @PathVariable UUID id) {
        System.out.println(workoutDto);
        return updateWorkoutUseCase.execute(workoutDto, id);
    }
}
