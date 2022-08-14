

package com.example.gym.modules.student.usecase.create;

import com.example.gym.modules.student.StudentyRepository;
import com.example.gym.modules.student.dto.StudentEntityDto;
import com.example.gym.modules.student.entities.StudentEntity;
import com.example.gym.modules.student.usecase.create.implementation.createUserUseCaseImplementation;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CreateUserUseCase implements createUserUseCaseImplementation {

    private static final ModelMapper modelMapper = new ModelMapper();
      @Autowired
    private StudentyRepository userRepository;
    public StudentEntity execute(StudentEntityDto studentDto) {
        return null;
    }

    @Override
    public StudentEntity excute(StudentEntityDto studentDto) {
        StudentEntity student = modelMapper.map(studentDto, StudentEntity.class);
        return userRepository.save(student);
    }
}

