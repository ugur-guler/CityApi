package com.example.ShowCity;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@AllArgsConstructor
public class CityManager implements ICityManager{
    @Autowired
    private CityRepository repository;
    @Override
    public List<City> showAllCity() {
        return (List<City>) repository.findAll();
    }
}
