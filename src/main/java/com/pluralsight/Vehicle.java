package com.pluralsight;

import java.time.*;

public class Vehicle extends Asset{
    private int year;
    private String makeModel;
    private int odometer;

    public Vehicle(){}

    public Vehicle(String dateAcquired, double originalCost, int year, String makeModel, int odometer) {
        super(dateAcquired, originalCost);
        this.year = year;
        this.makeModel = makeModel;
        this.odometer = odometer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    @Override
    public double getValue() {
        int currentYear = LocalDate.now().getYear();
        int carAge = currentYear - year;
        double cost = getOriginalCost();

        switch (carAge){
            case 0, 1, 2, 3 -> cost *= .97;
            case 4, 5, 6 -> cost *= .94;
            case 7, 8, 9, 10 -> cost *= .92;
            default -> cost = 1000;
        }

        if ( odometer > 100_000 && !makeModel.equalsIgnoreCase("Toyota")
                && !makeModel.equalsIgnoreCase("Honda")) cost *= .75;

        return cost;
    }
}




//The Vehicle class inherits from Asset can be defined with the following:
//Properties: makeModel : String
//year : int
//odometer : int
//Methods: constructor
//all getters / setters
//getValue() : double (override)
//// A car's value is determined as
//// 0-3 years old - 3% reduced value of cost per year
//// 4-6 years old - 6% reduced value of cost per year
//// 7-10 years old - 8% reduced value of cost per year
//// over 10 years old - $1000.00
//// MINUS reduce final value by 25% if over 100,000 miles
//// unless makeModel contains word Honda or Toyota