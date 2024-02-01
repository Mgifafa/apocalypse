package com.survivors.apocalypse.controller;

import com.survivors.apocalypse.entity.Survivors;
import com.survivors.apocalypse.repository.SurvivorsRepository;
import com.survivors.apocalypse.service.SurvivorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("survivor")
public class SurvivorsController {

    @Autowired
    private SurvivorsService survivorsService;

    @Autowired
    private SurvivorsRepository survivorsRepository;

    // for adding survivors
    @PostMapping("create")
    public ResponseEntity<Survivors> createSurvivor(@RequestBody  Survivors survivors){

        return new ResponseEntity<>(survivorsService.createSurvivor(survivors), HttpStatus.CREATED);
    }

// for updating location
   @PutMapping("/{survivor_id}")
public Survivors updateLocation(@PathVariable Integer survivor_id, @RequestBody Survivors updatedSurvivor) {
    Survivors survivor = survivorsRepository.findById(survivor_id).orElse(null);
    if (survivor != null) {
        survivor.setLocation(updatedSurvivor.getLocation());
        return survivorsRepository.save(survivor);
    }
    return null; // Handle error appropriately



}






}
