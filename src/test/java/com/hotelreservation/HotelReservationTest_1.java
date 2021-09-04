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

    @Test
    public void toCheck_hotelRating() {
        obj_hotel1.hotel_rating();
        obj_hotel2.hotel_rating();
        obj_hotel3.hotel_rating();
    }

    @Test
    public void toCheck_cheapest_bestRated_hotel() {
        obj_hotel2.cheapest_bestRated_hotel();
    }

    @Test
    public void toCheck_costly_bestRated_hotel() {
        obj_hotel3.costly_bestRated_hotel();
    }

    @Test
    public void toCheck_WeekdayWeekend_RewardCustomer() {
        HotelReservation obj_hotel1_RewardCustomer = new HotelReservation("LakeWood","Regular");
        HotelReservation obj_hotel2_RewardCustomer = new HotelReservation("BridgeWood","Regular");
        HotelReservation obj_hotel3_RewardCustomer = new HotelReservation("RidgeWood","Regular");
        obj_hotel1_RewardCustomer.weekday_weekend_rate_RewardCustomers();
        obj_hotel2_RewardCustomer.weekday_weekend_rate_RewardCustomers();
        obj_hotel3_RewardCustomer.weekday_weekend_rate_RewardCustomers();
    }

    @Test
    public void toCheck_Cheapest_BestRatedHotel_RewardCustomer() {
        obj_hotel1.cheapest_bestRated_hotel_RewardCustomer();
        obj_hotel2.cheapest_bestRated_hotel_RewardCustomer();
        obj_hotel3.cheapest_bestRated_hotel_RewardCustomer();
    }

    @Test
    public void toCheck_Costiest_BestRatedHotel_RewardCustomer() {
        obj_hotel1.costiest_bestRated_hotel_RewardCustomer();
        obj_hotel2.costiest_bestRated_hotel_RewardCustomer();
        obj_hotel3.costiest_bestRated_hotel_RewardCustomer();
    }
}