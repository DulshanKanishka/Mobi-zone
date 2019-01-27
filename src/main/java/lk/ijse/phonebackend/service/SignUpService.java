package lk.ijse.phonebackend.service;

import lk.ijse.phonebackend.dto.SignUpDto;

import java.util.List;

public interface SignUpService {
     SignUpDto findSignUpService(String id);
     boolean saveSignUpService(SignUpDto signUpDto);
     List<SignUpDto> getAllSignUpService();
     long getTotalSignUp();
}
