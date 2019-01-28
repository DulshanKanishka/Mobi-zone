package com.example.demo.Service.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.DTO.ShopsDto;
import com.example.demo.Entity.Shops;
import com.example.demo.Repository.ShopsRepository;
import com.example.demo.Service.ShopsService;

@Service
@Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
public class ShopsServiceImpl implements ShopsService {
	
    @Autowired
    private ShopsRepository shopsRepository;

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void saveShops(ShopsDto shopsDto) {
    	shopsRepository.save(new Shops(shopsDto.getPname(),shopsDto.getPlace(),shopsDto.getSname()));
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void updateShops(ShopsDto shopsDto) {
    	shopsRepository.save(new Shops(shopsDto.getPname(),shopsDto.getPlace(),shopsDto.getSname()));
    }

    @Override
    public void deleteShops(String name) {
    	shopsRepository.deleteById(name);
    }

    @Override
    public ShopsDto findShops(String name) {
        Shops shopsDto= shopsRepository.findById(name).get();
        System.out.println(shopsDto.getPname());
        return new ShopsDto(shopsDto.getPname(),shopsDto.getPlace(),shopsDto.getSname());

    }

    @Override
    public List<ShopsDto> findAllShops() {
        List<Shops> allshops = shopsRepository.findAll();
        List<ShopsDto> dtos = new ArrayList<>();
        allshops.forEach(shopsDto -> dtos.add(new ShopsDto(shopsDto.getPname(),shopsDto.getPlace(),shopsDto.getSname())));
        return dtos;
    }

	

}
