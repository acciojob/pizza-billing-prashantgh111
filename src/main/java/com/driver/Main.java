package com.driver;

import java.sql.SQLOutput;

public class Main {
  public static void main(String[] args) {
   //System.out.println("Example 1: ");
    DeluxePizza dp = new DeluxePizza(true);  // for 1st example
    System.out.println(dp.getPrice());  // ye line deluxePizza ka price print karge because by default delux me cheese and tooping add hoke ata hai
    // to veg=true yani 300 + 80(cheese)+70(topping)=450;
    dp.addTakeaway();
    dp.addExtraCheese();    // extracheese and extraTopping method kitni bhi bar call karo price ek bar hi add hoga
    dp.addTakeaway();       // same ye Method bhi
    System.out.println(dp.getBill());


    //System.out.println("Examaple 2: ");
    Pizza p = new Pizza(false);  // for 2nd example
    p.addExtraCheese();
    p.addExtraToppings();
   // p.addTakeaway(); ye galat diya hai assignment ke code me isko hata do
    System.out.println(p.getBill());
  }
}