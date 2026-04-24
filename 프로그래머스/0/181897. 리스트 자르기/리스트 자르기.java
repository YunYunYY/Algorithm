import java.util.Arrays;
class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        if(n==1){
            int[] answer=new int[slicer[1]+1];
            for(int i=0;i<answer.length;i++){
                answer[i]=num_list[i];
            }
            return answer;
        }
        else if(n==2){
            int[] answer=new int[num_list.length-slicer[0]];
            int idx = slicer[0];
            for(int i=0;i<answer.length;i++){
                answer[i]=num_list[idx];
                idx++;
            }
            return answer;
        }
        else if(n==3){
            int[] answer= new int[slicer[1]-slicer[0]+1];
            int idx=slicer[0];
            for (int i=0;i<answer.length;i++){
                answer[i]=num_list[idx];
                idx++;
            }
            return answer;
        }
        else{
            int[] answer = new int[(slicer[1]-slicer[0])/slicer[2]+1];
            int idx=slicer[0];
            for(int i=0;i<answer.length;i++){
                answer[i]=num_list[idx];
                idx+=slicer[2];
            }
            return answer;
        }
        
        
    }
}