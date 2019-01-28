package com.example.demo.Service.Impl;

import com.example.demo.DTO.SignUpDto;
import com.example.demo.Entity.SignUp;
import com.example.demo.Repository.SignUpRepository;
import com.example.demo.Service.SignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
public class SignUpServiceImpl implements SignUpService {

    @Autowired
    private SignUpRepository signUpRepository;

    @Override
    public SignUpDto findSignUpService(String id) {

        return null;

    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean saveSignUpService(SignUpDto signUpDto) {
        signUpRepository.save(new SignUp(signUpDto.geteMail(),signUpDto.getPassword()));
        return true;
    }

    @Override
    public List<SignUpDto> getAllSignUpService() {
        List<SignUp> all = signUpRepository.findAll();
        List<SignUpDto>dtoList=new ArrayList<>();
        all.forEach(signUp -> {
            dtoList.add(new SignUpDto(signUp.geteMail(),signUp.getPassword()));
        });
        return dtoList;
    }

    @Override
    public long getTotalSignUp() {
        return 0;
    }
}
