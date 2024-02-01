package com.survivors.apocalypse.repository;

import com.survivors.apocalypse.entity.Survivors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
public interface SurvivorsRepository extends JpaRepository<Survivors,Integer>{




}
