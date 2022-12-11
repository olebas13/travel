package org.olebas.travel.app.model.entity.geography;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CityTest {
    private City city;

    @Before
    public void setup() {
        city = new City();
    }

    @Test
    public void testAddValidStationSuccess() {
        Station station = new Station();
        city.addStation(station);
        assertTrue(containsStation(city, station));
        assertEquals(city, station.getCity());
    }

    @Test(expected = NullPointerException.class)
    public void testAddNullStationFailure() {
        city.addStation(null);
        fail();
    }

    @Test
    public void testAddDuplicateStationFailure() {
        Station station = new Station();
        city.addStation(station);
        city.addStation(station);
        assertEquals(city.getStations().size(), 1);
    }

    @Test
    public void testRemoveStationSuccess() {
        Station station = new Station();
        city.addStation(station);
        city.removeStation(station);
        assertTrue(city.getStations().isEmpty());
    }

    private boolean containsStation(City city, Station station) {
        return city.getStations().contains(station);
    }
}
