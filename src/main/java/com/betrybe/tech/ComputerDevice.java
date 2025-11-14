package com.betrybe.tech;

public abstract class ComputerDevice implements Chargeable {

  private String brand;
  private double storageCapacity;

  public ComputerDevice(String brand, double storageCapacity){
    this.brand = brand;
    this.storageCapacity = storageCapacity;
  }

  public String getBrand() {
    return brand;
  }

  public double getStorageCapacity() {
    return storageCapacity;
  }

  public abstract void bootUp();

  @Override
  public int getBatteryLevel() {
    return 85;
  }
}
