package org.olebas.travel.app.model.entity.geography;

import org.junit.Before;
import org.junit.Test;
import org.olebas.travel.app.model.entity.transport.TransportType;

import static org.junit.Assert.*;

public class CityTest {
    private City city;

    @Before
    public void setup() {
        city = new City("Kyiv");
    }

    @Test
    public void testAddValidStationSuccess() {
        Station station = city.addStation(TransportType.AUTO);

        assertTrue(containsStation(city, station));
        assertEquals(city, station.getCity());
    }

    @Test(expected = NullPointerException.class)
    public void testAddNullStationFailure() {
        city.addStation(null);
        fail();
    }

    @Test
    public void testRemoveStationSuccess() {
        Station station = city.addStation(TransportType.AVIA);

        city.removeStation(station);
        assertTrue(city.getStations().isEmpty());
    }

    @Test(expected = NullPointerException.class)
    public void testRemoveNullStationFailure() {
        city.removeStation(null);
        fail();
    }

    private boolean containsStation(City city, Station station) {
        return city.getStations().contains(station);
    }
}
