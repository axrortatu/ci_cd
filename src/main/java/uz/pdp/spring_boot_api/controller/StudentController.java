package uz.pdp.spring_boot_api.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import uz.pdp.spring_boot_api.entity.StudentEntity;

import java.util.List;

@RestController
@RequestMapping("/api/student")
@RequiredArgsConstructor
public class StudentController {

//    private final StudentService studentService;

    @GetMapping("/list")
    @ResponseStatus(HttpStatus.OK)
    public List<StudentEntity> getList(){
        return List.of();
    }

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public StudentEntity add(
            @RequestBody StudentEntity studentEntity
    ){
        return studentEntity;
    }
}
