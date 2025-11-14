package com.betrybe.tech;

public class PowerBank implements Chargeable{

  @Override
  public void charge() {
    System.out.println("Carregando o PoweBank");
  }

  @Override
  public int getBatteryLevel() {
    return 65;
  }
}
