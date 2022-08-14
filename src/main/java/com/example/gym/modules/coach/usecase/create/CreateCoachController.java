package com.example.gym.modules.coach.usecase.create;

import com.example.gym.modules.coach.dto.CoachDto;
import com.example.gym.modules.coach.entities.CoachEntity;
import com.example.gym.modules.coach.usecase.create.implemetation.CreateCoachUseCaseImpl;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coach")
@Api(tags = "Coach")
public class CreateCoachController {
    @Autowired
    private CreateCoachUseCaseImpl createCoachUseCase;

    @PostMapping("/create")
    public CoachEntity handle(@RequestBody CoachDto coachDto) {
        return this.createCoachUseCase.execute(coachDto);
    }
}
