package com.pluralsight;



public class House extends Asset {

    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;

    public House(){}

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    public House(String dateAcquired, double originalCost, String address, int condition, int squareFoot, int lotSize) {
        super(dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    @Override
    public double getValue(){
        double price;

        switch (this.condition){
            case 1 -> price = 180;
            case 2 -> price = 130;
            case 3 -> price = 90;
            default -> {
                price = 80;
            }

        }
        double finalValue = price * this.squareFoot + .25 * this.lotSize;
        return finalValue;
    }
}




//The House class inherits from Asset can be defined with the following:
//Properties: address : String
//condition : int (1 -excellent, 2 -good, 3 -fair, 4 -poor)
//squareFoot : int
//lotSize : int
//Methods: constructor
//all getters / setters
//getValue() : double (override)
//// A house's value is determined as
//// $180.00 per square foot (excellent)
//// $130.00 per square foot (good)
//// $90.00 per square foot (fair)
//// $80.00 per square foot (poor)
//// PLUS 25 cents per square foot of lot size