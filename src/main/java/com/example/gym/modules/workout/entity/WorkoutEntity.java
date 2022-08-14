package com.example.gym.modules.workout.entity;

import com.example.gym.modules.coach.entities.CoachEntity;
import com.example.gym.modules.exercice.entity.ExerciceEntity;
import com.example.gym.modules.student.entities.StudentEntity;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@Table(name = "Workout")
public class WorkoutEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private UUID id;
    @Column()
    private String repetitions;
    @Column()
    private String rest_time;
    @Column()
    private String Variation;
    @Column()
    private String Observations;



    @Column(name = "created_at")
    @CreationTimestamp
    private LocalDateTime created_at;
    @Column(name = "updated_at")
    @UpdateTimestamp
    private LocalDateTime updated_at;

    @ManyToOne
    @JoinColumn(name = "coach_id", nullable = false)
    private CoachEntity coach;


    @OneToMany(mappedBy = "workout", fetch = FetchType.LAZY)
    private List<ExerciceEntity> Exercices;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id", nullable = false)
    private StudentEntity student;
}
