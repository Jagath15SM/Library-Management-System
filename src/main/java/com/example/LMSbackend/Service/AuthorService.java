package com.example.LMSbackend.Service;


import com.example.LMSbackend.Converters.AuthorConverter;
import com.example.LMSbackend.Modals.Author;
import com.example.LMSbackend.Repository.AuthorRepository;
import com.example.LMSbackend.RequestDTO.AuthorRequestDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class AuthorService {

    @Autowired
    AuthorRepository authorRepository;

    public String createAuthor(AuthorRequestDTO authorRequestDTO){
        try{
            Author author = AuthorConverter.convertDtoToEntity(authorRequestDTO);
            authorRepository.save(author);
        }catch (Exception e){
            log.info("creating author caused an issue");
            return "createAuthor() did not work";
        }
        return "Author has been created successfully";
    }

}
