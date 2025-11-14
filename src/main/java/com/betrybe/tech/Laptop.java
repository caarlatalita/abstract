package com.betrybe.tech;

public class Laptop extends ComputerDevice {

  private double size;

  public Laptop(String brand, double storageCapacity, double size) {
    super(brand, storageCapacity);
    this.size = size;
  }

  @Override
  public void bootUp() {
    System.out.println("Inicializando o laptop de tamanho " + size);
  }

  @Override
  public void charge() {
    System.out.println("Carregando o laptop...");
  }
}
