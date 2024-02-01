package com.survivors.apocalypse.service;

import com.survivors.apocalypse.entity.Survivors;

import java.util.List;

public interface SurvivorsService {

    //void addSurvivor(Survivors survivors);

    //void addSurvivors(Survivors survivors);


    //List<Survivors> getSurvivors();

    Survivors createSurvivor (Survivors survivor);

    Survivors updateLocation(Integer survivor_id, Survivors updatedSurvivor);


    int countContaminationReports(Long survivorId);


     Survivors SurvivorById(Long survivorId);

    Object getSurvivorById(Integer survivorId);
}
