import java.util.*;

class Sub{
    public static void main(String[] args){
        //System.out.println("Hello");
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            int a[]  = new int[n];
            for(int j=0;j<n;j++){
                a[j]=sc.nextInt();
            }
            List<Integer> A = new ArrayList();
            List<Integer> B = new ArrayList();
            for(int j=0;j<n;j++){
                if(j%2==0){
                    A.add(a[j]);
                }
                else{
                    B.add(a[j]);
                }
            }
            Collections.sort(A,Collections.reverseOrder());
            Collections.sort(B);
            int ans=0,sum=0;
            for(int j=0;j<A.size();j++){
                sum+=A.get(j);
                if(j<B.size())
                    ans+=sum*B.get(j);
            }
            for(int j=0,k=0,l=0;j<n;j++){
                if(j%2==0){
                    a[j]=A.get(k++);
                }
                else{
                    a[j]=B.get(l++);
                }
            }
            for(int j=0;j<n;j++){
                System.out.print(a[j]+" ");
            }
            System.out.println();
            System.out.println(ans);
        }
    }
}