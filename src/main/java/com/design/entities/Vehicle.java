package com.design.entities;

public class Vehicle  extends BaseModel{
    private String number;
    private String make;
    private VehicleType vehicleType;

/*
    public Vehicle(String number){
        this.id = uuid.
    }
*/
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
