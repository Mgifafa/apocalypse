package com.survivors.apocalypse.service;

import com.survivors.apocalypse.entity.Infected;

public interface InfectedService {
    void flagSurvivorAsInfected(Infected infectedSurvivor);
    Infected getSurvivorById(Long survivorId);
    int countContaminationReports(Long survivorId);
}

