package com.astrocode.api_monitoring.data;


import jakarta.persistence.Embeddable;

@Embeddable
public record NavigationData(double course,
                             String actualWayPoint,
                             double distanceToDestination) {
}
