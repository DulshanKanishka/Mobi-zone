package com.example.demo.Service.Impl;


import com.example.demo.DTO.HomeListDto;
import com.example.demo.Entity.HomeList;
import com.example.demo.Repository.HomeListRepository;
import com.example.demo.Service.HomeListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
public class HomeListServiceImpl implements HomeListService {

//    @Autowired
//    private HomeListRepository homeListRepository;
//    @Override
//    public HomeListDto findHomeListService(String id) {
//        return null;
//    }
//
//    @Override
//    public boolean saveHomeListService(HomeListDto homeListDto) {
//        homeListRepository.save(new HomeList(homeListDto.getTypee(),homeListDto.getNamee(),homeListDto.getPrice(),homeListDto.getPhoto()));
//        return true;
//    }
//
//    @Override
//    public List<HomeListDto> getAllHomeListService() {
//        List<HomeList> all = homeListRepository.findAll();
//        List<HomeListDto>dtoList=new ArrayList<>();
//        all.forEach(homeList ->{
//            dtoList.add(new HomeListDto(homeList.getType(),homeList.getNamee(),homeList.getPrice(),homeList.getPhoto()));
//        });
//        return dtoList;
//    }
//
//    @Override
//    public long getTotalHomeList() {
//        return 0;
//    }


    @Autowired
    private HomeListRepository homeListRepository;

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void saveHomeList(HomeListDto homeListDto) {
        homeListRepository.save(new HomeList(homeListDto.getTypee(),homeListDto.getNamee(),homeListDto.getPrice()));
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void updateHomeList(HomeListDto homeListDto) {
        homeListRepository.save(new HomeList(homeListDto.getNamee(),homeListDto.getTypee(),homeListDto.getPrice()));
    }

    @Override
    public void deleteHomeList(String namee) {
        homeListRepository.deleteById(namee);
    }

    @Override
    public HomeListDto findHomeList(String namee) {
        HomeList homeListDto= homeListRepository.findById(namee).get();
        return new HomeListDto(homeListDto.getTypee(),homeListDto.getNamee(),homeListDto.getPrice());

    }

    @Override
    public List<HomeListDto> findAllHomeList() {
        List<HomeList> allHomeList = homeListRepository.findAll();
        List<HomeListDto> dtos = new ArrayList<>();
        allHomeList.forEach(homeListDto -> dtos.add(new HomeListDto(homeListDto.getTypee(),homeListDto.getNamee(),homeListDto.getPrice())));
        return dtos;
    }

}
