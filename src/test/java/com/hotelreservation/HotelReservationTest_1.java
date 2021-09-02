package com.hotelreservation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HotelReservationTest_1{
    HotelReservation obj = new HotelReservation("LakeWood","Regular");

    @Test
    public void toCheck_HotelDetails() {
        obj.hotelDetails();
    }
}