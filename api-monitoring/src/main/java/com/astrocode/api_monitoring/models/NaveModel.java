package com.astrocode.api_monitoring.models;


import com.astrocode.api_monitoring.enums.StatusNave;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class NaveModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private StatusNave status;

    @OneToMany(mappedBy = "nave")  // Relacionamento de um-para-muitos
    private List<TelemetryData> telemetryDataList;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StatusNave getStatus() {
        return status;
    }

    public void setStatus(StatusNave status) {
        this.status = status;
    }

    public List<TelemetryData> getTelemetryDataList() {
        return telemetryDataList;
    }

    public void setTelemetryDataList(List<TelemetryData> telemetryDataList) {
        this.telemetryDataList = telemetryDataList;
    }
}
