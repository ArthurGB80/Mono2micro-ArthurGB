package com.arthurgb80.flight;

import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Readiness;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import jakarta.inject.Inject;

@Readiness
public class ReadnessCheck implements HealthCheck {

    @RestClient
    @Inject
    FlightService fightService;

    @RestClient
    @Inject
    HotelService hotelService;

    @Override
    public HealthCheckResponse call() {
        if ((fightService.findById(1) != null) && (hotelService.findById(1) != null)) {
            return HealthCheckResponse.up("Estou pronto");
        } else {
            return HealthCheckResponse.down("Não estou pronto");
        }

    }

}
