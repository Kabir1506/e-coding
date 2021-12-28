package Covid_Tracker;
import java.util.*;
//import Covid_Tracker.User;
//import Covid_Tracker.Service;
public class Driver{
    public static void main(String args[]){
        User u1 = new User("ABC","9999999999","560037");
        Service s1 = new Service();
        s1.registerUser(u1);
        List<String> S = new ArrayList();
        S.add("cough");
        s1.selfAssessment(0, S, false, false);
        s1.calculateRisk(u1);
    }
}