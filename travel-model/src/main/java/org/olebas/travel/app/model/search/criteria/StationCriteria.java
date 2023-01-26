package org.olebas.travel.app.model.search.criteria;

import org.olebas.travel.app.model.entity.transport.TransportType;

public class StationCriteria {
    private String name;
    private TransportType transportType;
    private String address;

    public StationCriteria byName(String name) {
        return new StationCriteria(name);
    }

    public StationCriteria() {

    }

    private StationCriteria(final String name) {
        this.name = name;
    }

    public StationCriteria(final TransportType transportType) {
        this.transportType = transportType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TransportType getTransportType() {
        return transportType;
    }

    public void setTransportType(TransportType transportType) {
        this.transportType = transportType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
