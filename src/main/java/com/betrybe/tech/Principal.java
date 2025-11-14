package com.betrybe.tech;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Principal {

  public static void main(String[] args) {
    Laptop laptop = new Laptop("Lenovo", 1000, 16);
    PowerBank powerBank = new PowerBank();
    checkDevice(laptop);
    plugDevice(laptop);
  }

  public static void checkDevice(ComputerDevice device) {
    System.out.println("Verificando dispositivo da marca " + device.getBrand());
    device.bootUp();

  }

  public static void plugDevice(Chargeable chargeable) {;
    System.out.println("A bateria atual é " + chargeable.getBatteryLevel());
    chargeable.charge();
  }
}