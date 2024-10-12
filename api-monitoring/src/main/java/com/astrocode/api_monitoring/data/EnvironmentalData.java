package com.astrocode.api_monitoring.data;

import jakarta.persistence.Embeddable;

@Embeddable
public record EnvironmentalData(double externalTemperature,
                                double pressureAtm) {
}
