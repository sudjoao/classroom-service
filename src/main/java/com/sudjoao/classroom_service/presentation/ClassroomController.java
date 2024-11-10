package com.sudjoao.classroom_service.presentation;

import com.sudjoao.classroom_service.application.usecase.GetClassroomUseCase;
import com.sudjoao.classroom_service.domain.model.Classroom;
import com.sudjoao.classroom_service.presentation.dto.output.ClassroomInput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/classrooms")
public class ClassroomController {
    @Autowired
    GetClassroomUseCase getClassroomUseCase;

    @GetMapping("{id}")
    ClassroomInput getById(@PathVariable Long id) {
        System.out.println(id);

        return ClassroomInput.fromDomain(getClassroomUseCase.run(id));
    }
}
