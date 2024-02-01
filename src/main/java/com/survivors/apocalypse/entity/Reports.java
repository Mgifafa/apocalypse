package com.survivors.apocalypse.entity;

import jakarta.persistence.*;
import lombok.*;
@Entity
@Table(name = "reports")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Reports {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "reporter_id")
    private Survivors reporter;

    @ManyToOne
    @JoinColumn(name = "infected_survivor_id")
    private Survivors infectedSurvivor;

}
