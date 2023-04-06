package uz.pdp.spring_boot_api.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.pdp.spring_boot_api.entity.StudentEntity;
import uz.pdp.spring_boot_api.repository.StudentRepository;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;
    public List<StudentEntity> getStudentList(){
        return studentRepository.findAll();
    }

    public StudentEntity addStudent(
            StudentEntity studentEntity
    ){
        studentEntity.setId(UUID.randomUUID());
        return studentRepository.save(studentEntity);
    }


}
