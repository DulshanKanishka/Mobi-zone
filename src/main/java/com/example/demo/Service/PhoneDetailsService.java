package com.example.demo.Service;


import java.util.List;

import com.example.demo.DTO.PhoneDetailsDto;

public interface PhoneDetailsService {
//    boolean savePhoneDetails(PhoneDetailsDto phoneDetailsDto);
//    List<PhoneDetailsDto> getallPhoneDetails();
//    PhoneDetailsDto findphonedetails(String id);
//    long getTotalPhoneDetails();

    void savePhoneDetails(PhoneDetailsDto phoneDetailsDto);

    void updatePhoneDetails(PhoneDetailsDto phoneDetailsDto);

    void deletePhoneDetails(String name);

    PhoneDetailsDto findPhoneDetails(String name);

    List<PhoneDetailsDto> findAllPhoneDetails();

}
