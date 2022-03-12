import java.util.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.Map.Entry;
class q1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
            for(int i:a){
                h.put(i,h.getOrDefault(i,0)+1);
            }
        /*LinkedHashMap<Integer, Integer> sortedMap = h.entrySet().stream()
        .sorted((k1, k2) -> -k1.getValue().compareTo(k2.getValue()));*/
        Map<Integer, Integer> sortedMap = sortHashMapByValues(h);
        List<Entry<Integer,Integer>> A = new ArrayList(sortedMap.entrySet());
        //System.out.println(A);
        int x = A.get(0).getValue();
        A.remove(0);
        if(h.size()==1){
            System.out.println(0);
        }
        else if(x<2){
            System.out.println(-1);
        }
        else{
            int ans=0;
            for(Entry<Integer,Integer> e:A){
                ans+=e.getValue();
            }
            System.out.println(ans+1);
        }
    }
    }
    public static LinkedHashMap<Integer, Integer> sortHashMapByValues(
        HashMap<Integer, Integer> passedMap) {
    List<Integer> mapKeys = new ArrayList<>(passedMap.keySet());
    List<Integer> mapValues = new ArrayList<>(passedMap.values());
    Collections.sort(mapValues,Collections.reverseOrder());
    Collections.sort(mapKeys,Collections.reverseOrder());

    LinkedHashMap<Integer, Integer> sortedMap =
        new LinkedHashMap<>();

    Iterator<Integer> valueIt = mapValues.iterator();
    while (valueIt.hasNext()) {
        Integer val = valueIt.next();
        Iterator<Integer> keyIt = mapKeys.iterator();

        while (keyIt.hasNext()) {
            Integer key = keyIt.next();
            Integer comp1 = passedMap.get(key);
            Integer comp2 = val;

            if (comp1.equals(comp2)) {
                keyIt.remove();
                sortedMap.put(key, val);
                break;
            }
        }
    }
    return sortedMap;
}
}    
