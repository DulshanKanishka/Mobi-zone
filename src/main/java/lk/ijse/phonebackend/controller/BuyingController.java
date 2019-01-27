package lk.ijse.phonebackend.controller;


import lk.ijse.phonebackend.dto.BuyingDto;
import lk.ijse.phonebackend.service.BuyingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/buying")
public class BuyingController {


    @Autowired
    private BuyingService buyingService;


    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void saveBuying(@RequestBody BuyingDto buyingDto) {
        buyingService.saveBuying(buyingDto);
    }

    @DeleteMapping("/{id}")
    public void deleteBuying(@PathVariable("id") String namee){
        buyingService.deleteBuying(namee);
    }

    @PostMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateBuying(@RequestBody BuyingDto buyingDto){
        buyingService.updateBuying(buyingDto);
    }

    @GetMapping(value="/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public BuyingDto findBuying(@PathVariable("id") String namee){
        return buyingService.findBuying(namee);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<BuyingDto> findAllBuying() {
        return buyingService.findAllBuying();
    }

}
