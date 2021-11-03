package com.company;

public class HealthyBurger extends Hamburger {

  private String addition5Name;
  private double addition5Price;

  private String addition6Name;
  private double addition6Price;

  public HealthyBurger(String meat, int price, String breadType) {
    super("Healthy", meat, price, "Brown Rye");
  }

  /**
   * Updates the burger with an addition and the price of that addition
   * @param name String -- name of the addition
   * @param price double -- price of the addition
   */
  public void addHamburgerAddition5(String name, double price) {
    this.addition5Name = name;
    this.addition5Price = price;
  }

  /**
   * Updates the burger with an addition and the price of that addition
   * @param name String -- name of the addition
   * @param price double -- price of the addition
   */
  public void addHamburgerAddition6(String name, double price) {
    this.addition6Name = name;
    this.addition6Price = price;
  }

  /**
   * Determines the total price of the burger and reports to console all of details of the burger
   * like a receipt
   *
   * @return double -- total price of burger with additions
   */
  @Override
  public double itemizeHamburger() {
    double additivePrice = 0;
    if (addition5Name != null) {
      additivePrice += addition5Price;
      System.out.println("Added " + addition5Name + " for an extra " + addition5Price);
    }

    if(addition6Name != null) {
      additivePrice += addition6Price;
      System.out.println("Added " + addition6Name + " for an extra " + addition6Price);
    }
    return super.itemizeHamburger() + additivePrice;
  }
}
