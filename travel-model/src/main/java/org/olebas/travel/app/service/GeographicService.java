package org.olebas.travel.app.service;

import org.olebas.travel.app.model.entity.geography.City;

import java.util.List;

public interface GeographicService {
    List<City> findCities();
    void saveCity(City city);
}
