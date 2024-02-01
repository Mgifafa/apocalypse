package com.survivors.apocalypse.controller;

import com.survivors.apocalypse.entity.Infected;
import com.survivors.apocalypse.service.InfectedService;
import com.survivors.apocalypse.service.SurvivorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/infected")
public class InfectedController {


        @Autowired
        private InfectedService infectedService;

        @Autowired
        private SurvivorsService survivorService;

        @PostMapping("/flag")
        public void flagSurvivorAsInfected(@RequestParam Integer survivorId) {
            // Check if the survivor has been reported by at least three other survivors
            if (survivorService.countContaminationReports(Long.valueOf(survivorId)) >= 3) {
                // Flag the survivor as infected
                Infected infectedSurvivor = new Infected((Infected) survivorService.getSurvivorById(survivorId));
                infectedService.flagSurvivorAsInfected(infectedSurvivor);
            }

        }



}
