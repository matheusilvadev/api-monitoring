package com.astrocode.api_monitoring.dtos;

import com.astrocode.api_monitoring.enums.StatusNave;
import com.astrocode.api_monitoring.models.TelemetryData;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToMany;

import java.util.List;

public record NaveDto (String name,
                      StatusNave status,
                      List<TelemetryData> telemetryDataList){

}
