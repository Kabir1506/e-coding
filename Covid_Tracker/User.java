/*You need to provide following options for User:
Register: A user can register by mobile number and pincode.
Self Assessment: Users can enter:
Any symptoms (cough, sore throat, fever).
Any Travel history in the last 15 days.
Any contact with covide positive patient.
Covid Risk: Users can see the risk of being affected by Covid based on self assessment.
*/
package Covid_Tracker;
import java.util.*;
import Covid_Tracker.*;
public class User{
    int uid;
    String name;
    String mobile;
    String pin;
    List<String> sy;
    boolean travelhistory;
    boolean contactwith;
    boolean iscovidpos;
    int c=0;
    User(String _name, String _mobile, String _pin){
        this.uid = c++;
        this.name = _name;
        this.mobile = _mobile;
        this.pin = _pin;
    }
}