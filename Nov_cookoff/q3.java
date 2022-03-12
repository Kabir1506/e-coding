import java.util.*;

class q3{
    public static void main(String[] args){
        //System.out.println("Hello");
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            List<Integer> A = new ArrayList();
            A.add(1);
            int k=3;
            while(A.size()<n){
                A.add(k);
                k+=2;
            }
            for(int j=0;j<n;j++){
                System.out.print(A.get(j)+" ");
            }
            System.out.println();
        }
    }
}