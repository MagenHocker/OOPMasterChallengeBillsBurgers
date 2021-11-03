package com.company;

public class DeluxeBurger extends Hamburger {

  public DeluxeBurger(String meat, double price, String breadType) {
    super("Deluxe", meat, price, breadType);
    super.addHamburgerAddition1("chips", 2);
    super.addHamburgerAddition2("drink", 2.5);
  }

  /**
   * Updates the burger with an addition and the price of that addition
   *
   * @param name  String -- name of the addition
   * @param price double -- price of the addition
   */
  @Override
  public void addHamburgerAddition1(String name, double price) {
    System.out.println("Cannot add additional items to deluxe burger");
  }

  /**
   * Updates the burger with an addition and the price of that addition
   *
   * @param name  String -- name of the addition
   * @param price double -- price of the addition
   */
  @Override
  public void addHamburgerAddition2(String name, double price) {
    System.out.println("Cannot add additional items to deluxe burger");
  }

  /**
   * Updates the burger with an addition and the price of that addition
   *
   * @param name  String -- name of the addition
   * @param price double -- price of the addition
   */
  @Override
  public void addHamburgerAddition3(String name, double price) {
    System.out.println("Cannot add additional items to deluxe burger");
  }

  /**
   * Updates the burger with an addition and the price of that addition
   *
   * @param name  String -- name of the addition
   * @param price double -- price of the addition
   */
  @Override
  public void addHamburgerAddition4(String name, double price) {
    System.out.println("Cannot add additional items to deluxe burger");
  }
}
