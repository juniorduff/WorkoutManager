package com.example.gym.modules.student.usecase.update;

import com.example.gym.modules.student.dto.StudentDto;
import com.example.gym.modules.student.entity.StudentEntity;
import com.example.gym.modules.student.repository.StudentyRepository;
import com.example.gym.modules.student.usecase.update.implementation.UpdateStudentUseCaseImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class updateStudentUseCase implements UpdateStudentUseCaseImpl {

    @Autowired
    private StudentyRepository studentyRepository;

    public StudentEntity execute(UUID studentId, StudentDto studentDto) {

        Optional<StudentEntity> student = studentyRepository.findById(studentId);

        if (student.isPresent()) {

            student.get().setName(studentDto.getName());
            student.get().setPhone(studentDto.getPhone());
            student.get().setEmail(studentDto.getEmail());
            return this.studentyRepository.save(student.get());
        }

        return null;
    }
}
