import java.util.*;
class Service{
    HashMap<String,User> userPhone = new HashMap();
    HashMap<User,List<Restaurant>> userRes = new HashMap();
    List<Restaurant> R = new ArrayList();
    User lUser;
    Service(){}
    public boolean registerUser(User u1){
        if(!h.containsKey(u1.phoneNumber)){
            userPhone.put(u1.phoneNumber,u1);
            return true;
        }
        else{
            u1=null;
            return false;
        } 

    }
    public boolean login_User(String phone){
        if(userPhone.containsKey(phone)){
            this.lUser = h.get(phone);
            return true;
        }
        else{
            return false;
        }
    }
    public boolean register_Restaurant(Restaurant r){
        List<Restaurant> res = userRes.get(lUser);
        res.add(r);
        userRes.put(lUser,res);
        R.add(r);
        return true;
    }
    public void showPrice(){
        R.sort(Comparator.comparing(a -> a.price));
        for(Restaurant r:R){
            System.out.println(r.rsname+" "+r.fprice);
        }
    }
    public void showRating(){
        R.sort(Comparator.comparing(a -> a.rating));
        for(Restaurant r:R){
            System.out.println(r.rsname+" "+r.fprice);
        }
    }
    public boolean placeOrder(String rname,int qty){
        for(Restaurant r:R){
            String r1name = r.rsname;
            if(r1name.equals(rname)){
                if(r.qant>=qty){
                    System.out.println("Order Placed Successfully.");
                    return true;
                }
                else{
                    System.out.println("Cannot place order");
                    return false;
                }
            }
        }
    }
    public boolean createReview(String rname,int rating,String comment){
        for(Restaurant r:R){
            String name = r.rsname;
            if(name.equals(rname)){
                r.rating = rating;
                r.comment = comment;
            }
        }
    }
    public void updateQuantity(String rname, int _quant){
        for(Restaurant r:R){
            String name = r.rsname;
            if(name.equals(rname)){
                r.quant = _quant;
            }
        }
    }
    public void updateLocation(String rname,String pincode){
        for(Restaurant r:R){
            String name = r.rsname;
            if(name.equals(rname)){
                r.Pincodes = pincode;
            }
        }
    }
}