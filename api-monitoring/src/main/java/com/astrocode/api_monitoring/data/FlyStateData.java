package com.astrocode.api_monitoring.data;

import jakarta.persistence.Embeddable;

@Embeddable
public record FlyStateData(double altitudeNave,
                           double airSpeed,
                           double verticalSpeed) {
}
