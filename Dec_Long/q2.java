import java.util.*;
import java.lang.*;
import java.io.*;
class q2
 {
     static class Reader 
    { 
        final private int BUFFER_SIZE = 1 << 16; 
        private DataInputStream din; 
        private byte[] buffer; 
        private int bufferPointer, bytesRead; 
  
        public Reader() 
        { 
            din = new DataInputStream(System.in); 
            buffer = new byte[BUFFER_SIZE]; 
            bufferPointer = bytesRead = 0; 
        } 
  
        public Reader(String file_name) throws IOException 
        { 
            din = new DataInputStream(new FileInputStream(file_name)); 
            buffer = new byte[BUFFER_SIZE]; 
            bufferPointer = bytesRead = 0; 
        } 
  
        public String readLine() throws IOException 
        { 
            byte[] buf = new byte[64]; // line length 
            int cnt = 0, c; 
            while ((c = read()) != -1) 
            { 
                if (c == '\n') 
                    break; 
                buf[cnt++] = (byte) c; 
            } 
            return new String(buf, 0, cnt); 
        } 
  
        public int nextInt() throws IOException 
        { 
            int ret = 0; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
            do
            { 
                ret = ret * 10 + c - '0'; 
            }  while ((c = read()) >= '0' && c <= '9'); 
  
            if (neg) 
                return -ret; 
            return ret; 
        } 
  
        public long nextLong() throws IOException 
        { 
            long ret = 0; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
            do { 
                ret = ret * 10 + c - '0'; 
            } 
            while ((c = read()) >= '0' && c <= '9'); 
            if (neg) 
                return -ret; 
            return ret; 
        } 
  
        public double nextDouble() throws IOException 
        { 
            double ret = 0, div = 1; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
  
            do { 
                ret = ret * 10 + c - '0'; 
            } 
            while ((c = read()) >= '0' && c <= '9'); 
  
            if (c == '.') 
            { 
                while ((c = read()) >= '0' && c <= '9') 
                { 
                    ret += (c - '0') / (div *= 10); 
                } 
            } 
  
            if (neg) 
                return -ret; 
            return ret; 
        } 
  
        private void fillBuffer() throws IOException 
        { 
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE); 
            if (bytesRead == -1) 
                buffer[0] = -1; 
        } 
  
        private byte read() throws IOException 
        { 
            if (bufferPointer == bytesRead) 
                fillBuffer(); 
            return buffer[bufferPointer++]; 
        } 
  
        public void close() throws IOException 
        { 
            if (din == null) 
                return; 
            din.close(); 
        } 
    }
	public static void main (String[] args) throws IOException
	    {
	        Reader sc = new Reader();
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
