

package com.example.gym.modules.student.usecase.create;

import com.example.gym.modules.student.StudentyRepository;
import com.example.gym.modules.student.dto.StudentEntityDto;
import com.example.gym.modules.student.entities.StudentEntity;
import com.example.gym.modules.student.usecase.create.implementation.createUserUseCaseImplementation;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CreateStundentyUseCase implements createUserUseCaseImplementation {

    private final ModelMapper modelMapper = new ModelMapper();
      @Autowired
    private StudentyRepository userRepository;
    private StudentEntity  newStudent;

    public StudentEntity execute(StudentEntityDto studentDto) {
        return null;
    }

    @Override
    public StudentEntity excute(StudentEntityDto studentDto) {
        StudentEntity newStudent = new StudentEntity();
        newStudent.setName(studentDto.getName()) ;
        newStudent.setPhone(studentDto.getPhone());
        newStudent.setEmail(studentDto.getEmail());

        return userRepository.save(newStudent);
    }
}

