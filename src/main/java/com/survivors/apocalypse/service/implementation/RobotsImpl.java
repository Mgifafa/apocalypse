package com.survivors.apocalypse.service.implementation;

import com.survivors.apocalypse.entity.Robots;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

public class RobotsImpl {

    @Value("${https://robotstakeover20210903110417.azurewebsites.net/robotcpu}")
    private String robotCpuUrl;

   /* private final RestTemplate restTemplate;

    public RobotService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<Robots> getAllRobots() {
        Robots[] robots = restTemplate.getForObject(robotCpuUrl, Robots[].class);
        return Arrays.asList(robots);
    }


    */
}
