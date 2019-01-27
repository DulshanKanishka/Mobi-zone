package lk.ijse.phonebackend.controller;

import lk.ijse.phonebackend.dto.SignUpDto;
import lk.ijse.phonebackend.service.SignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/sign")
public class SignUpController {

    @Autowired
    private SignUpService signUpService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<SignUpDto> getAllSignUp(){
       return signUpService.getAllSignUpService();
    }

    @GetMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public SignUpDto findSignUp(@PathVariable("id") String id){
       // System.out.println("Id is  :  "+id);
        return signUpService.findSignUpService(id);
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
    public boolean saveSignUp(@RequestBody SignUpDto signUpDto){
      //  System.out.println(" id:  "+signUpDto.getId()+" name:  "+signUpDto.getName()+" price:  "+signUpDto.getPrice()+" desc:  "+signUpDto.getDescription()+" reserve type:  "+signUpDto.getReserveType()+" type:  "+signUpDto.getType()
       // );
        return signUpService.saveSignUpService(signUpDto);
    }
    @GetMapping(value = "/count", produces = MediaType.APPLICATION_JSON_VALUE)
    public long getTotalSignUp(){
        return signUpService.getTotalSignUp();
    }
}
