package Covid_Tracker;
import java.util.*;
import Covid_Tracker.*;
class AdminService extends Service{
    AdminService(){

    }
    public boolean setCovidResult(int adminid,int _uid,boolean _res){
        for(User u:users){
            if(u.uid==_uid){
                u.iscovidpos = _res;
                return true;
            }
        }
        return false;
    }
}