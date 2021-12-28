//package FIZZBUZZ;
import java.util.*;
class q1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int k = sc.nextInt();
            if(x%k==0 && y%k==0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
