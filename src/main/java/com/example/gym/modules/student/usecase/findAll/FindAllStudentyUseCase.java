package com.example.gym.modules.student.usecase.findAll;

import com.example.gym.modules.student.entity.StudentEntity;
import com.example.gym.modules.student.repository.StudentyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FindAllStudentyUseCase implements FindAllStudentyUseCaseImplementation {
@Autowired
    private StudentyRepository studentRepository;
    public List<StudentEntity> execute() {
        return this.studentRepository.findAll();
    }
}
