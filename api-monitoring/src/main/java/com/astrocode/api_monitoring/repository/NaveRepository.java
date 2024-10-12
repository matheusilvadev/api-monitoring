package com.astrocode.api_monitoring.repository;

import com.astrocode.api_monitoring.models.NaveModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NaveRepository extends JpaRepository<NaveModel, Long> {
}
