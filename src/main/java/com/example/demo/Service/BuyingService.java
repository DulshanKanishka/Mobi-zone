package com.example.demo.Service;


import java.util.List;

import com.example.demo.DTO.BuyingDto;

public interface BuyingService {
//    BuyingDto findBuingService(String id);
//    boolean saveBuyingService(BuyingDto buyingDto);
//    List<BuyingDto> getAllBuingService();
//    long getTotalBuying();

    void saveBuying(BuyingDto buyingDto);

    void updateBuying(BuyingDto buyingDto);

    boolean deleteBuying(String phonename);

    BuyingDto findBuying(String name);

    List<BuyingDto> findAllBuying();

}
