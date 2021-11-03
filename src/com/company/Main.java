package com.company;

public class Main {

    public static void main(String[] args) {

        Hamburger burger1 = new Hamburger("Basic", "Sausage",
            3.56,"White");

        double price1 = burger1.itemizeHamburger();

        burger1.addHamburgerAddition1("tomato", .50);
        burger1.addHamburgerAddition2("lettuce", .35);
        burger1.addHamburgerAddition3("Cheese", 1.00);

        price1 = burger1.itemizeHamburger();

        Hamburger burger3 = new DeluxeBurger("Sausage", 4.00, "Rye");
        double price3 = burger3.itemizeHamburger();





    }
}
