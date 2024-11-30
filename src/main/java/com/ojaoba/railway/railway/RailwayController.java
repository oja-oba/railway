package com.ojaoba.railway.railway;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path="/api/v1/")
@RestController()
public class RailwayController {

    @Value("${ore}")
    private String ella;


    @GetMapping()
    public  String sayHello(){

        return ella;
    }

}
