/*
special dish location Rating average
Register_restaurant(resturant_name, list of serviceable pin-codes, food item  name, food item price, initial quantity).
update_quantity(restaurant name, quantity to Add)
A restaurant is serviceable when it delivers to the user's pincode and has non-zero quantity of food item.

*/
import java.util.*;
class Restaurant{
    int rsname;
    List<String> Pincodes;
    String foodItem;
    int fprice;
    int qant;
    int rating;
    String comment;
    Restaurant(int _rsname,List<String>_P,String food,int fprice,int quant){
        this.rsname=_rsname;
        this.Pincodes = _P;
        this.foodItem = food;
        this.fprice = fprice;
        this.quant = quant;
    }
    public boolean update_quantity(String name,int n){
        this.quant=n;
        return true;
    }
    public boolean isServiceable(String Pincode){
        return this.Pincodes.contains(Pincode);
    }
}