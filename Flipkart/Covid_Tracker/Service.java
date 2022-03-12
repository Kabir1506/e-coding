package Covid_Tracker;
import java.util.*;
import Covid_Tracker.User;
import Covid_Tracker.Admin;
public class Service{
    List<User> users;
    List<Admin> Admins;
    HashMap<String,Integer> PZ = new HashMap();
    Service(){

    }
    public void registerUser(User u1){
        PZ.put(u1.pin,PZ.getOrDefault(u1.pin,0)+1);
        users.add(u1);
        System.out.println("new User created"+u1.uid);
    }
    public void selfAssessment(int _uid, List<String> _sy,boolean thistory, boolean cont){
        for(User u:users){
            if(u.uid==_uid){
                u.contactwith = cont;
                u.sy=_sy;
                u.travelhistory = thistory;
            }
        }
    }
    public int calculateRisk(User u1){
        List<String> S = u1.sy;
        //No symptoms, No travel history, No contact with covid positive patient - Risk = 5%
            if(S.size()==0 && u1.travelhistory==false &&  u1.contactwith==false)
                return 5;
            //one symptom, travel history or contact with covid positive patient is true - Risk = 50%
            else if(S.size()==1 && (u1.travelhistory==true || u1.contactwith==true))
                return 50;
            //two symptoms, travel history or contact with covid positive patient is true - Risk = 75%
            else if(S.size()==2 && (u1.travelhistory==true || u1.contactwith==true))
                return 75;
            //All 3 symptoms, travel history or contact with covid positive patient is true - Risk = 95%
            else if(S.size()==3 && (u1.travelhistory==true || u1.contactwith==true))
                return 80;
            else
                return 0; 
    }
        //
    public void getRisk(int _uid){
        int f=0;
        User u1  = null;
        for(User u:users){
            if(u.uid==_uid){
                u1=u;
                f=1;
                break;
            }
        }
        if(f==1){
            int x = calculateRisk(u1);
            System.out.println("User Risk = "+x+" %");
        }
        else{
            System.out.println("user not present");
        }
    }
    public String getZone(String pin){
        int val = PZ.getOrDefault(pin,100);
        if(val==0) return "GREEN";
        else if(val<=5) return "ORANGE";
        else return "RED";
    }
}