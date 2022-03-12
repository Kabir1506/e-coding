import java.util.*;
public class Driver{
    public static void main(String args[]){
        User u1 = new User("Kishor",'M',"1234","12");
        Service s1 = new Service();
        s1.registerUser(u1);
        s1.login_User("1234");
        
    }
}
