package com.pluralsight;

public class Asset {

    private String dateAcquired;
    private double originalCost;

    public Asset(){}

    public String getDateAcquired() {
        return dateAcquired;
    }

    public void setDateAcquired(String dateAcquired) {
        this.dateAcquired = dateAcquired;
    }

    public double getValue() {
        return originalCost;
    }

    public void setOriginalCost(double originalCost) {
        this.originalCost = originalCost;
    }

    public double getOriginalCost() {
        return originalCost;
    }


    public Asset(String dateAcquired, double originalCost) {
        this.dateAcquired = dateAcquired;
        this.originalCost = originalCost;
    }
}




//Create a new Java application named assets-manager.
//        WARNING: This is an academic example and is a hugely simplified version of anything
//real.
//The base class Asset can be defined with the following:
//Properties: description : String
//dateAcquired : String
//originalCost : double
//Methods: constructor
//all getters / setters
//getValue() : double // returns original cost

//You will build two derived classes: House and Vehicle.

//47


