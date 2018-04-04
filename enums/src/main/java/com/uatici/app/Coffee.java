package com.uatici.app;

public class Coffee {

    private CoffeeSizeEnum coffeeSize;

    /**
     * @return the coffeeSize
     */
    public CoffeeSizeEnum getCoffeeSize() {
        return coffeeSize;
    }

    /**
     * @param coffeeSize the coffeeSize to set
     */
    public void setCoffeeSize(CoffeeSizeEnum coffeeSize) {
        this.coffeeSize = coffeeSize;
    }

    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        coffee.coffeeSize = CoffeeSizeEnum.BIG;
        System.out.println(coffee.coffeeSize.name());
    }

}