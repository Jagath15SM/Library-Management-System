package com.example.LMSbackend.RequestDTO;


import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentRequestDto {
    private int age;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;


    private String country;

}

