package com.example.demo.Service;



import java.util.List;

import com.example.demo.DTO.SignUpDto;

public interface SignUpService {
     SignUpDto findSignUpService(String id);
     boolean saveSignUpService(SignUpDto signUpDto);
     List<SignUpDto> getAllSignUpService();
     long getTotalSignUp();
}
