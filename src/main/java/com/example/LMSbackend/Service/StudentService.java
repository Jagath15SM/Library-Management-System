package com.example.LMSbackend.Service;

import com.example.LMSbackend.Enums.CardStatus;
import com.example.LMSbackend.Modals.Card;
import com.example.LMSbackend.Modals.Student;
import com.example.LMSbackend.Repository.CardRepository;
import com.example.LMSbackend.Repository.StudentRepository;
import com.example.LMSbackend.RequestDTO.StudentRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    CardRepository cardRepository;

    public String createStudent(StudentRequestDto studentRequestDto){

        // Converting Dto to Entity
        Student student = new Student();
        student.setEmail(studentRequestDto.getEmail());
        student.setName(studentRequestDto.getName());
        student.setAge(studentRequestDto.getAge());
        student.setCountry(studentRequestDto.getCountry());

        // Creating Card
        Card newCard = new Card();
        newCard.setCardStatus(CardStatus.ACTIVATED);
        //For that bidirectional relation
        newCard.setStudent(student);

        studentRepository.save(student);
        //cardRepository.save() will automatically be taken of.
        return "Successfully added student and card";
    }


}
