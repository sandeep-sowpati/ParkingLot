package com.design.entities;

import java.util.List;

public class ParkingLot extends BaseModel{
    private String parkingLotName;
    private String address;
    private List<ParkingFloor> parkingFloors;
    private List<Gate> gates;
}
