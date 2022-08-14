package com.example.gym.modules.workout.usecase.delete;

import com.example.gym.modules.workout.entity.WorkoutEntity;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/workout")
@Api(tags = "Workout")

public class DeleteWorkoutController {

    @Autowired
    private DeleteWorkoutUseCase deleteWorkoutUseCase;

    public ResponseEntity<WorkoutEntity> handle(@PathVariable UUID id) {
        this.deleteWorkoutUseCase.execute(id);
        return ResponseEntity.ok().build();
    }

}
