package com.survivors.apocalypse.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "robots")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Robots {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "type")
    private String type;

    @Column(name = "location")
    private String location;

    @Column(name = "model")
    private String model;

    @Column(name = "manufacture_date")
    private String manufactureDate;

}
