package com.betrybe.tech;

public abstract class QuantumComputer extends ComputerDevice {

  public QuantumComputer(String brand, double storageCapacity) {
    super(brand, storageCapacity);
  }

  public abstract void quantumComputation();

  @Override
  public void charge() {
    System.out.println("Carregando o computador quantico...");
  }
}
gi