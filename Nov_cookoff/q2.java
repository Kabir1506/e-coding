import java.util.*;

class q2{
    public static void main(String[] args){
        //System.out.println("Hello");
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            if(n%2==0){
                System.out.println(n);
            }
            else{
                System.out.println(n-1);
            }
        }
    }
}