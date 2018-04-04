package com.uatici.app;

public class CoffeeSizeEnumWithVariablesAndConstructorsTest {

    CoffeeSizeEnumWithVariablesAndConstructors coffeeSizeEnumWithVariablesAndConstructors;

    public static void main(String[] args) {

        CoffeeSizeEnumWithVariablesAndConstructorsTest coffeeSizeEnumWithVariablesAndConstructorsTest = new CoffeeSizeEnumWithVariablesAndConstructorsTest();
        coffeeSizeEnumWithVariablesAndConstructorsTest.coffeeSizeEnumWithVariablesAndConstructors = CoffeeSizeEnumWithVariablesAndConstructors.HUGE;
        System.out.println(
                coffeeSizeEnumWithVariablesAndConstructorsTest.coffeeSizeEnumWithVariablesAndConstructors.getOunces());

        for (CoffeeSizeEnumWithVariablesAndConstructors var : CoffeeSizeEnumWithVariablesAndConstructors.values()) {
            System.out.println(var + " -- " + var.getOunces() + " -- " + var.getLidCode());
        }

    }

}