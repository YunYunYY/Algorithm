import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        int cnt = 0;
        boolean[] bb = new boolean[n+1];
        Arrays.fill(bb,true);
        bb[0]=false;bb[1]=false;
        for(int i=2;i<bb.length;i++){
            if(bb[i]){
                int k = i*2;
                while(k<bb.length){
                    bb[k]=false;
                    k+=i;
                }
            }
        }
        List<Integer> ll = new ArrayList<>();
        for(int i=2;i<bb.length;i++){
            if(bb[i] && n%i==0){
                ll.add(i);
                while(n%i==0)
                    n/=i;
            }
        }
        
        answer=new int[ll.size()];
        for(int i=0;i<ll.size();i++)
            answer[i]=ll.get(i);
        return answer;
    }
}