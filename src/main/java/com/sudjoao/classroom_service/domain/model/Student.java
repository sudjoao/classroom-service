package com.sudjoao.classroom_service.domain.model;

import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @ManyToOne
    Classroom classroom;
    String name;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", classroom=" + classroom +
                ", name='" + name + '\'' +
                '}';
    }
}
