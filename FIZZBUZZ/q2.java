import java.util.*;
class q2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            String s = sc.next();
            int cnt=1;
            List<Integer> A = new ArrayList();
            //System.out.println(s);
            for(int j=1;j<n;j++){
                if(s.charAt(j)==s.charAt(j-1)){
                    cnt++;
                }
                else{
                    A.add(cnt);
                    cnt=1;
                }
            }
            A.add(cnt);
           // System.out.println(A);
            System.out.println(A.size()/2);
        }
    }
}