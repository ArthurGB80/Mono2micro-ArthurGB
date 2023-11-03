package com.arthurgb80.flight;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

@Entity
public class Flight extends PanacheEntity {

    public Long traveOrderId;
    public String fromAirport;
    public String toAirport;

    public static Flight findByTravelOrderId(Long travelOrderId) {
        return find("traveOrderId", travelOrderId).firstResult();
    }

}