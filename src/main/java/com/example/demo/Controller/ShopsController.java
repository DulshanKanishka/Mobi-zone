package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.DTO.ShopsDto;
import com.example.demo.Service.ShopsService;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/shops")
public class ShopsController {

	 @Autowired
	    private ShopsService shopsService;

	    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	    public void saveShops(@RequestBody ShopsDto shopsDto) {
	    	shopsService.saveShops(shopsDto);
	    }

	    @DeleteMapping("/{id}")
	    public void deleteShops(@PathVariable("id") String name){
	    	shopsService.deleteShops(name);
	    }

	    @PostMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	    public void updateShops(@RequestBody ShopsDto shopsDto){
	    	shopsService.updateShops(shopsDto);
	    }

	    @GetMapping(value="/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	    public  ShopsDto findShops(@PathVariable("id") String name){
	    	System.out.println(name);
	        return shopsService.findShops(name);
	    }

	    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	    public List<ShopsDto> findAllShops(){
	        return shopsService.findAllShops();
	    }
}
