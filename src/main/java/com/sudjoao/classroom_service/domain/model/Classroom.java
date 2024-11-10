package com.sudjoao.classroom_service.domain.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "classrooms")
public class Classroom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @OneToMany(mappedBy = "classroom", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    List<Student> students;
    Long userId;
}
