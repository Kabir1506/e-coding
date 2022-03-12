/*
more than 1 food from 1 location
name, gender, phoneNumber(unique) and pincode.
login_user(user_id):  this should set the context for all the next operation to be done by this user.
rate_restaurant(restaurant name, rating, comment)
User should be able to get list of all serviceable restaurant, food item name and price in descending order: show_restaurant(rating/price)
Place an order from any restaurant with any allowed quantity.
place_order(restaurant name, quantity)

*/
import java.util.*;
class User{
    String name;
    char gender; 
    String phoneNumber;
    String pincode;
    User(String name,char gender,String phoneNumber,String pincode){
        this.name=name;
        this.gender=gender;
        this.phoneNumber=phoneNumber;
        this.pincode=pincode;
    }
}