package org.olebas.travel.app.service.impl;

import org.olebas.travel.app.infra.util.CommonUtil;
import org.olebas.travel.app.model.entity.geography.City;
import org.olebas.travel.app.service.GeographicService;

import java.util.ArrayList;
import java.util.List;

public class GeographicServiceImpl implements GeographicService {
    private final List<City> cities;

    public GeographicServiceImpl() {
        cities = new ArrayList<>();
    }

    @Override
    public List<City> findCities() {
        return CommonUtil.getSafeList(cities);
    }

    @Override
    public void saveCity(City city) {
        if (!cities.contains(city)) {
            cities.add(city);
        }
    }
}
