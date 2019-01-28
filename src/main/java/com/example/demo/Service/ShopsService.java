package com.example.demo.Service;

import java.util.List;

import com.example.demo.DTO.ShopsDto;


public interface ShopsService {
    void saveShops(ShopsDto shopsDto);

    void updateShops(ShopsDto shopsDto);

    void deleteShops(String name);

    ShopsDto findShops(String name);

    List<ShopsDto> findAllShops();
}
