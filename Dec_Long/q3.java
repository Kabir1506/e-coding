import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
class q3 {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader()
        {
            br = new BufferedReader(
                new InputStreamReader(System.in));
        }
 
        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt() { return Integer.parseInt(next()); }
 
        long nextLong() { return Long.parseLong(next()); }
 
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
 
        String nextLine()
        {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
 
    public static void main(String[] args)
    {
        FastReader sc = new FastReader(); 
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String s = sc.next();
            HashMap<Character,List<Integer>> h = new HashMap();
            for(int i=0;i<n;i++){
                List<Integer> A = h.getOrDefault(s.charAt(i), new ArrayList());
                A.add(i);
                h.put(s.charAt(i),A);
            }
            StringBuilder sb = new StringBuilder("");
            for(int i=0;i<n;i++){
                int index = i;
                int y=0;
                List<Integer> A = new ArrayList();
                while(true){
                    if(index<n && s.charAt(index)=='R'){
                        A = h.get('P');
                        if(A!=null)
                            y = Collections.binarySearch(A, index);
                        else
                            break;
                        if(-(y+1)>A.size()){
                            break;
                        }
                    }
                    else if(index<n && s.charAt(index)=='P'){
                        A = h.get('S');
                        if(A!=null)
                            y = Collections.binarySearch(A, index);
                        else
                            break;
                        if(-(y+1)>A.size()){
                            break;
                        }
                    }
                    else if(index<n && s.charAt(index)=='S'){
                         A = h.get('R');
                        if(A!=null)
                            y = Collections.binarySearch(A, index);
                        else
                            break;
                        if(-(y+1)>A.size()){
                            break;
                        }
                    }
                    else{
                        break;
                    }
                    //System.out.println(index+" "+y);
                    if(-(y+1)>=A.size()) break;
                    index=A.get(-(y+1));
                }
                sb.insert(i,s.charAt(index));
            }
            System.out.println(sb);
        }
    }
}
