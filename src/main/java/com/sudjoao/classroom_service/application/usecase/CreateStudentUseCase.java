package com.sudjoao.classroom_service.application.usecase;

import com.sudjoao.classroom_service.application.service.ClassroomService;
import com.sudjoao.classroom_service.application.service.StudentService;
import com.sudjoao.classroom_service.domain.model.Classroom;
import com.sudjoao.classroom_service.domain.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateStudentUseCase {
    @Autowired
    ClassroomService classroomService;
    @Autowired
    StudentService studentService;

    public Student create(Student student, Long classroomId) {
        var classroom = classroomService.getById(classroomId);
        student.setClassroom(classroom);
        return studentService.create(student);
    }
}
