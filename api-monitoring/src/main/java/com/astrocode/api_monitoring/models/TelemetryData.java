package com.astrocode.api_monitoring.models;

import com.astrocode.api_monitoring.data.*;
import jakarta.persistence.*;

@Entity
public class TelemetryData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long shipId;

    @ManyToOne
    @JoinColumn(name = "nave_id")
    private NaveModel nave;

    @Embedded
    private ConditionsMetData conditionsMetData;

    @Embedded
    private EngineData engineData;

    @Embedded
    private EnvironmentalData environmentalData;

    @Embedded
    private FlyStateData flyStateData;

    @Embedded
    private NavigationData navigationData;

    @Embedded
    private PositionData positionData;

    public Long getShipId() {
        return shipId;
    }

    public void setShipId(Long shipId) {
        this.shipId = shipId;
    }

    public NaveModel getNave() {
        return nave;
    }

    public void setNave(NaveModel nave) {
        this.nave = nave;
    }

    public ConditionsMetData getConditionsMetData() {
        return conditionsMetData;
    }

    public void setConditionsMetData(ConditionsMetData conditionsMetData) {
        this.conditionsMetData = conditionsMetData;
    }

    public EngineData getEngineData() {
        return engineData;
    }

    public void setEngineData(EngineData engineData) {
        this.engineData = engineData;
    }

    public EnvironmentalData getEnvironmentalData() {
        return environmentalData;
    }

    public void setEnvironmentalData(EnvironmentalData environmentalData) {
        this.environmentalData = environmentalData;
    }

    public FlyStateData getFlyStateData() {
        return flyStateData;
    }

    public void setFlyStateData(FlyStateData flyStateData) {
        this.flyStateData = flyStateData;
    }

    public NavigationData getNavigationData() {
        return navigationData;
    }

    public void setNavigationData(NavigationData navigationData) {
        this.navigationData = navigationData;
    }

    public PositionData getPositionData() {
        return positionData;
    }

    public void setPositionData(PositionData positionData) {
        this.positionData = positionData;
    }
}
