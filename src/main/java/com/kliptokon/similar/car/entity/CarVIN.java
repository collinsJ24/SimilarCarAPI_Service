package com.kliptokon.similar.car.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties
public class CarVIN {



    @JsonProperty("ABS")
    public String aBS;
    @JsonProperty("ActiveSafetySysNote")
    public String activeSafetySysNote;
    @JsonProperty("AdaptiveCruiseControl")
    public String adaptiveCruiseControl;
    @JsonProperty("AdaptiveDrivingBeam")
    public String adaptiveDrivingBeam;
    @JsonProperty("AdaptiveHeadlights")
    public String adaptiveHeadlights;
    @JsonProperty("AdditionalErrorText")
    public String additionalErrorText;
    @JsonProperty("AirBagLocCurtain")
    public String airBagLocCurtain;
    @JsonProperty("AirBagLocFront")
    public String airBagLocFront;
    @JsonProperty("AirBagLocKnee")
    public String airBagLocKnee;
    @JsonProperty("AirBagLocSeatCushion")
    public String airBagLocSeatCushion;
    @JsonProperty("AirBagLocSide")
    public String airBagLocSide;
    @JsonProperty("AutoReverseSystem")
    public String autoReverseSystem;
    @JsonProperty("AutomaticPedestrianAlertingSound")
    public String automaticPedestrianAlertingSound;
    @JsonProperty("AxleConfiguration")
    public String axleConfiguration;
    @JsonProperty("Axles")
    public String axles;
    @JsonProperty("BasePrice")
    public String basePrice;
    @JsonProperty("BatteryA")
    public String batteryA;
    @JsonProperty("BatteryA_to")
    public String batteryA_to;
    @JsonProperty("BatteryCells")
    public String batteryCells;
    @JsonProperty("BatteryInfo")
    public String batteryInfo;
    @JsonProperty("BatteryKWh")
    public String batteryKWh;
    @JsonProperty("BatteryKWh_to")
    public String batteryKWh_to;
    @JsonProperty("BatteryModules")
    public String batteryModules;
    @JsonProperty("BatteryPacks")
    public String batteryPacks;
    @JsonProperty("BatteryType")
    public String batteryType;
    @JsonProperty("BatteryV")
    public String batteryV;
    @JsonProperty("BatteryV_to")
    public String batteryV_to;
    @JsonProperty("BedLengthIN")
    public String bedLengthIN;
    @JsonProperty("BedType")
    public String bedType;
    @JsonProperty("BlindSpotIntervention")
    public String blindSpotIntervention;
    @JsonProperty("BlindSpotMon")
    public String blindSpotMon;
    @JsonProperty("BodyCabType")
    public String bodyCabType;
    @JsonProperty("BodyClass")
    public String bodyClass;
    @JsonProperty("BrakeSystemDesc")
    public String brakeSystemDesc;
    @JsonProperty("BrakeSystemType")
    public String brakeSystemType;
    @JsonProperty("BusFloorConfigType")
    public String busFloorConfigType;
    @JsonProperty("BusLength")
    public String busLength;
    @JsonProperty("BusType")
    public String busType;
    @JsonProperty("CAN_AACN")
    public String cAN_AACN;
    @JsonProperty("CIB")
    public String cIB;
    @JsonProperty("CashForClunkers")
    public String cashForClunkers;
    @JsonProperty("ChargerLevel")
    public String chargerLevel;
    @JsonProperty("ChargerPowerKW")
    public String chargerPowerKW;
    @JsonProperty("CoolingType")
    public String coolingType;
    @JsonProperty("CurbWeightLB")
    public String curbWeightLB;
    @JsonProperty("CustomMotorcycleType")
    public String customMotorcycleType;
    @JsonProperty("DaytimeRunningLight")
    public String daytimeRunningLight;
    @JsonProperty("DestinationMarket")
    public String destinationMarket;
    @JsonProperty("DisplacementCC")
    public String displacementCC;
    @JsonProperty("DisplacementCI")
    public String displacementCI;
    @JsonProperty("DisplacementL")
    public String displacementL;
    @JsonProperty("Doors")
    public String doors;
    @JsonProperty("DriveType")
    public String driveType;
    @JsonProperty("DriverAssist")
    public String driverAssist;
    @JsonProperty("DynamicBrakeSupport")
    public String dynamicBrakeSupport;
    @JsonProperty("EDR")
    public String eDR;
    @JsonProperty("ESC")
    public String eSC;
    @JsonProperty("EVDriveUnit")
    public String eVDriveUnit;
    @JsonProperty("ElectrificationLevel")
    public String electrificationLevel;
    @JsonProperty("EngineConfiguration")
    public String engineConfiguration;
    @JsonProperty("EngineCycles")
    public String engineCycles;
    @JsonProperty("EngineCylinders")
    public String engineCylinders;
    @JsonProperty("EngineHP")
    public String engineHP;
    @JsonProperty("EngineHP_to")
    public String engineHP_to;
    @JsonProperty("EngineKW")
    public String engineKW;
    @JsonProperty("EngineManufacturer")
    public String engineManufacturer;
    @JsonProperty("EngineModel")
    public String engineModel;
    @JsonProperty("EntertainmentSystem")
    public String entertainmentSystem;
    @JsonProperty("ErrorCode")
    public String errorCode;
    @JsonProperty("ErrorText")
    public String errorText;
    @JsonProperty("ForwardCollisionWarning")
    public String forwardCollisionWarning;
    @JsonProperty("FuelInjectionType")
    public String fuelInjectionType;
    @JsonProperty("FuelTypePrimary")
    public String fuelTypePrimary;
    @JsonProperty("FuelTypeSecondary")
    public String fuelTypeSecondary;
    @JsonProperty("GCWR")
    public String gCWR;
    @JsonProperty("GCWR_to")
    public String gCWR_to;
    @JsonProperty("GVWR")
    public String gVWR;
    @JsonProperty("GVWR_to")
    public String gVWR_to;
    @JsonProperty("KeylessIgnition")
    public String keylessIgnition;
    @JsonProperty("LaneCenteringAssistance")
    public String laneCenteringAssistance;
    @JsonProperty("LaneDepartureWarning")
    public String laneDepartureWarning;
    @JsonProperty("LaneKeepSystem")
    public String laneKeepSystem;
    @JsonProperty("LowerBeamHeadlampLightSource")
    public String lowerBeamHeadlampLightSource;
    @JsonProperty("Make")
    public String make;
    @JsonProperty("MakeID")
    public String makeID;
    @JsonProperty("Manufacturer")
    public String manufacturer;
    @JsonProperty("ManufacturerId")
    public String manufacturerId;
    @JsonProperty("Model")
    public String model;
    @JsonProperty("ModelID")
    public String modelID;
    @JsonProperty("ModelYear")
    public String modelYear;
    @JsonProperty("MotorcycleChassisType")
    public String motorcycleChassisType;
    @JsonProperty("MotorcycleSuspensionType")
    public String motorcycleSuspensionType;
    @JsonProperty("NCSABodyType")
    public String nCSABodyType;
    @JsonProperty("NCSAMake")
    public String nCSAMake;
    @JsonProperty("NCSAMapExcApprovedBy")
    public String nCSAMapExcApprovedBy;
    @JsonProperty("NCSAMapExcApprovedOn")
    public String nCSAMapExcApprovedOn;
    @JsonProperty("NCSAMappingException")
    public String nCSAMappingException;
    @JsonProperty("NCSAModel")
    public String nCSAModel;
    @JsonProperty("NCSANote")
    public String nCSANote;
    @JsonProperty("Note")
    public String note;
    @JsonProperty("OtherBusInfo")
    public String otherBusInfo;
    @JsonProperty("OtherEngineInfo")
    public String otherEngineInfo;
    @JsonProperty("OtherMotorcycleInfo")
    public String otherMotorcycleInfo;
    @JsonProperty("OtherRestraintSystemInfo")
    public String otherRestraintSystemInfo;
    @JsonProperty("OtherTrailerInfo")
    public String otherTrailerInfo;
    @JsonProperty("ParkAssist")
    public String parkAssist;
    @JsonProperty("PedestrianAutomaticEmergencyBraking")
    public String pedestrianAutomaticEmergencyBraking;
    @JsonProperty("PlantCity")
    public String plantCity;
    @JsonProperty("PlantCompanyName")
    public String plantCompanyName;
    @JsonProperty("PlantCountry")
    public String plantCountry;
    @JsonProperty("PlantState")
    public String plantState;
    @JsonProperty("PossibleValues")
    public String possibleValues;
    @JsonProperty("Pretensioner")
    public String pretensioner;
    @JsonProperty("RearAutomaticEmergencyBraking")
    public String rearAutomaticEmergencyBraking;
    @JsonProperty("RearCrossTrafficAlert")
    public String rearCrossTrafficAlert;
    @JsonProperty("RearVisibilitySystem")
    public String rearVisibilitySystem;
    @JsonProperty("SAEAutomationLevel")
    public String sAEAutomationLevel;
    @JsonProperty("SAEAutomationLevel_to")
    public String sAEAutomationLevel_to;
    @JsonProperty("SeatBeltsAll")
    public String seatBeltsAll;
    @JsonProperty("SeatRows")
    public String seatRows;
    @JsonProperty("Seats")
    public String seats;
    @JsonProperty("SemiautomaticHeadlampBeamSwitching")
    public String semiautomaticHeadlampBeamSwitching;
    @JsonProperty("Series")
    public String series;
    @JsonProperty("Series2")
    public String series2;
    @JsonProperty("SteeringLocation")
    public String steeringLocation;
    @JsonProperty("SuggestedVIN")
    public String suggestedVIN;
    @JsonProperty("TPMS")
    public String tPMS;
    @JsonProperty("TopSpeedMPH")
    public String topSpeedMPH;
    @JsonProperty("TrackWidth")
    public String trackWidth;
    @JsonProperty("TractionControl")
    public String tractionControl;
    @JsonProperty("TrailerBodyType")
    public String trailerBodyType;
    @JsonProperty("TrailerLength")
    public String trailerLength;
    @JsonProperty("TrailerType")
    public String trailerType;
    @JsonProperty("TransmissionSpeeds")
    public String transmissionSpeeds;
    @JsonProperty("TransmissionStyle")
    public String transmissionStyle;
    @JsonProperty("Trim")
    public String trim;
    @JsonProperty("Trim2")
    public String trim2;
    @JsonProperty("Turbo")
    public String turbo;
    @JsonProperty("VIN")
    public String vIN;
    @JsonProperty("ValveTrainDesign")
    public String valveTrainDesign;
    @JsonProperty("VehicleType")
    public String vehicleType;
    @JsonProperty("WheelBaseLong")
    public String wheelBaseLong;
    @JsonProperty("WheelBaseShort")
    public String wheelBaseShort;
    @JsonProperty("WheelBaseType")
    public String wheelBaseType;
    @JsonProperty("WheelSizeFront")
    public String wheelSizeFront;
    @JsonProperty("WheelSizeRear")
    public String wheelSizeRear;
    @JsonProperty("Wheels")
    public String wheels;
    @JsonProperty("Windows")
    public String windows;

    public String getaBS() {
        return aBS;
    }

    public void setaBS(String aBS) {
        this.aBS = aBS;
    }

    public String getActiveSafetySysNote() {
        return activeSafetySysNote;
    }

    public void setActiveSafetySysNote(String activeSafetySysNote) {
        this.activeSafetySysNote = activeSafetySysNote;
    }

    public String getAdaptiveCruiseControl() {
        return adaptiveCruiseControl;
    }

    public void setAdaptiveCruiseControl(String adaptiveCruiseControl) {
        this.adaptiveCruiseControl = adaptiveCruiseControl;
    }

    public String getAdaptiveDrivingBeam() {
        return adaptiveDrivingBeam;
    }

    public void setAdaptiveDrivingBeam(String adaptiveDrivingBeam) {
        this.adaptiveDrivingBeam = adaptiveDrivingBeam;
    }

    public String getAdaptiveHeadlights() {
        return adaptiveHeadlights;
    }

    public void setAdaptiveHeadlights(String adaptiveHeadlights) {
        this.adaptiveHeadlights = adaptiveHeadlights;
    }

    public String getAdditionalErrorText() {
        return additionalErrorText;
    }

    public void setAdditionalErrorText(String additionalErrorText) {
        this.additionalErrorText = additionalErrorText;
    }

    public String getAirBagLocCurtain() {
        return airBagLocCurtain;
    }

    public void setAirBagLocCurtain(String airBagLocCurtain) {
        this.airBagLocCurtain = airBagLocCurtain;
    }

    public String getAirBagLocFront() {
        return airBagLocFront;
    }

    public void setAirBagLocFront(String airBagLocFront) {
        this.airBagLocFront = airBagLocFront;
    }

    public String getAirBagLocKnee() {
        return airBagLocKnee;
    }

    public void setAirBagLocKnee(String airBagLocKnee) {
        this.airBagLocKnee = airBagLocKnee;
    }

    public String getAirBagLocSeatCushion() {
        return airBagLocSeatCushion;
    }

    public void setAirBagLocSeatCushion(String airBagLocSeatCushion) {
        this.airBagLocSeatCushion = airBagLocSeatCushion;
    }

    public String getAirBagLocSide() {
        return airBagLocSide;
    }

    public void setAirBagLocSide(String airBagLocSide) {
        this.airBagLocSide = airBagLocSide;
    }

    public String getAutoReverseSystem() {
        return autoReverseSystem;
    }

    public void setAutoReverseSystem(String autoReverseSystem) {
        this.autoReverseSystem = autoReverseSystem;
    }

    public String getAutomaticPedestrianAlertingSound() {
        return automaticPedestrianAlertingSound;
    }

    public void setAutomaticPedestrianAlertingSound(String automaticPedestrianAlertingSound) {
        this.automaticPedestrianAlertingSound = automaticPedestrianAlertingSound;
    }

    public String getAxleConfiguration() {
        return axleConfiguration;
    }

    public void setAxleConfiguration(String axleConfiguration) {
        this.axleConfiguration = axleConfiguration;
    }

    public String getAxles() {
        return axles;
    }

    public void setAxles(String axles) {
        this.axles = axles;
    }

    public String getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(String basePrice) {
        this.basePrice = basePrice;
    }

    public String getBatteryA() {
        return batteryA;
    }

    public void setBatteryA(String batteryA) {
        this.batteryA = batteryA;
    }

    public String getBatteryA_to() {
        return batteryA_to;
    }

    public void setBatteryA_to(String batteryA_to) {
        this.batteryA_to = batteryA_to;
    }

    public String getBatteryCells() {
        return batteryCells;
    }

    public void setBatteryCells(String batteryCells) {
        this.batteryCells = batteryCells;
    }

    public String getBatteryInfo() {
        return batteryInfo;
    }

    public void setBatteryInfo(String batteryInfo) {
        this.batteryInfo = batteryInfo;
    }

    public String getBatteryKWh() {
        return batteryKWh;
    }

    public void setBatteryKWh(String batteryKWh) {
        this.batteryKWh = batteryKWh;
    }

    public String getBatteryKWh_to() {
        return batteryKWh_to;
    }

    public void setBatteryKWh_to(String batteryKWh_to) {
        this.batteryKWh_to = batteryKWh_to;
    }

    public String getBatteryModules() {
        return batteryModules;
    }

    public void setBatteryModules(String batteryModules) {
        this.batteryModules = batteryModules;
    }

    public String getBatteryPacks() {
        return batteryPacks;
    }

    public void setBatteryPacks(String batteryPacks) {
        this.batteryPacks = batteryPacks;
    }

    public String getBatteryType() {
        return batteryType;
    }

    public void setBatteryType(String batteryType) {
        this.batteryType = batteryType;
    }

    public String getBatteryV() {
        return batteryV;
    }

    public void setBatteryV(String batteryV) {
        this.batteryV = batteryV;
    }

    public String getBatteryV_to() {
        return batteryV_to;
    }

    public void setBatteryV_to(String batteryV_to) {
        this.batteryV_to = batteryV_to;
    }

    public String getBedLengthIN() {
        return bedLengthIN;
    }

    public void setBedLengthIN(String bedLengthIN) {
        this.bedLengthIN = bedLengthIN;
    }

    public String getBedType() {
        return bedType;
    }

    public void setBedType(String bedType) {
        this.bedType = bedType;
    }

    public String getBlindSpotIntervention() {
        return blindSpotIntervention;
    }

    public void setBlindSpotIntervention(String blindSpotIntervention) {
        this.blindSpotIntervention = blindSpotIntervention;
    }

    public String getBlindSpotMon() {
        return blindSpotMon;
    }

    public void setBlindSpotMon(String blindSpotMon) {
        this.blindSpotMon = blindSpotMon;
    }

    public String getBodyCabType() {
        return bodyCabType;
    }

    public void setBodyCabType(String bodyCabType) {
        this.bodyCabType = bodyCabType;
    }

    public String getBodyClass() {
        return bodyClass;
    }

    public void setBodyClass(String bodyClass) {
        this.bodyClass = bodyClass;
    }

    public String getBrakeSystemDesc() {
        return brakeSystemDesc;
    }

    public void setBrakeSystemDesc(String brakeSystemDesc) {
        this.brakeSystemDesc = brakeSystemDesc;
    }

    public String getBrakeSystemType() {
        return brakeSystemType;
    }

    public void setBrakeSystemType(String brakeSystemType) {
        this.brakeSystemType = brakeSystemType;
    }

    public String getBusFloorConfigType() {
        return busFloorConfigType;
    }

    public void setBusFloorConfigType(String busFloorConfigType) {
        this.busFloorConfigType = busFloorConfigType;
    }

    public String getBusLength() {
        return busLength;
    }

    public void setBusLength(String busLength) {
        this.busLength = busLength;
    }

    public String getBusType() {
        return busType;
    }

    public void setBusType(String busType) {
        this.busType = busType;
    }

    public String getcAN_AACN() {
        return cAN_AACN;
    }

    public void setcAN_AACN(String cAN_AACN) {
        this.cAN_AACN = cAN_AACN;
    }

    public String getcIB() {
        return cIB;
    }

    public void setcIB(String cIB) {
        this.cIB = cIB;
    }

    public String getCashForClunkers() {
        return cashForClunkers;
    }

    public void setCashForClunkers(String cashForClunkers) {
        this.cashForClunkers = cashForClunkers;
    }

    public String getChargerLevel() {
        return chargerLevel;
    }

    public void setChargerLevel(String chargerLevel) {
        this.chargerLevel = chargerLevel;
    }

    public String getChargerPowerKW() {
        return chargerPowerKW;
    }

    public void setChargerPowerKW(String chargerPowerKW) {
        this.chargerPowerKW = chargerPowerKW;
    }

    public String getCoolingType() {
        return coolingType;
    }

    public void setCoolingType(String coolingType) {
        this.coolingType = coolingType;
    }

    public String getCurbWeightLB() {
        return curbWeightLB;
    }

    public void setCurbWeightLB(String curbWeightLB) {
        this.curbWeightLB = curbWeightLB;
    }

    public String getCustomMotorcycleType() {
        return customMotorcycleType;
    }

    public void setCustomMotorcycleType(String customMotorcycleType) {
        this.customMotorcycleType = customMotorcycleType;
    }

    public String getDaytimeRunningLight() {
        return daytimeRunningLight;
    }

    public void setDaytimeRunningLight(String daytimeRunningLight) {
        this.daytimeRunningLight = daytimeRunningLight;
    }

    public String getDestinationMarket() {
        return destinationMarket;
    }

    public void setDestinationMarket(String destinationMarket) {
        this.destinationMarket = destinationMarket;
    }

    public String getDisplacementCC() {
        return displacementCC;
    }

    public void setDisplacementCC(String displacementCC) {
        this.displacementCC = displacementCC;
    }

    public String getDisplacementCI() {
        return displacementCI;
    }

    public void setDisplacementCI(String displacementCI) {
        this.displacementCI = displacementCI;
    }

    public String getDisplacementL() {
        return displacementL;
    }

    public void setDisplacementL(String displacementL) {
        this.displacementL = displacementL;
    }

    public String getDoors() {
        return doors;
    }

    public void setDoors(String doors) {
        this.doors = doors;
    }

    public String getDriveType() {
        return driveType;
    }

    public void setDriveType(String driveType) {
        this.driveType = driveType;
    }

    public String getDriverAssist() {
        return driverAssist;
    }

    public void setDriverAssist(String driverAssist) {
        this.driverAssist = driverAssist;
    }

    public String getDynamicBrakeSupport() {
        return dynamicBrakeSupport;
    }

    public void setDynamicBrakeSupport(String dynamicBrakeSupport) {
        this.dynamicBrakeSupport = dynamicBrakeSupport;
    }

    public String geteDR() {
        return eDR;
    }

    public void seteDR(String eDR) {
        this.eDR = eDR;
    }

    public String geteSC() {
        return eSC;
    }

    public void seteSC(String eSC) {
        this.eSC = eSC;
    }

    public String geteVDriveUnit() {
        return eVDriveUnit;
    }

    public void seteVDriveUnit(String eVDriveUnit) {
        this.eVDriveUnit = eVDriveUnit;
    }

    public String getElectrificationLevel() {
        return electrificationLevel;
    }

    public void setElectrificationLevel(String electrificationLevel) {
        this.electrificationLevel = electrificationLevel;
    }

    public String getEngineConfiguration() {
        return engineConfiguration;
    }

    public void setEngineConfiguration(String engineConfiguration) {
        this.engineConfiguration = engineConfiguration;
    }

    public String getEngineCycles() {
        return engineCycles;
    }

    public void setEngineCycles(String engineCycles) {
        this.engineCycles = engineCycles;
    }

    public String getEngineCylinders() {
        return engineCylinders;
    }

    public void setEngineCylinders(String engineCylinders) {
        this.engineCylinders = engineCylinders;
    }

    public String getEngineHP() {
        return engineHP;
    }

    public void setEngineHP(String engineHP) {
        this.engineHP = engineHP;
    }

    public String getEngineHP_to() {
        return engineHP_to;
    }

    public void setEngineHP_to(String engineHP_to) {
        this.engineHP_to = engineHP_to;
    }

    public String getEngineKW() {
        return engineKW;
    }

    public void setEngineKW(String engineKW) {
        this.engineKW = engineKW;
    }

    public String getEngineManufacturer() {
        return engineManufacturer;
    }

    public void setEngineManufacturer(String engineManufacturer) {
        this.engineManufacturer = engineManufacturer;
    }

    public String getEngineModel() {
        return engineModel;
    }

    public void setEngineModel(String engineModel) {
        this.engineModel = engineModel;
    }

    public String getEntertainmentSystem() {
        return entertainmentSystem;
    }

    public void setEntertainmentSystem(String entertainmentSystem) {
        this.entertainmentSystem = entertainmentSystem;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorText() {
        return errorText;
    }

    public void setErrorText(String errorText) {
        this.errorText = errorText;
    }

    public String getForwardCollisionWarning() {
        return forwardCollisionWarning;
    }

    public void setForwardCollisionWarning(String forwardCollisionWarning) {
        this.forwardCollisionWarning = forwardCollisionWarning;
    }

    public String getFuelInjectionType() {
        return fuelInjectionType;
    }

    public void setFuelInjectionType(String fuelInjectionType) {
        this.fuelInjectionType = fuelInjectionType;
    }

    public String getFuelTypePrimary() {
        return fuelTypePrimary;
    }

    public void setFuelTypePrimary(String fuelTypePrimary) {
        this.fuelTypePrimary = fuelTypePrimary;
    }

    public String getFuelTypeSecondary() {
        return fuelTypeSecondary;
    }

    public void setFuelTypeSecondary(String fuelTypeSecondary) {
        this.fuelTypeSecondary = fuelTypeSecondary;
    }

    public String getgCWR() {
        return gCWR;
    }

    public void setgCWR(String gCWR) {
        this.gCWR = gCWR;
    }

    public String getgCWR_to() {
        return gCWR_to;
    }

    public void setgCWR_to(String gCWR_to) {
        this.gCWR_to = gCWR_to;
    }

    public String getgVWR() {
        return gVWR;
    }

    public void setgVWR(String gVWR) {
        this.gVWR = gVWR;
    }

    public String getgVWR_to() {
        return gVWR_to;
    }

    public void setgVWR_to(String gVWR_to) {
        this.gVWR_to = gVWR_to;
    }

    public String getKeylessIgnition() {
        return keylessIgnition;
    }

    public void setKeylessIgnition(String keylessIgnition) {
        this.keylessIgnition = keylessIgnition;
    }

    public String getLaneCenteringAssistance() {
        return laneCenteringAssistance;
    }

    public void setLaneCenteringAssistance(String laneCenteringAssistance) {
        this.laneCenteringAssistance = laneCenteringAssistance;
    }

    public String getLaneDepartureWarning() {
        return laneDepartureWarning;
    }

    public void setLaneDepartureWarning(String laneDepartureWarning) {
        this.laneDepartureWarning = laneDepartureWarning;
    }

    public String getLaneKeepSystem() {
        return laneKeepSystem;
    }

    public void setLaneKeepSystem(String laneKeepSystem) {
        this.laneKeepSystem = laneKeepSystem;
    }

    public String getLowerBeamHeadlampLightSource() {
        return lowerBeamHeadlampLightSource;
    }

    public void setLowerBeamHeadlampLightSource(String lowerBeamHeadlampLightSource) {
        this.lowerBeamHeadlampLightSource = lowerBeamHeadlampLightSource;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getMakeID() {
        return makeID;
    }

    public void setMakeID(String makeID) {
        this.makeID = makeID;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(String manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModelID() {
        return modelID;
    }

    public void setModelID(String modelID) {
        this.modelID = modelID;
    }

    public String getModelYear() {
        return modelYear;
    }

    public void setModelYear(String modelYear) {
        this.modelYear = modelYear;
    }

    public String getMotorcycleChassisType() {
        return motorcycleChassisType;
    }

    public void setMotorcycleChassisType(String motorcycleChassisType) {
        this.motorcycleChassisType = motorcycleChassisType;
    }

    public String getMotorcycleSuspensionType() {
        return motorcycleSuspensionType;
    }

    public void setMotorcycleSuspensionType(String motorcycleSuspensionType) {
        this.motorcycleSuspensionType = motorcycleSuspensionType;
    }

    public String getnCSABodyType() {
        return nCSABodyType;
    }

    public void setnCSABodyType(String nCSABodyType) {
        this.nCSABodyType = nCSABodyType;
    }

    public String getnCSAMake() {
        return nCSAMake;
    }

    public void setnCSAMake(String nCSAMake) {
        this.nCSAMake = nCSAMake;
    }

    public String getnCSAMapExcApprovedBy() {
        return nCSAMapExcApprovedBy;
    }

    public void setnCSAMapExcApprovedBy(String nCSAMapExcApprovedBy) {
        this.nCSAMapExcApprovedBy = nCSAMapExcApprovedBy;
    }

    public String getnCSAMapExcApprovedOn() {
        return nCSAMapExcApprovedOn;
    }

    public void setnCSAMapExcApprovedOn(String nCSAMapExcApprovedOn) {
        this.nCSAMapExcApprovedOn = nCSAMapExcApprovedOn;
    }

    public String getnCSAMappingException() {
        return nCSAMappingException;
    }

    public void setnCSAMappingException(String nCSAMappingException) {
        this.nCSAMappingException = nCSAMappingException;
    }

    public String getnCSAModel() {
        return nCSAModel;
    }

    public void setnCSAModel(String nCSAModel) {
        this.nCSAModel = nCSAModel;
    }

    public String getnCSANote() {
        return nCSANote;
    }

    public void setnCSANote(String nCSANote) {
        this.nCSANote = nCSANote;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getOtherBusInfo() {
        return otherBusInfo;
    }

    public void setOtherBusInfo(String otherBusInfo) {
        this.otherBusInfo = otherBusInfo;
    }

    public String getOtherEngineInfo() {
        return otherEngineInfo;
    }

    public void setOtherEngineInfo(String otherEngineInfo) {
        this.otherEngineInfo = otherEngineInfo;
    }

    public String getOtherMotorcycleInfo() {
        return otherMotorcycleInfo;
    }

    public void setOtherMotorcycleInfo(String otherMotorcycleInfo) {
        this.otherMotorcycleInfo = otherMotorcycleInfo;
    }

    public String getOtherRestraintSystemInfo() {
        return otherRestraintSystemInfo;
    }

    public void setOtherRestraintSystemInfo(String otherRestraintSystemInfo) {
        this.otherRestraintSystemInfo = otherRestraintSystemInfo;
    }

    public String getOtherTrailerInfo() {
        return otherTrailerInfo;
    }

    public void setOtherTrailerInfo(String otherTrailerInfo) {
        this.otherTrailerInfo = otherTrailerInfo;
    }

    public String getParkAssist() {
        return parkAssist;
    }

    public void setParkAssist(String parkAssist) {
        this.parkAssist = parkAssist;
    }

    public String getPedestrianAutomaticEmergencyBraking() {
        return pedestrianAutomaticEmergencyBraking;
    }

    public void setPedestrianAutomaticEmergencyBraking(String pedestrianAutomaticEmergencyBraking) {
        this.pedestrianAutomaticEmergencyBraking = pedestrianAutomaticEmergencyBraking;
    }

    public String getPlantCity() {
        return plantCity;
    }

    public void setPlantCity(String plantCity) {
        this.plantCity = plantCity;
    }

    public String getPlantCompanyName() {
        return plantCompanyName;
    }

    public void setPlantCompanyName(String plantCompanyName) {
        this.plantCompanyName = plantCompanyName;
    }

    public String getPlantCountry() {
        return plantCountry;
    }

    public void setPlantCountry(String plantCountry) {
        this.plantCountry = plantCountry;
    }

    public String getPlantState() {
        return plantState;
    }

    public void setPlantState(String plantState) {
        this.plantState = plantState;
    }

    public String getPossibleValues() {
        return possibleValues;
    }

    public void setPossibleValues(String possibleValues) {
        this.possibleValues = possibleValues;
    }

    public String getPretensioner() {
        return pretensioner;
    }

    public void setPretensioner(String pretensioner) {
        this.pretensioner = pretensioner;
    }

    public String getRearAutomaticEmergencyBraking() {
        return rearAutomaticEmergencyBraking;
    }

    public void setRearAutomaticEmergencyBraking(String rearAutomaticEmergencyBraking) {
        this.rearAutomaticEmergencyBraking = rearAutomaticEmergencyBraking;
    }

    public String getRearCrossTrafficAlert() {
        return rearCrossTrafficAlert;
    }

    public void setRearCrossTrafficAlert(String rearCrossTrafficAlert) {
        this.rearCrossTrafficAlert = rearCrossTrafficAlert;
    }

    public String getRearVisibilitySystem() {
        return rearVisibilitySystem;
    }

    public void setRearVisibilitySystem(String rearVisibilitySystem) {
        this.rearVisibilitySystem = rearVisibilitySystem;
    }

    public String getsAEAutomationLevel() {
        return sAEAutomationLevel;
    }

    public void setsAEAutomationLevel(String sAEAutomationLevel) {
        this.sAEAutomationLevel = sAEAutomationLevel;
    }

    public String getsAEAutomationLevel_to() {
        return sAEAutomationLevel_to;
    }

    public void setsAEAutomationLevel_to(String sAEAutomationLevel_to) {
        this.sAEAutomationLevel_to = sAEAutomationLevel_to;
    }

    public String getSeatBeltsAll() {
        return seatBeltsAll;
    }

    public void setSeatBeltsAll(String seatBeltsAll) {
        this.seatBeltsAll = seatBeltsAll;
    }

    public String getSeatRows() {
        return seatRows;
    }

    public void setSeatRows(String seatRows) {
        this.seatRows = seatRows;
    }

    public String getSeats() {
        return seats;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }

    public String getSemiautomaticHeadlampBeamSwitching() {
        return semiautomaticHeadlampBeamSwitching;
    }

    public void setSemiautomaticHeadlampBeamSwitching(String semiautomaticHeadlampBeamSwitching) {
        this.semiautomaticHeadlampBeamSwitching = semiautomaticHeadlampBeamSwitching;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getSeries2() {
        return series2;
    }

    public void setSeries2(String series2) {
        this.series2 = series2;
    }

    public String getSteeringLocation() {
        return steeringLocation;
    }

    public void setSteeringLocation(String steeringLocation) {
        this.steeringLocation = steeringLocation;
    }

    public String getSuggestedVIN() {
        return suggestedVIN;
    }

    public void setSuggestedVIN(String suggestedVIN) {
        this.suggestedVIN = suggestedVIN;
    }

    public String gettPMS() {
        return tPMS;
    }

    public void settPMS(String tPMS) {
        this.tPMS = tPMS;
    }

    public String getTopSpeedMPH() {
        return topSpeedMPH;
    }

    public void setTopSpeedMPH(String topSpeedMPH) {
        this.topSpeedMPH = topSpeedMPH;
    }

    public String getTrackWidth() {
        return trackWidth;
    }

    public void setTrackWidth(String trackWidth) {
        this.trackWidth = trackWidth;
    }

    public String getTractionControl() {
        return tractionControl;
    }

    public void setTractionControl(String tractionControl) {
        this.tractionControl = tractionControl;
    }

    public String getTrailerBodyType() {
        return trailerBodyType;
    }

    public void setTrailerBodyType(String trailerBodyType) {
        this.trailerBodyType = trailerBodyType;
    }

    public String getTrailerLength() {
        return trailerLength;
    }

    public void setTrailerLength(String trailerLength) {
        this.trailerLength = trailerLength;
    }

    public String getTrailerType() {
        return trailerType;
    }

    public void setTrailerType(String trailerType) {
        this.trailerType = trailerType;
    }

    public String getTransmissionSpeeds() {
        return transmissionSpeeds;
    }

    public void setTransmissionSpeeds(String transmissionSpeeds) {
        this.transmissionSpeeds = transmissionSpeeds;
    }

    public String getTransmissionStyle() {
        return transmissionStyle;
    }

    public void setTransmissionStyle(String transmissionStyle) {
        this.transmissionStyle = transmissionStyle;
    }

    public String getTrim() {
        return trim;
    }

    public void setTrim(String trim) {
        this.trim = trim;
    }

    public String getTrim2() {
        return trim2;
    }

    public void setTrim2(String trim2) {
        this.trim2 = trim2;
    }

    public String getTurbo() {
        return turbo;
    }

    public void setTurbo(String turbo) {
        this.turbo = turbo;
    }

    public String getvIN() {
        return vIN;
    }

    public void setvIN(String vIN) {
        this.vIN = vIN;
    }

    public String getValveTrainDesign() {
        return valveTrainDesign;
    }

    public void setValveTrainDesign(String valveTrainDesign) {
        this.valveTrainDesign = valveTrainDesign;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getWheelBaseLong() {
        return wheelBaseLong;
    }

    public void setWheelBaseLong(String wheelBaseLong) {
        this.wheelBaseLong = wheelBaseLong;
    }

    public String getWheelBaseShort() {
        return wheelBaseShort;
    }

    public void setWheelBaseShort(String wheelBaseShort) {
        this.wheelBaseShort = wheelBaseShort;
    }

    public String getWheelBaseType() {
        return wheelBaseType;
    }

    public void setWheelBaseType(String wheelBaseType) {
        this.wheelBaseType = wheelBaseType;
    }

    public String getWheelSizeFront() {
        return wheelSizeFront;
    }

    public void setWheelSizeFront(String wheelSizeFront) {
        this.wheelSizeFront = wheelSizeFront;
    }

    public String getWheelSizeRear() {
        return wheelSizeRear;
    }

    public void setWheelSizeRear(String wheelSizeRear) {
        this.wheelSizeRear = wheelSizeRear;
    }

    public String getWheels() {
        return wheels;
    }

    public void setWheels(String wheels) {
        this.wheels = wheels;
    }

    public String getWindows() {
        return windows;
    }

    public void setWindows(String windows) {
        this.windows = windows;
    }
}
