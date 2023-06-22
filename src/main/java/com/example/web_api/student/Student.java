package com.example.web_api.student;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    private int age;

    @Column(nullable = false)
    private String major;

    public Student(String name, String email, int age, String major) {
        this.name = name;
        this.email = email;
        this.age= age;
        this.major = major;
    }
}
