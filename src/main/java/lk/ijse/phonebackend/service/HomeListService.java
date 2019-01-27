package lk.ijse.phonebackend.service;

import lk.ijse.phonebackend.dto.HomeListDto;

import java.util.List;

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
