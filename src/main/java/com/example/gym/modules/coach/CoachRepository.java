package com.example.gym.modules.coach;

import com.example.gym.modules.coach.entities.CoachEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CoachRepository extends JpaRepository<CoachEntity, UUID> {
}
