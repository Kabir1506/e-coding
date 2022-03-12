import java.util.*;
class q2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int m = sc.nextInt();
            int n = sc.nextInt();
            StringBuilder sb = new StringBuilder("");
            if(m>n){
                for(int i=0;i<m;i++){
                    sb.append("01");
                }
                sb.append("0");
                int cnt=m-1;
                PriorityQueue<Integer> pq = new PriorityQueue();
                for(int i=0;i<sb.length();i++){
                    if(sb.charAt(i)=='1')
                        pq.add(i);
                }
                pq.poll();
                for(int i=0,k=0;i<cnt-n && !pq.isEmpty();i++,k++){
                    sb.insert(pq.poll()-1+k,'0');
                }
            }
            else if(n>m){
                for(int i=0;i<n;i++){
                    sb.append("10");
                }
                sb.append("1");
                int cnt=n-1;
                PriorityQueue<Integer> pq = new PriorityQueue();
                for(int i=0;i<sb.length();i++){
                    if(sb.charAt(i)=='0')
                        pq.add(i);
                }
                pq.poll();
                for(int i=0,k=0;i<cnt-m  && !pq.isEmpty();i++,k++){
                    sb.insert(pq.poll()-1+k,'1');
                }
            }
            else{
                for(int i=0;i<=m;i++){
                    sb.append("01");
                }
            }
            System.out.println(sb.length());
            System.out.println(sb);
        }
    }
}
