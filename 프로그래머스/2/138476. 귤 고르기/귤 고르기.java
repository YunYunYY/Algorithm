import java.util.*;
class Solution {
    public int solution(int k, int[] tt) {
        int answer = 0;
        HashMap<Integer,Integer> aa = new HashMap<>();
        Arrays.sort(tt);
        int a=tt[0],cnt=1;
        for(int i=1;i<tt.length;i++){
            if(tt[i]!=a){
                aa.put(cnt,aa.getOrDefault(cnt,0)+1);
                cnt=0; a=tt[i];
            }
            cnt++;
        }
        aa.put(cnt,aa.getOrDefault(cnt,0)+1);
        
        List<Integer> bb = new ArrayList<>(aa.keySet());
        Collections.sort(bb, Collections.reverseOrder());
        
        int t = 0;
        cnt=0;
        for(int p : bb){
            int c = aa.get(p);
            for(int i=0;i<c;i++){
                t+=p;cnt++;
                if(t>=k) return cnt;
            }
        }
        
        return cnt;
    }
}