package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);

        // take care about addExtraCheese and addExtratopping methods
        addExtraCheese();
        addExtraToppings();

    }
}
