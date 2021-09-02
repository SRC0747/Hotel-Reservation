package com.hotelreservation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HotelReservationTest_1{
    //Checking the Hotel Details.
    HotelReservation obj_hotel1 = new HotelReservation("LakeWood","Regular");
    HotelReservation obj_hotel2 = new HotelReservation("BridgeWood","Regular");
    HotelReservation obj_hotel3 = new HotelReservation("RidgeWood","Regular");
    //Checking the Cheapest Hotel.
    HotelReservation cheap_hotel = new HotelReservation();

    @Test
    public void toCheck_HotelDetails() {
        obj_hotel1.hotelDetails();
    }

    @Test
    public void toCheck_CheapHotel() {
        cheap_hotel.cheapestHotel();
    }

    @Test
    public void toCheck_Weekday_Weekend_Rate() {
        obj_hotel1.weekday_weekend_rate();
        obj_hotel2.weekday_weekend_rate();
        obj_hotel3.weekday_weekend_rate();
    }

    @Test
    public void toCheck_Cheapest_Weekday_Weekend_Hotel() {
        obj_hotel1.cheapest_weekday_weekend_hotel();
        obj_hotel2.cheapest_weekday_weekend_hotel();
        obj_hotel3.cheapest_weekday_weekend_hotel();
    }
}