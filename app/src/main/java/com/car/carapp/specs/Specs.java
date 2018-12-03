package com.car.carapp.specs;

public class Specs {
    private String passengers;
    private String type;
    private String maxSpeed;

    public Specs(){};
    public Specs (String type, String pas, String maxSpeed){
        this.setType(type);
        this.setPassengers(pas);
        this.setMaxSpeed(maxSpeed);
    }

    public String getPassengers() {
        return passengers;
    }
    public void setPassengers(String passengers) {
        this.passengers = passengers;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getMaxSpeed() {
        return maxSpeed;
    }
    public void setMaxSpeed(String maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
