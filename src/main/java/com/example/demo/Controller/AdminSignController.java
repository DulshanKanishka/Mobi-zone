package com.example.demo.Controller;

import com.example.demo.DTO.AdminSignDto;
import com.example.demo.Service.AdminSignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/adminsign")
public class AdminSignController {

//    @Autowired
//    private AdminSignService adminSignService;

//    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
//    public List<AdminSignDto> getAllAdminSign(){
//        return adminSignService.getAllAdminSignService();
//    }
//
//    @GetMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
//    public AdminSignDto findAdminSign(@PathVariable("id") String id){
//        // System.out.println("Id is  :  "+id);
//        return adminSignService.findAdminSignService(id);
//    }
//
//    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
//    public boolean saveAdminSign(@RequestBody AdminSignDto adminSignDto){
//        //  System.out.println(" id:  "+signUpDto.getId()+" name:  "+signUpDto.getName()+" price:  "+signUpDto.getPrice()+" desc:  "+signUpDto.getDescription()+" reserve type:  "+signUpDto.getReserveType()+" type:  "+signUpDto.getType()
//        // );
//        return adminSignService.saveAdminSignService(adminSignDto);
//    }
//    @GetMapping(value = "/count", produces = MediaType.APPLICATION_JSON_VALUE)
//    public long getTotalAdminSign(){
//        return adminSignService.getTotalAdminSign();
//    }

    @Autowired
    private AdminSignService adminSignService;

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void saveAdminSign(@RequestBody AdminSignDto adminSignDto) {
        adminSignService.saveAdminSign(adminSignDto);
    }

    @DeleteMapping("/{id}")
    public void deleteAdminSign(@PathVariable("id") String namee){
        adminSignService.deleteAdminSign(namee);
    }

    @PostMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateAdminSign(@RequestBody AdminSignDto adminSignDto){
        adminSignService.updateAdminSign(adminSignDto);
    }

    @GetMapping(value="/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public AdminSignDto findAdminSign(@PathVariable("id") String namee){
        return adminSignService.findAdminSign(namee);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<AdminSignDto> findAllAdminSign() {
        return adminSignService.findAllAdminSign();
    }
}
