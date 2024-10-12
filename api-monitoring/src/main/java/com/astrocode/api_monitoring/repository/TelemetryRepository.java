package com.astrocode.api_monitoring.repository;

import com.astrocode.api_monitoring.models.TelemetryData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TelemetryRepository extends JpaRepository<TelemetryData, Long> {
}
