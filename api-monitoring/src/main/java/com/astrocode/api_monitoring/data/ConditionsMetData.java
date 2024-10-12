package com.astrocode.api_monitoring.data;

import jakarta.persistence.Embeddable;

@Embeddable
public record ConditionsMetData(double wind,
                                double visibility,
                                double precipitation) {
}
