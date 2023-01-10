package com.example.LMSbackend.RequestDTO;


import jakarta.persistence.Column;
import lombok.Data;

@Data
public class AuthorRequestDTO {

    private String name;
    private int age;
    private String country;

    @Column(unique = true)
    private String email;
}
