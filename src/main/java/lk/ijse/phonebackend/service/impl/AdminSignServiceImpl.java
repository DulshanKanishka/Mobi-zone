package lk.ijse.phonebackend.service.impl;


import lk.ijse.phonebackend.dto.AdminSignDto;
import lk.ijse.phonebackend.entity.AdminSign;
import lk.ijse.phonebackend.repository.AdminSignRepository;
import lk.ijse.phonebackend.service.AdminSignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
public class AdminSignServiceImpl implements AdminSignService {

//    @Autowired
//    private AdminSignRepository adminSignRepository;
//
//    @Override
//    @Transactional(propagation = Propagation.REQUIRED)
//    public AdminSignDto findAdminSignService(String id) {
//        return null;
//    }
//
//    @Override
//    @Transactional(propagation = Propagation.REQUIRED)
//    public boolean saveAdminSignService(AdminSignDto adminSignDto) {
//        adminSignRepository.save(new AdminSign(adminSignDto.getAdminemail(),adminSignDto.getAdminPassword()));
//        return true;
//    }
//
//    @Override
//    public List<AdminSignDto> getAllAdminSignService() {
//        List<AdminSign> all = adminSignRepository.findAll();
//        List<AdminSignDto>dtoList=new ArrayList<>();
//        all.forEach(adminSign -> {
//            dtoList.add(new AdminSignDto(adminSign.getAdminemail(),adminSign.getAdminPassword()));
//        });
//        return dtoList;
//    }
//
//    @Override
//    public long getTotalAdminSign() {
//        return 0;
//    }




    @Autowired
    private AdminSignRepository adminSignRepository;

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void saveAdminSign(AdminSignDto adminSignDto) {
        adminSignRepository.save(new AdminSign(adminSignDto.getAdminemail(),adminSignDto.getAdminPassword()));
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void updateAdminSign(AdminSignDto adminSignDto) {
        adminSignRepository.save(new AdminSign(adminSignDto.getAdminemail(),adminSignDto.getAdminPassword()));
    }

    @Override
    public void deleteAdminSign(String name) {
        adminSignRepository.deleteById(name);
    }

    @Override
    public AdminSignDto findAdminSign(String namee) {
        AdminSign adminSignDto= adminSignRepository.findById(namee).get();
        return new AdminSignDto(adminSignDto.getAdminemail(),adminSignDto.getAdminPassword());

    }

    @Override
    public List<AdminSignDto> findAllAdminSign() {
        List<AdminSign> allHomeList = adminSignRepository.findAll();
        List<AdminSignDto> dtos = new ArrayList<>();
        allHomeList.forEach(adminSignDto -> dtos.add(new AdminSignDto(adminSignDto.getAdminemail(),adminSignDto.getAdminPassword())));
        System.out.println("fgdfagdfgadfgafsdgsfdafsdgfgsdahgsdfa");
        return dtos;
    }

}
