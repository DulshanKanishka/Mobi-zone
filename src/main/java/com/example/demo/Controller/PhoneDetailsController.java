package com.example.demo.Controller;
import com.example.demo.DTO.PhoneDetailsDto;
import com.example.demo.Service.PhoneDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/phone")
public class PhoneDetailsController {

    @Autowired
    private PhoneDetailsService phoneDetailsService;

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void savePhoneDetails(@RequestBody PhoneDetailsDto phoneDetailsDto) {
        phoneDetailsService.savePhoneDetails(phoneDetailsDto);
    }

    @DeleteMapping("/{id}")
    public void deletePhoneDetails(@PathVariable("id") String name){
        phoneDetailsService.deletePhoneDetails(name);
    }

    @PostMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updatePhoneDetails(@RequestBody PhoneDetailsDto phoneDetailsDto){
        phoneDetailsService.updatePhoneDetails(phoneDetailsDto);
    }

    @GetMapping(value="/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public  PhoneDetailsDto findPhoneDetails(@PathVariable("id") String name){
    	System.out.println(name);
        return phoneDetailsService.findPhoneDetails(name);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<PhoneDetailsDto> findAllPhoneDetails(){
        return phoneDetailsService.findAllPhoneDetails();
    }
//    @Autowired
//    private PhoneDetailsService phoneDetailsService;

//    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
//    public List<PhoneDetailsDto> getAllPhoneDetails(){
//        return phoneDetailsService.getallPhoneDetails();
//    }
//
//    @GetMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
//    public PhoneDetailsDto findPhoneDetails(@PathVariable("id") String id){
//        // System.out.println("Id is  :  "+id);
//        return phoneDetailsService.findphonedetails(id);
//    }
//
//    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
//    public boolean savePhoneDetails(@RequestBody PhoneDetailsDto phoneDetailsDto){
//        //  System.out.println(" id:  "+signUpDto.getId()+" name:  "+signUpDto.getName()+" price:  "+signUpDto.getPrice()+" desc:  "+signUpDto.getDescription()+" reserve type:  "+signUpDto.getReserveType()+" type:  "+signUpDto.getType()
//        // );
//        return phoneDetailsService.savePhoneDetails(phoneDetailsDto);
//    }
//    @GetMapping(value = "/count", produces = MediaType.APPLICATION_JSON_VALUE)
//    public long getPhoneDetails(){
//        return phoneDetailsService.getTotalPhoneDetails();
//    }


}
