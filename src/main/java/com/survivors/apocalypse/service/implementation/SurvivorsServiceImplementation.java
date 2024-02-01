package com.survivors.apocalypse.service.implementation;

import com.survivors.apocalypse.entity.Survivors;
import com.survivors.apocalypse.repository.SurvivorsRepository;
import com.survivors.apocalypse.service.SurvivorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SurvivorsServiceImplementation  implements SurvivorsService {

   @Autowired
    private SurvivorsRepository survivorsRepository;
  /*  @Override
    public void addSurvivor(Survivors survivors) {
             survivorsRepository.save(survivors);
    }

    @Override
    public void addSurvivors(Survivors survivors) {

    }


    @Override
    public List<Survivors> getSurvivors() {
        return survivorsRepository.findAll();
    }

   */

    @Override
    public Survivors createSurvivor (Survivors survivor){
        survivorsRepository.save(survivor);
        return survivor;
    }



    public Survivors updateLocation(Integer survivor_id, Survivors updatedSurvivor) {
        Optional<Survivors> optionalSurvivor = survivorsRepository.findById(survivor_id);
        if (optionalSurvivor.isPresent()) {
            Survivors survivor = optionalSurvivor.get();
            survivor.setLocation(updatedSurvivor.getLocation());
            return survivorsRepository.save(survivor);
        }
        return null; // Handle error appropriately
    }

    @Override
    public int countContaminationReports(Long survivorId) {
        return 0;
    }

    @Override
    public Survivors SurvivorById(Long survivorId) {
        return null;
    }

    public Survivors getSurvivorById(Integer survivorId) {
        Optional<Survivors> optionalSurvivor = survivorsRepository.findById(survivorId);
        return optionalSurvivor.orElse(null);

    }
}



