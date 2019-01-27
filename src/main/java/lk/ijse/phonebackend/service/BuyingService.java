package lk.ijse.phonebackend.service;

import lk.ijse.phonebackend.dto.BuyingDto;

import java.util.List;

public interface BuyingService {
//    BuyingDto findBuingService(String id);
//    boolean saveBuyingService(BuyingDto buyingDto);
//    List<BuyingDto> getAllBuingService();
//    long getTotalBuying();

    void saveBuying(BuyingDto buyingDto);

    void updateBuying(BuyingDto buyingDto);

    void deleteBuying(String name);

    BuyingDto findBuying(String name);

    List<BuyingDto> findAllBuying();

}
