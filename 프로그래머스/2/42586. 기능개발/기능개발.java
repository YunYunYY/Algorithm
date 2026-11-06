import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] aa = new int[speeds.length];
        for(int i=0;i<aa.length;i++){
            aa[i]=(100-progresses[i]-1)/speeds[i]+1;
        }
        int k = aa[0], id = 0;
        List<Integer> bb = new ArrayList<>();
        bb.add(0);
        for(int i : aa){
            if(i<=k) bb.set(id,bb.get(id)+1);
            else{
                k=i;id++;
                bb.add(1);
            }
        }
        int[] answer = new int[id+1];
        for(int i=0;i<answer.length;i++){
            answer[i]=bb.get(i);
        }
        
        return answer;
    }
}