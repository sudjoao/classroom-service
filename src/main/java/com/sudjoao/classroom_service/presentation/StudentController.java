package com.sudjoao.classroom_service.presentation;

import com.sudjoao.classroom_service.application.usecase.CreateStudentUseCase;
import com.sudjoao.classroom_service.domain.model.Student;
import com.sudjoao.classroom_service.presentation.dto.input.StudentInput;
import com.sudjoao.classroom_service.presentation.dto.output.StudentOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    CreateStudentUseCase createStudentUseCase;

    @PostMapping
    public StudentOutput create(@RequestBody StudentInput studentInput) {
        Long classroomId = studentInput.classroomId();
        return StudentOutput.fromDomain(createStudentUseCase.create(studentInput.toDomain(), classroomId));
    }
}
