package com.pluralsight;

import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<>();

        House mainHouse = new House("01/21/2025", 400_000, "800 Malcom X",
                1, 3000, 100);

        House vacationHouse = new House("12/21/2026", 800_000, "800 5th Avenue",
                2, 8000, 1000);

        Vehicle tommySTruck = new Vehicle("12/25/2000", 50000, 2000,
                 "Toyota", 320_000);

        Vehicle tommySPorscheGT = new Vehicle("12/25/2026", 500000, 2026,
                "Porsche", 100_200);

        assets.add(mainHouse);
        assets.add(vacationHouse);
        assets.add(tommySTruck);
        assets.add(tommySPorscheGT);

        for(Asset asset: assets){
            if (asset instanceof House){
                House house = (House)asset;
                System.out.printf("Date Acquired: %s, original_cost: %.2f, current_cost: %.2f, square_foot: %d" +
                                ", lot_size: %d",
                        house.getDateAcquired(), house.getOriginalCost(), house.getValue(), house.getSquareFoot(),
                        house.getLotSize());
            }

            if (asset instanceof Vehicle){
                Vehicle vehicle = (Vehicle) asset;
                System.out.printf("Date Acquired: %s, original_cost: %.2f, current_cost: %.2f, mileage: %d, year: %d",
                        vehicle.getDateAcquired(), vehicle.getOriginalCost(), vehicle.getValue(),
                        vehicle.getOdometer(), vehicle.getYear());
            }
            System.out.println();
        }
    }
}


//This program will not have a user interface. In your main(), create an ArrayList of
//Asset objects.
//Load it with your Assets. Include at least 2 houses (you have a vacation home!) and at
//least two vehicles. Use descriptions like "my house" or "Tom's truck" for the assets.

//Now, loop through the Asset collection displaying the description of each asset, the
//date you acquired it, how much you paid for it, and its value.
//When that works, go back and include in the display either the address of the house or
//the year and make/model of the vehicle. You will need to use instanceof when you
//loop through the assets to detect the type of asset it is. Once you know whether it is a
//House or Vehicle, you will need to downcast it so that you can call the methods of
//the specific type