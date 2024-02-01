package com.survivors.apocalypse.service.implementation;

import com.survivors.apocalypse.entity.Infected;
import com.survivors.apocalypse.repository.InfectedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class infectedServiceImpl {

    @Autowired
    private InfectedRepository infectedRepository;

    public void flagSurvivorAsInfected(Infected infected) {
        infectedRepository.save(infected);
    }
}
