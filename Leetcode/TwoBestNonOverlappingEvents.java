import java.util.*;
class TwoBestNonOverlappingEvents {
    public static int maxTwoEvents(int[][] events) {
        int n = events.length;
        Arrays.sort(events, (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
        PriorityQueue<int[]> queue = new PriorityQueue<int[]>((a, b) -> a[0] - b[0]);
        
        int maxVal = 0, ans = 0;
        for(int[] e : events){            
            int start = e[0];
            while(!queue.isEmpty()){
                if(queue.peek()[0] >= start)
                    break;
                int[] eve = queue.remove();
                maxVal = Math.max(maxVal, eve[1]);
            }
            ans = Math.max(ans, e[2] + maxVal);
            queue.add(new int[]{e[1], e[2]});
        }
        
        return ans;
    }
    public static void main(String args[]){
        int[][] e1 = new int[][]{{1,3,2},{4,5,2},{2,4,3}};
        int[][] e2 = new int[][]{{1,3,2},{4,5,2},{1,5,5}};
        int[][] e3 = new int[][]{{1,5,3},{1,5,1},{6,6,5}};
        System.out.println(maxTwoEvents(e1));
        System.out.println(maxTwoEvents(e2));
        System.out.println(maxTwoEvents(e3));
    }
}