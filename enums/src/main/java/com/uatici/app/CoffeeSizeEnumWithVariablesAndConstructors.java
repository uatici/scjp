package com.uatici.app;

enum CoffeeSizeEnumWithVariablesAndConstructors {

    BIG(8) , 
    HUGE(10) , 
    OVERHELMING(16){
        public String getLidCode (){
            return "A";
        }
    };

    private int ounces;

	CoffeeSizeEnumWithVariablesAndConstructors(int ounces){

        this.ounces = ounces;

    }

    public int getOunces() {
        return ounces;
    }

    public String getLidCode (){
        return "B";
    }

}