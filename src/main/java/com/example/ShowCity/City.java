package com.example.ShowCity;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "city")
@Data
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name="Name")
    private String name;
    @Column(name="CountryCode")
    private String countryCode ;
    @Column(name = "District")
    private String district ;
    @Column(name="Population")
    private int Population;
}
