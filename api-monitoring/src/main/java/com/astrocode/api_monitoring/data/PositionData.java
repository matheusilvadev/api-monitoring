package com.astrocode.api_monitoring.data;


import jakarta.persistence.Embeddable;

@Embeddable
public record PositionData(double latitude,
                           double longitude,
                           double altitude,
                           double speed) {
}
