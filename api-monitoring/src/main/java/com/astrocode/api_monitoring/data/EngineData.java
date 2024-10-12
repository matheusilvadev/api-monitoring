package com.astrocode.api_monitoring.data;

import jakarta.persistence.Embeddable;

@Embeddable
public record EngineData(double engineTemperature,
                         double oilPresure,
                         int rpm) {
}
