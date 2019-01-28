package com.example.demo.Controller;

import com.example.demo.DTO.BuyingDto;
import com.example.demo.Service.BuyingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/buying")
public class BuyingController {
//    @Autowired
//    private BuyingService buyingService;

//    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
//    public List<BuyingDto> getAllBuying(){
//        return buyingService.getAllBuingService();
//    }
//
//    @GetMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
//    public BuyingDto findBuying(@PathVariable("id") String id){
//        // System.out.println("Id is  :  "+id);
//        return buyingService.findBuingService(id);
//    }
//
//    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
//    public boolean saveBuying(@RequestBody BuyingDto buyingDto){
//        //  System.out.println(" id:  "+signUpDto.getId()+" name:  "+signUpDto.getName()+" price:  "+signUpDto.getPrice()+" desc:  "+signUpDto.getDescription()+" reserve type:  "+signUpDto.getReserveType()+" type:  "+signUpDto.getType()
//        // );
//        return buyingService.saveBuyingService(buyingDto);
//    }
//    @GetMapping(value = "/count", produces = MediaType.APPLICATION_JSON_VALUE)
//    public long getTotalBuying(){
//        return buyingService.getTotalBuying();
//    }

    @Autowired
    private BuyingService buyingService;


    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void saveBuying(@RequestBody BuyingDto buyingDto) {
        buyingService.saveBuying(buyingDto);
    }

    @DeleteMapping(value ="/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean deleteBuying(@PathVariable("id") String phonename){
        return buyingService.deleteBuying(phonename);
    }
//    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
//    public boolean deleteCustomer(@PathVariable("id") String customerId) {
//        return service.deleteCustomer(customerId);
//    }

    @PostMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateBuying(@RequestBody BuyingDto buyingDto){
        buyingService.updateBuying(buyingDto);
    }

    @GetMapping(value="/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public BuyingDto findBuying(@PathVariable("id") String namee){
        return buyingService.findBuying(namee);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<BuyingDto> findAllBuying() {
        return buyingService.findAllBuying();
    }

}
