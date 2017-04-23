package com.nyaaya.services;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by root on 23/4/17.
 */
public enum City {

    BANGALORE(1),KOLKATA(3),CHENNAI(3), MUMBAI(4), BOMBAY(4), DELHI(5),CALCUTTA(3),HYDERABAD(2);

    Integer id;

    City(Integer id){
        this.id = id;
    }

    public List<City> getCityByIds(Integer id){
        List<City> cities = new ArrayList<City>();
        for(City city : City.values()){
            if(city.id == id)
                cities.add(city);
        }
        return cities;
    }


}
