import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i=0;i<answer.length;i++){
            ArrayList<Integer> aa = new ArrayList<>();
            for (int j=commands[i][0]-1;j<commands[i][1];j++)
                aa.add(array[j]);
            Collections.sort(aa);
            answer[i]=aa.get(commands[i][2]-1);
        }
        return answer;
    }
}