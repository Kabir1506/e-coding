import java.util.*;

class q5{
    public static void main(String[] args){
        //System.out.println("Hello");
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            long a[] = new long[n];
            for(int j=0;j<n;j++){
                a[j]=sc.nextLong();
            }
            long diff[] = new long[n-1];
            for(int j=1;j<n;j++){
                diff[j-1]=a[j]-a[j-1];
            }
            long left[] = new long[n-1];
            long right[] = new long[n-1];
            left[0]=diff[0];
            right[n-2]=diff[n-2];
            long ans=0;
            for(int j=1;j<n-1;j++){
                left[j]=left[j-1]+diff[j];
            }
            for(int j=diff.length-2;j>=0;j--){
                right[j]=right[j+1]+diff[j];
            }
            for(int j=1;j<diff.length;j++){
                ans+=diff[j]*diff[j-1];
            }
            System.out.println(Arrays.toString(diff));
            System.out.println(Arrays.toString(left));
            System.out.println(Arrays.toString(right));
            for(int j=0;j<diff.length-2;j++){
                ans+=Math.max(left[j]*right[j+1],left[j+1]*right[j+2]);
            }
            System.out.println(ans);
        }
    }
}