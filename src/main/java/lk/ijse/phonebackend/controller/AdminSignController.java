package lk.ijse.phonebackend.controller;

import lk.ijse.phonebackend.dto.AdminSignDto;
import lk.ijse.phonebackend.service.AdminSignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/adminsign")
public class AdminSignController {

    @Autowired
    private AdminSignService adminSignService;

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void saveAdminSign(@RequestBody AdminSignDto adminSignDto) {
        adminSignService.saveAdminSign(adminSignDto);
    }

    @DeleteMapping("/{id}")
    public void deleteAdminSign(@PathVariable("id") String namee){
        adminSignService.deleteAdminSign(namee);
    }

    @PostMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateAdminSign(@RequestBody AdminSignDto adminSignDto){
        adminSignService.updateAdminSign(adminSignDto);
    }

    @GetMapping(value="/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public AdminSignDto findAdminSign(@PathVariable("id") String namee){
        return adminSignService.findAdminSign(namee);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<AdminSignDto> findAllAdminSign() {
        return adminSignService.findAllAdminSign();
    }
}
