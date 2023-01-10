package com.example.LMSbackend.Modals;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@NoArgsConstructor
@Data
@Builder
@AllArgsConstructor
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int age;
    private String country;

    @Column(unique = true)
    private String email;

    @OneToMany(mappedBy = "author" ,cascade = CascadeType.ALL)
    private List<Book> booksWritten;


}
