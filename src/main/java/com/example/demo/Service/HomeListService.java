package com.example.demo.Service;



import java.util.List;

import com.example.demo.DTO.HomeListDto;

public interface HomeListService {
//    HomeListDto findHomeListService(String id);
//    boolean saveHomeListService(HomeListDto homeListDto);
//    List<HomeListDto> getAllHomeListService();
//    long getTotalHomeList();

    void saveHomeList(HomeListDto homeListDto);

    void updateHomeList(HomeListDto homeListDto);

    void deleteHomeList(String name);

    HomeListDto findHomeList(String namee);

    List<HomeListDto> findAllHomeList();

}
