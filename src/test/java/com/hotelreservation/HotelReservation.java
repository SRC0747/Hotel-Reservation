package com.hotelreservation;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HotelReservation {
    String hotel;
    String customer;
    HotelReservation(){
        hotel = " ";
        customer = " ";
    }
    HotelReservation(String hotel,String customer){
        this.hotel = hotel;
        this.customer = customer;
    }
    void hotelDetails() {
        if (hotel == "LakeWood") {
            int rate = 110;
            System.out.println("Rate of Regular Customers of LakeWood Hotel:" + rate);
        }
        if (hotel == "BridgeWood") {
            int rate = 160;
            System.out.println("Rate of Regular Customers of BridgeWood Hotel:" + rate);
        }
        if (hotel == "RidgeWood") {
            int rate = 220;
            System.out.println("Rate of Regular Customers of RidgeWood Hotel:" + rate);
        }
    }
    void cheapestHotel() {
        int count = 0;
        count = (count + 2);
        int LakeWood_Rate = 110, BridgeWood_Rate = 160, RidgeWood_Rate = 220;
        LakeWood_Rate = (LakeWood_Rate * count);
        BridgeWood_Rate = (BridgeWood_Rate * count);
        RidgeWood_Rate = (RidgeWood_Rate * count);
        if (LakeWood_Rate < BridgeWood_Rate && LakeWood_Rate < RidgeWood_Rate) {
            System.out.println("LakeWood");
            System.out.println(LakeWood_Rate);
        }
        if (BridgeWood_Rate < LakeWood_Rate && BridgeWood_Rate < RidgeWood_Rate) {
            System.out.println("BridgeWood");
            System.out.println(BridgeWood_Rate);
        }
        if (RidgeWood_Rate < BridgeWood_Rate && RidgeWood_Rate < LakeWood_Rate) {
            System.out.println("RidgeWood");
            System.out.println(RidgeWood_Rate);
        }
    }
    //Calculating WeekDay and Weekend Rate of Regular Customers of Each Hotel.
    public void weekday_weekend_rate(){
        if (hotel == "LakeWood") {
            int weekday_rate = 110;
            int weekend_rate = 90;
            System.out.println("Weekday Rate of Regular Customers of LakeWood Hotel:" + weekday_rate);
            System.out.println("Weekend Rate of Regular Customers of LakeWood Hotel:" + weekend_rate);
        }
        if (hotel == "BridgeWood") {
            int weekday_rate = 150;
            int weekend_rate = 50;
            System.out.println("Weekday Rate of Regular Customers of BridgeWood Hotel:" + weekday_rate);
            System.out.println("Weekend Rate of Regular Customers of BridgeWood Hotel:" + weekend_rate);
        }
        if (hotel == "RidgeWood") {
            int weekday_rate = 220;
            int weekend_rate = 150;
            System.out.println("Weekday Rate of Regular Customers of RidgeWood Hotel:" + weekday_rate);
            System.out.println("Weekend Rate of Regular Customers of RidgeWood Hotel:" + weekend_rate);
        }
    }
    public void cheapest_weekday_weekend_hotel(){
        int sum_LakeWood = 0,sum_BridgeWood = 0, sum_RidgeWood = 0;
        if (hotel == "LakeWood") {
            int weekday_rate = 110;
            int weekend_rate = 90;
            sum_LakeWood = (sum_LakeWood+weekday_rate+weekend_rate);
            System.out.println("Total Weekday and Weekend rate of LakeWood Hotel:" + sum_LakeWood);
        }
        if (hotel == "BridgeWood") {
            int weekday_rate = 150;
            int weekend_rate = 50;
            sum_BridgeWood = (sum_BridgeWood+weekday_rate+weekend_rate);
            System.out.println("Total Weekday and Weekend rate of LakeWood Hotel:" + sum_BridgeWood);
        }
        if (hotel == "RidgeWood") {
            int weekday_rate = 220;
            int weekend_rate = 150;
            sum_RidgeWood = (sum_RidgeWood+weekday_rate+weekend_rate);
            System.out.println("Total Weekday and Weekend rate of LakeWood Hotel:" + sum_RidgeWood);
        }
        if (sum_LakeWood<=sum_BridgeWood && sum_LakeWood<sum_RidgeWood){
            System.out.println("LakeWood and BridgeWood with total rates $200.");
        }
        if (sum_BridgeWood<=sum_LakeWood && sum_BridgeWood<sum_RidgeWood){
            System.out.println("LakeWood and BridgeWood with total rates $200.");
        }
        if (sum_RidgeWood<sum_LakeWood && sum_RidgeWood<sum_BridgeWood){
            System.out.println("RidgeWood with total rates $370.");
        }
    }
    public void hotel_rating(){
        if (hotel == "LakeWood"){
            System.out.println("LakeWood rating is 3.");
        }
        if (hotel == "BridgeWood"){
            System.out.println("BridgeWood rating is 4.");
        }
        if (hotel == "RidgeWood"){
            System.out.println("RidgeWood rating is 5.");
        }
    }
    public void cheapest_bestRated_hotel(){
        int sum_LakeWood = 0,sum_BridgeWood = 0, sum_RidgeWood = 0;
        int LakeWood_Rate =3, BridgeWood_Rate=4, RidgeWood_Rate=5;
        if (hotel == "LakeWood") {
            int weekday_rate = 110;
            int weekend_rate = 90;
            sum_LakeWood = (sum_LakeWood+weekday_rate+weekend_rate);
        }
        if (hotel == "BridgeWood") {
            int weekday_rate = 150;
            int weekend_rate = 50;
            sum_BridgeWood = (sum_BridgeWood+weekday_rate+weekend_rate);
        }
        if (hotel == "RidgeWood") {
            int weekday_rate = 220;
            int weekend_rate = 150;
            sum_RidgeWood = (sum_RidgeWood+weekday_rate+weekend_rate);
        }
        if ((sum_BridgeWood<=sum_LakeWood && sum_BridgeWood<sum_RidgeWood) && (LakeWood_Rate<BridgeWood_Rate && BridgeWood_Rate<RidgeWood_Rate)){
            System.out.println("BridgeWood");
            System.out.println("Rating:"+BridgeWood_Rate);
            System.out.println("Total Rates: $"+sum_BridgeWood);
        }
    }
    public void costly_bestRated_hotel(){
        int sum_LakeWood = 0,sum_BridgeWood = 0, sum_RidgeWood = 0;
        int LakeWood_Rate =3, BridgeWood_Rate=4, RidgeWood_Rate=5;
        if (hotel == "LakeWood") {
            int weekday_rate = 110;
            int weekend_rate = 90;
            sum_LakeWood = (sum_LakeWood+weekday_rate+weekend_rate);
        }
        if (hotel == "BridgeWood") {
            int weekday_rate = 150;
            int weekend_rate = 50;
            sum_BridgeWood = (sum_BridgeWood+weekday_rate+weekend_rate);
        }
        if (hotel == "RidgeWood") {
            int weekday_rate = 220;
            int weekend_rate = 150;
            sum_RidgeWood = (sum_RidgeWood+weekday_rate+weekend_rate);
        }
        if ((sum_RidgeWood>sum_LakeWood && sum_RidgeWood>sum_BridgeWood) && (LakeWood_Rate<BridgeWood_Rate && BridgeWood_Rate<RidgeWood_Rate)){
            System.out.println("RidgeWood");
            System.out.println("Rating:"+RidgeWood_Rate);
            System.out.println("Total Rates: $"+sum_RidgeWood);
        }
    }

    //Calculating WeekDay and Weekend Rate of Reward Customers of Each Hotel.
    public void weekday_weekend_rate_RewardCustomers(){
        if (hotel == "LakeWood") {
            int weekday_rate = 80;
            int weekend_rate = 80;
            System.out.println("Weekday Rate of Regular Customers of LakeWood Hotel:" + weekday_rate);
            System.out.println("Weekend Rate of Regular Customers of LakeWood Hotel:" + weekend_rate);
        }
        if (hotel == "BridgeWood") {
            int weekday_rate = 110;
            int weekend_rate = 50;
            System.out.println("Weekday Rate of Regular Customers of BridgeWood Hotel:" + weekday_rate);
            System.out.println("Weekend Rate of Regular Customers of BridgeWood Hotel:" + weekend_rate);
        }
        if (hotel == "RidgeWood") {
            int weekday_rate = 110;
            int weekend_rate = 40;
            System.out.println("Weekday Rate of Regular Customers of RidgeWood Hotel:" + weekday_rate);
            System.out.println("Weekend Rate of Regular Customers of RidgeWood Hotel:" + weekend_rate);
        }
    }

    public void cheapest_bestRated_hotel_RewardCustomer(){
        int sum_LakeWood = 0,sum_BridgeWood = 0, sum_RidgeWood = 0;
        int LakeWood_Rate =3, BridgeWood_Rate=4, RidgeWood_Rate=5;
        if (hotel == "LakeWood") {
            int weekday_rate = 80;
            int weekend_rate = 80;
            sum_LakeWood = (sum_LakeWood+weekday_rate+weekend_rate);
        }
        if (hotel == "BridgeWood") {
            int weekday_rate = 110;
            int weekend_rate = 50;
            sum_BridgeWood = (sum_BridgeWood+weekday_rate+weekend_rate);
        }
        if (hotel == "RidgeWood") {
            int weekday_rate = 100;
            int weekend_rate = 40;
            sum_RidgeWood = (sum_RidgeWood+weekday_rate+weekend_rate);
        }
        if ((sum_RidgeWood<=sum_LakeWood && sum_RidgeWood<sum_BridgeWood) && (LakeWood_Rate<BridgeWood_Rate && BridgeWood_Rate<RidgeWood_Rate)){
            System.out.println("RidgeWood");
            System.out.println("Rating:"+RidgeWood_Rate);
            System.out.println("Total Rates: $"+sum_RidgeWood);
        }
    }
    public static void main(String[] args) throws Exception {
        HotelReservation hotel1 = new HotelReservation("LakeWood","Regular");
        HotelReservation hotel2 = new HotelReservation("BridgeWood","Regular");
        HotelReservation hotel3 = new HotelReservation("RidgeWood","Regular");
        hotel1.hotelDetails();
        hotel2.hotelDetails();
        hotel3.hotelDetails();
        String sDate1="10-09-2020";
        String sDate2="11-09-2020";
        Date date1=new SimpleDateFormat("dd-MM-yyyy").parse(sDate1);
        Date date2=new SimpleDateFormat("dd-MM-yyyy").parse(sDate2);
        System.out.println(sDate1+"\t"+date1);
        System.out.println(sDate2+"\t"+date2);
        HotelReservation hotel = new HotelReservation();
        //Checking cheapest rated Hotel.
        hotel.cheapestHotel();
        //Calculating Weekday and Weekend rates of each hotel.
        hotel1.weekday_weekend_rate();;
        hotel2.weekday_weekend_rate();
        hotel3.weekday_weekend_rate();
        //Checking Cheapest Weekday and Weekend rated Hotel.
        hotel1.cheapest_weekday_weekend_hotel();
        hotel2.cheapest_weekday_weekend_hotel();
        hotel3.cheapest_weekday_weekend_hotel();

        //Checking the rating of the Hotels.
        hotel1.hotel_rating();
        hotel2.hotel_rating();
        hotel3.hotel_rating();

        //Checking the Best Rated Cheapest Hotel.
        hotel2.cheapest_bestRated_hotel();

        //Checking the Best Rated Costly Hotel.
        hotel3.costly_bestRated_hotel();

        //Checking the WeekDay and WeekEnd Rate of Reward Customers.
        HotelReservation hotel1_rewardCustomer = new HotelReservation("LakeWood","Reward");
        HotelReservation hotel2_rewardCustomer = new HotelReservation("BridgeWood","Reward");
        HotelReservation hotel3_rewardCustomer = new HotelReservation("RidgeWood","Reward");
        hotel1_rewardCustomer.weekday_weekend_rate_RewardCustomers();
        hotel2_rewardCustomer.weekday_weekend_rate_RewardCustomers();
        hotel3_rewardCustomer.weekday_weekend_rate_RewardCustomers();

        //Displaying Cheapest Best Rated Hotel for Reward Customers.
        hotel1_rewardCustomer.cheapest_bestRated_hotel_RewardCustomer();
        hotel2_rewardCustomer.cheapest_bestRated_hotel_RewardCustomer();
        hotel3_rewardCustomer.cheapest_bestRated_hotel_RewardCustomer();
    }
}
