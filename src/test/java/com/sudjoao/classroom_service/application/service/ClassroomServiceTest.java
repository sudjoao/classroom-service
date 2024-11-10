package com.sudjoao.classroom_service.application.service;

import com.sudjoao.classroom_service.domain.model.Classroom;
import com.sudjoao.classroom_service.domain.repository.ClassroomRepository;
import jakarta.persistence.EntityNotFoundException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@ActiveProfiles("test")
@Transactional
class ClassroomServiceTest {

    @Autowired
    ClassroomRepository classroomRepository;

    @Autowired
    ClassroomService classroomService;

    @Test
    @DisplayName("When a valid id is passed, it should return a classroom")
    void getValidClassroomById() {
        var classroom = new Classroom();
        classroom.setName("Class 1");
        classroom.setUserId(1L);
        Classroom savedClassroom = classroomRepository.save(classroom);
        Long id = savedClassroom.getId();

        var foundClassroom = classroomService.getById(id);

        assertAll(
                () -> assertNotNull(foundClassroom, "Classroom should not be null"),
                () -> assertEquals(id, foundClassroom.getId(), "Classroom ID should match the expected value"),
                () -> assertEquals(classroom.getName(), foundClassroom.getName(), "Classroom name should match")
        );
    }

    @Test
    @DisplayName("When an invalid id is passed, it should throw an EntityNotFoundException")
    void getInvalidClassroomById() {
        Long invalidId = 999L;

        assertThrows(EntityNotFoundException.class, () -> {
            Classroom classroom = classroomService.getById(invalidId);
            classroom.getName();
        });
    }
}