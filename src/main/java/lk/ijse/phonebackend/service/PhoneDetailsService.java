package lk.ijse.phonebackend.service;

import lk.ijse.phonebackend.dto.PhoneDetailsDto;

import java.util.List;

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
