package com.hotelreservation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HotelReservationTest_1{
    //Checking the Hotel Details.
    HotelReservation obj = new HotelReservation("LakeWood","Regular");
    //Checking the Cheapest Hotel.
    HotelReservation cheap_hotel = new HotelReservation();

    @Test
    public void toCheck_HotelDetails() {
        obj.hotelDetails();
    }

    @Test
    public void toCheck_CheapHotel() {
        cheap_hotel.cheapestHotel();
    }
}