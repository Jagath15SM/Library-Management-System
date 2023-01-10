package com.example.LMSbackend.Repository;

import com.example.LMSbackend.Modals.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface StudentRepository extends JpaRepository<Student, Integer> {

}
