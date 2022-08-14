package com.example.gym.modules.exercice.entity;

import com.example.gym.modules.workout.entity.WorkoutEntity;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "Exercice")
@Data
public class ExerciceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private UUID id;
    @Column(name = "name", nullable = false)
    private String name;

    @Column(name ="description")
    private String description;



    @Column(name = "created_at")
    @CreationTimestamp
    private LocalDateTime created_at;
    @Column(name = "updated_at")
    @UpdateTimestamp
    private LocalDateTime updated_at;

    @ManyToOne()
    @JoinColumn(name = "workout_id", nullable = false)
    private WorkoutEntity workout;

}
