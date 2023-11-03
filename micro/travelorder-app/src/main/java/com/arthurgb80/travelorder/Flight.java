package com.arthurgb80.travelorder;

public class Flight {

    private Long id;
    private Long traveOrderId;
    private String fromAirport;
    private String toAirport;

    public Flight() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTraveOrderId() {
        return traveOrderId;
    }

    public void setTraveOrderId(Long traveOrderId) {
        this.traveOrderId = traveOrderId;
    }

    public String getFromAirport() {
        return fromAirport;
    }

    public void setFromAirport(String fromAirport) {
        this.fromAirport = fromAirport;
    }

    public String getToAirport() {
        return toAirport;
    }

    public void setToAirport(String toAirport) {
        this.toAirport = toAirport;
    }

}
