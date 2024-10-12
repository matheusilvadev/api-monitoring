package com.astrocode.api_monitoring.controllers;


import com.astrocode.api_monitoring.dtos.NaveDto;
import com.astrocode.api_monitoring.models.NaveModel;
import com.astrocode.api_monitoring.services.NaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/nave")
public class NaveController {

    @Autowired
    NaveService naveService;

    @GetMapping
    public ResponseEntity<List<NaveModel>> getAllNaves(){
        List<NaveModel> naves = this.naveService.getAllNaves();
        return new ResponseEntity<>(naves, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<NaveModel> createNave(@RequestBody NaveDto nave){
        NaveModel newNave = naveService.addNave(nave);
        return new ResponseEntity<>(newNave, HttpStatus.CREATED);
    }
}
