package com.survivors.apocalypse.entity;
import lombok.*;
import jakarta.persistence.*;
@Entity
@Table(name = "resources")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Resources {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "survivor_id")
    private Survivors survivor;


}
