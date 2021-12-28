//package FIZZBUZZ;
import java.util.*;
class q3 {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            if(m==0){
                System.out.println((n*(n+1))/2);
            }
            else if(m==1){
                if(n%2==0){
                    int x = n/2;
                    int y = (x*(x+1))/2;
                    int z = ((x-1)*x)/2;
                    System.out.println(y+z);
                }
                else{
                    int x = n/2;
                    int y = (x*(x+1))/2;
                    System.out.println(y*2);
                }
            }
            else{
                int x = n/m;
                int y  = x==1?1:(x*(x-1))/2;
                int w =y*(m);
                //System.out.println("y "+y);
                int z=n-x*m;
                w+=z==1?1:(z*(z+1))/2;
                int x1 = n/m-1;
                int y1  = x1==1?1:(x1*(x1-1))/2;
                //System.out.println("y1 "+y1);
                int w1=y1*(m);
                int z1=n-x1*(m);
                w1+=z1==1?1:(z1*(z1+1))/2;
                //System.out.println(w+" "+w1);
                System.out.println(Math.min(w,w1));
            }
        }
    }
}
