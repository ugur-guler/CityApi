package com.example.ShowCity;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class Controller {
    @Autowired
    private ICityManager cityManager ;
    @GetMapping("/cities")
    public List<City> showAll(){
        return cityManager.showAllCity();
    }

}
