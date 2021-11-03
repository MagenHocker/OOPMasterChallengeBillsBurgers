package com.company;

/**
 * represents a hamburger
 *
 * @author magen hocker
 */
public class Hamburger {

  private String name;
  private String meat;
  private double price;
  private String breadType;

  private String addition1Name;
  private double addition1Price;

  private String addition2Name;
  private double addition2Price;

  private String addition3Name;
  private double addition3Price;

  private String addition4Name;
  private double addition4Price;

  /**
   * the constructor for a hamburger
   * @param name String -- name of the burger
   * @param meat String -- type of meat
   * @param breadType String --type of bread
   */
  public Hamburger(String name, String meat, double price, String breadType) {
    this.name = name;
    this.meat = meat;
    this.price = price;
    this.breadType = breadType;
  }

  /**
   * Updates the burger with an addition and the price of that addition
   * @param name String -- name of the addition
   * @param price double -- price of the addition
   */
  public void addHamburgerAddition1(String name, double price) {
    this.addition1Name = name;
    this.addition1Price = price;
  }

  /**
   * Updates the burger with an addition and the price of that addition
   * @param name String -- name of the addition
   * @param price double -- price of the addition
   */
  public void addHamburgerAddition2(String name, double price) {
    this.addition2Name = name;
    this.addition2Price = price;
  }

  /**
   * Updates the burger with an addition and the price of that addition
   * @param name String -- name of the addition
   * @param price double -- price of the addition
   */
  public void addHamburgerAddition3(String name, double price) {
    this.addition3Name = name;
    this.addition3Price = price;
  }

  /**
   * Updates the burger with an addition and the price of that addition
   * @param name String -- name of the addition
   * @param price double -- price of the addition
   */
  public void addHamburgerAddition4(String name, double price) {
    this.addition4Name = name;
    this.addition4Price = price;
  }

  /**
   * Determines the total price of the burger and reports to console all of details of the burger
   * like a receipt
   * @return double -- total price of burger with additions
   */
  public double itemizeHamburger() {
    double hamburgerPrice = this.price;
    System.out.println(this.name + " hamburger " + "on a "
        + this.breadType + " roll " + "the price is " + this.price);

    if (addition1Name != null) {
      hamburgerPrice += this.addition1Price;
      System.out.println("Added " + addition1Name + " for an extra " + addition1Price);
    }

    if (addition2Name != null) {
      hamburgerPrice += this.addition2Price;
      System.out.println("Added " + addition2Name + " for an extra " + addition2Price);
    }

    if (addition3Name != null) {
      hamburgerPrice += this.addition3Price;
      System.out.println("Added " + addition3Name + " for an extra " + addition3Price);
    }

    if (addition4Name != null) {
      hamburgerPrice += this.addition4Price;
      System.out.println("Added " + addition4Name + " for an extra " + addition4Price);
    }

    System.out.println("Total Price = " + hamburgerPrice);
    return hamburgerPrice;

  }




}
