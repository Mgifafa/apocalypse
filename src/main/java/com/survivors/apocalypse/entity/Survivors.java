package com.survivors.apocalypse.entity;
import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "survivor")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Survivors {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;


    @Column(name = "survivor_id")
    private Integer survivorId;

    @Column(name = "age")
    private Integer age;

    @Column(name = "ammunition")
    private boolean ammunition;

    @Column(name = "food")
    private boolean food;

    @Column(name = "gender")
    private String gender;

    @Column(name = "location")
    private String location;

    @Column(name = "medication")
    private boolean medication;

    @Column(name = "water")
    private boolean water;

    @Column(name = "infected")
    private boolean infected;


}
