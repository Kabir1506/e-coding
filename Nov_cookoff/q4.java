import java.util.*;

class q4{
    public static void main(String[] args){
        //System.out.println("Hello");
        Scanner sc = new Scanner(System.in);
        int t  = sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            long a[] = new long[n];
            for(int j=0;j<n;j++){
                a[j]=sc.nextLong();
            }
            int c[] = new int[3];
            for(long j:a){
                long x = j%3;
                int y = (int)x;
                //System.out.println("y "+y); 
                c[y]++;
            }
            if(c[1]!=c[2] && Math.abs(c[1]-c[2])%3==0){
                int ans = Math.min(c[1],c[2]);
                ans+=(Math.abs(c[1]-c[2])/3)*2;
                System.out.println(ans);
            }
            else if(c[1]==c[2]){
                System.out.println(c[1]);
            }
            else{
                System.out.println(-1);
            }
        }
    }
}