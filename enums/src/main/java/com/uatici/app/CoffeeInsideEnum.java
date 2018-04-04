package com.uatici.app;

/**
 * Hello world!
 *
 */
public class CoffeeInsideEnum 
{

    enum EnumCoffeeSize {BIG,HUGE,OVERHELMING}

    private EnumCoffeeSize enumCoffeeSize;


    public static void main( String[] args )
    {
        CoffeeInsideEnum coffeeInsideEnum = new CoffeeInsideEnum();
        coffeeInsideEnum.enumCoffeeSize = EnumCoffeeSize.OVERHELMING;
        System.out.println(coffeeInsideEnum.enumCoffeeSize.name());
    }
}
