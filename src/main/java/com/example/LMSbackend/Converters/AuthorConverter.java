package com.example.LMSbackend.Converters;

import com.example.LMSbackend.Modals.Author;
import com.example.LMSbackend.RequestDTO.AuthorRequestDTO;

public class AuthorConverter {

    public static Author convertDtoToEntity(AuthorRequestDTO authorRequestDTO){
        Author author = Author.builder().name(authorRequestDTO.getName()).
                age(authorRequestDTO.getAge()).
                email(authorRequestDTO.getEmail()).
                country(authorRequestDTO.getCountry()).build();
        return author;
    }

}
