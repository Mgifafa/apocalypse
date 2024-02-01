package com.survivors.apocalypse.entity;
import jakarta.persistence.*;
import lombok.*;



@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "infected_survivor")

public class Infected {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;

    @OneToOne
    @JoinColumn(name = "survivor_id")
    private Survivors survivor;


    public Infected(Infected survivorById) {
    }
}
