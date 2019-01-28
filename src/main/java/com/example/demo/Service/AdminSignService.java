package com.example.demo.Service;


import java.util.List;

import com.example.demo.DTO.AdminSignDto;

public interface AdminSignService {
//    AdminSignDto findAdminSignService(String id);
//    boolean saveAdminSignService(AdminSignDto adminSignDto);
//    List<AdminSignDto> getAllAdminSignService();
//    long getTotalAdminSign();

    void saveAdminSign(AdminSignDto adminSignDto);

    void updateAdminSign(AdminSignDto adminSignDto);

    void deleteAdminSign(String name);

    AdminSignDto findAdminSign(String name);

    List<AdminSignDto> findAllAdminSign();

}
