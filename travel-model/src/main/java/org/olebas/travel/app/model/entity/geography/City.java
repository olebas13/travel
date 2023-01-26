package org.olebas.travel.app.model.entity.geography;

import org.olebas.travel.app.infra.util.CommonUtil;
import org.olebas.travel.app.model.entity.base.AbstractEntity;
import org.olebas.travel.app.model.entity.transport.TransportType;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class City extends AbstractEntity {
    private String name;
    private String district;
    private String region;
    private Set<Station> stations;

    public City(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Set<Station> getStations() {
        return CommonUtil.getSafeSet(stations);
    }

    public void setStations(Set<Station> stations) {
        this.stations = stations;
    }

    public Station addStation(final TransportType transportType) {
        if (stations == null) {
            stations = new HashSet<>();
        }
        Station station = new Station(this, transportType);
        stations.add(station);

        return station;
    }

    public void removeStation(Station station) {
        Objects.requireNonNull(station, "station parameter is not initialized");
        if (station == null) {
            return;
        }
        stations.remove(station);
    }
}
