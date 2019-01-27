package lk.ijse.phonebackend.service.impl;


import lk.ijse.phonebackend.dto.BuyingDto;
import lk.ijse.phonebackend.entity.Buying;
import lk.ijse.phonebackend.repository.BuyingRepository;
import lk.ijse.phonebackend.service.BuyingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
public class BuyingServiceImpl implements BuyingService {

//
//    @Autowired
//    private BuyingRepository buyingRepository;
//
//    @Override
//    public BuyingDto findBuingService(String id) {
//        return null;
//    }
//
//    @Override
//    @Transactional(propagation = Propagation.REQUIRED)
//    public boolean saveBuyingService(BuyingDto buyingDto) {
//        buyingRepository.save(new Buying(buyingDto.getPhonename(),buyingDto.getQty(),buyingDto.getBuynigPrice(),buyingDto.getSellingPrice(),buyingDto.getDescription(),buyingDto.getSupplier()));
//        return true;
//    }
//
//    @Override
//    public List<BuyingDto> getAllBuingService() {
//        List<Buying> all = buyingRepository.findAll();
//        List<BuyingDto>dtoList=new ArrayList<>();
//        all.forEach(buying -> {
//            dtoList.add(new BuyingDto(buying.getPhonename(),buying.getQty(),buying.getBuynigPrice(),buying.getSellingPrice(),buying.getDescription(),buying.getSupplier()));
//        });
//        return dtoList;
//    }
//
//    @Override
//    public long getTotalBuying() {
//        return 0;
//    }



    @Autowired
    private BuyingRepository buyingRepository;

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void saveBuying(BuyingDto buyingDto) {
        buyingRepository.save(new Buying(buyingDto.getPhonename(),buyingDto.getQty(),buyingDto.getBuynigPrice(),buyingDto.getSellingPrice(),buyingDto.getDescription(),buyingDto.getSupplier()));
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void updateBuying(BuyingDto buyingDto) {
        buyingRepository.save(new Buying(buyingDto.getPhonename(),buyingDto.getQty(),buyingDto.getBuynigPrice(),buyingDto.getSellingPrice(),buyingDto.getDescription(),buyingDto.getSupplier()));
    }

    @Override
    public void deleteBuying(String name) {
        buyingRepository.deleteById(name);
    }

    @Override
    public BuyingDto findBuying(String namee) {
        Buying buyingDto= buyingRepository.findById(namee).get();
        return new BuyingDto(buyingDto.getPhonename(),buyingDto.getQty(),buyingDto.getBuynigPrice(),buyingDto.getSellingPrice(),buyingDto.getDescription(),buyingDto.getSupplier());

    }

    @Override
    public List<BuyingDto> findAllBuying() {
        List<Buying> allHomeList = buyingRepository.findAll();
        List<BuyingDto> dtos = new ArrayList<>();
        allHomeList.forEach(buyingDto -> dtos.add(new BuyingDto(buyingDto.getPhonename(),buyingDto.getQty(),buyingDto.getBuynigPrice(),buyingDto.getSellingPrice(),buyingDto.getDescription(),buyingDto.getSupplier())));
        return dtos;
    }

}
