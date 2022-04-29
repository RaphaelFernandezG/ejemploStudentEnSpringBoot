package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository <Student, Long> {

    // reemplaza la consulta SELECT * FROM Student WHERE email=?
    Optional<Student> findStudentByEmail(String email);

}
