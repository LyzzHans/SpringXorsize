package com.example.demo.Controller;


import com.example.demo.repos.AddressRepository;
import org.springframework.stereotype.Controller;

@Controller
public class AddressController {
    private AddressRepository addressRepo;

    public AddressController(AddressRepository addressRepo){
        this.addressRepo = addressRepo;
    }


}
