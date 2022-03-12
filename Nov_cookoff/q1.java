import java.util.*;

class q1{
    public static void main(String[] args){
        //System.out.println("Hello");
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if((a+b)%2==0){
                System.out.println("Bob");
            }
            else{
                System.out.println("Alice");
            }
        }
    }
}