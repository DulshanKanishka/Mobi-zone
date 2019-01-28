package com.example.demo.Controller;
import com.example.demo.DTO.HomeListDto;
import com.example.demo.Service.HomeListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/homeList")
public class HomeListController {

//    @Autowired
//    private HomeListService homeListService;

    //
//    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
//    public List<HomeListDto> getAllHomeList(){
//        return homeListService.getAllHomeListService();
//    }
//
//    @GetMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
//    public HomeListDto findHomeList(@PathVariable("id") String id){
//        // System.out.println("Id is  :  "+id);
//        return homeListService.findHomeListService(id);
//    }
//
//    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
//    public boolean saveHomeList(@RequestBody HomeListDto homeListDto){
//        //  System.out.println(" id:  "+signUpDto.getId()+" name:  "+signUpDto.getName()+" price:  "+signUpDto.getPrice()+" desc:  "+signUpDto.getDescription()+" reserve type:  "+signUpDto.getReserveType()+" type:  "+signUpDto.getType()
//        // );
//        return homeListService.saveHomeListService(homeListDto);
//    }
//    @GetMapping(value = "/count", produces = MediaType.APPLICATION_JSON_VALUE)
//    public long getTotalHomeList(){
//        return homeListService.getTotalHomeList();
//    }
//

    @Autowired
    private HomeListService homeListService;


    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void saveHomeList(@RequestBody HomeListDto homeListDto) {
        homeListService.saveHomeList(homeListDto);
    }

    @DeleteMapping("/{id}")
    public void deleteHomeList(@PathVariable("id") String namee){
        homeListService.deleteHomeList(namee);
    }

    @PostMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateHomeList(@RequestBody HomeListDto homeListDto){
        homeListService.updateHomeList(homeListDto);
    }

    @GetMapping(value="/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public HomeListDto findHomeList(@PathVariable("id") String namee){
        return homeListService.findHomeList(namee);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<HomeListDto> findAllHomeList(){
        return homeListService.findAllHomeList();
    }
}
