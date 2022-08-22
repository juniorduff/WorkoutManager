package com.example.gym.modules.coach.usecase.list;

import com.example.gym.modules.coach.entities.CoachEntity;
import com.example.gym.modules.coach.usecase.list.implementation.ListCoachUseCaseImp;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/coach")
@Api(tags = "Coach")
public class ListCoachController {
    @Autowired
    private ListCoachUseCaseImp listCoachUseCase;


    @GetMapping("/list")
    List<CoachEntity> handle() {
        return this.listCoachUseCase.execute();
    }
}
