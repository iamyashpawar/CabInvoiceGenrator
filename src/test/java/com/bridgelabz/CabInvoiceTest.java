package com.bridgelabz;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.List;
//import org.junit.jupiter.api.Test;

public class CabInvoiceTest {
    @Test
    public void givenDistanceAndTimeShouldReturnTotalFare() {
        CabInvoice cabInvoice = new CabInvoice();
        double actualCost = cabInvoice.calculateFare(5, 30);

        Assertions.assertEquals(80, actualCost);
    }

    @Test
    public void givenDistanceAndTimeShouldReturnMinimumFare() {
        CabInvoice cabInvoice = new CabInvoice();
        double actualCost = cabInvoice.calculateFare(0.2, 2);

        Assertions.assertEquals(5, actualCost);
    }

    @Test
    public void givenMultipleRidesShouldReturnTotalFare() {
        CabInvoice cabInvoice = new CabInvoice();
        Ride[] rides = {new Ride(5, 30, 001), new Ride(10, 20, 001), new Ride(15, 40, 001)};
        double actualCost = cabInvoice.calculateFare(rides);
        Assertions.assertEquals(390, actualCost);

    }

    @Test
    public void givenMultipleRidesShouldReturnEnhancedInvoice() {
        CabInvoice cabInvoice = new CabInvoice();
        Ride[] rides = {new Ride(5, 30, 001), new Ride(10, 20, 001), new Ride(15, 40, 001)};
        Invoice invoice = cabInvoice.generateInvoice(rides);
        Invoice expectedInvoice = new Invoice(3,390,130);
        Assertions.assertEquals(expectedInvoice, invoice);
    }

    @Test
    public void givenUseridShouldReturnInvoice(){

      //  String userId ="Alpha";

        Ride firstRide = new Ride(50,10, 001 );
        Ride secondRide = new Ride(15,7, 002 );

        List<Ride> rides =new ArrayList<>();
        rides.add(firstRide);
        rides.add(secondRide);
        User.AddRides(UserId,rides);


        



        }
    }
}



