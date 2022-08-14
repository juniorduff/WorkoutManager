package com.example.gym.modules.coach.usecase.create;

import com.example.gym.modules.coach.CoachRepository;
import com.example.gym.modules.coach.dto.CoachEntityDto;
import com.example.gym.modules.coach.entities.CoachEntity;
import com.example.gym.modules.coach.usecase.create.implemetation.CreateCoachUseCaseImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class CreateCoachUseCase implements CreateCoachUseCaseImpl {
@Autowired
   private CoachRepository coachRepository;

   public CoachEntity execute(CoachEntityDto coachDto) {
       CoachEntity coachEntity = new CoachEntity();

       coachEntity.setName(coachDto.getName());
       coachEntity.setPhone(coachDto.getPhone());
       coachEntity.setPassword(new BCryptPasswordEncoder().encode(coachDto.getPassword()));
       coachEntity.setEmail(coachDto.getEmail());

   return this.coachRepository.save(coachEntity);
   }
}
