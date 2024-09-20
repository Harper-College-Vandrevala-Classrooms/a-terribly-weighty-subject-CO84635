package com.csc;

public class Converter {

  public String toPounds(int ounces) {
    double pounds = ounces / 16.0;

    String formatedPounds = String.format("%.4f", pounds);

    if (pounds == 1) {
      return formatedPounds + " lb";
    } else {
      return formatedPounds + " lbs";
    }
  }

  public String toPounds() {
    return toPounds(0);
  }

  public String toPoundsAndOunces(int ounces) {
    int pounds = ounces / 16;
    int remainingOunces = ounces % 16;

    String poundUnit;
    if (pounds == 1) {
      poundUnit = pounds + " lb ";
    } else {
      poundUnit = pounds + " lbs ";
    }
    return poundUnit + remainingOunces + " oz";
  }

  public String toPoundsAndOunces() {
    return toPoundsAndOunces(0);
  }

  public String toOunces(int pounds, int ounces) {
    int poundsToOunces = pounds * 16;

    return poundsToOunces + ounces + " ounces";
  }

  public static void main(String[] args) {
    Converter converter = new Converter();
    System.out.println(converter.toPounds(0));
    System.out.println(converter.toPounds(16));
    System.out.println(converter.toPoundsAndOunces(18));
    System.out.println(converter.toPoundsAndOunces(36));
    System.out.println(converter.toPounds());
    System.out.println(converter.toPoundsAndOunces());
  }
}
