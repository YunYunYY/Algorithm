class Solution {
    public String[] solution(String[] ss) {
        String[] answer = {};
        for(int i=0;i<ss.length;i++){
            if(ss[i].equals("l")){
                answer=new String[i];
                for(int k=0;k<i;k++)
                    answer[k]=ss[k];
                break;
            }
            else if(ss[i].equals("r")){
                answer=new String[ss.length-i-1];
                for(int k=0;k<ss.length-i-1;k++)
                    answer[k]=ss[k+i+1];
                break;
            }
        }
        return answer;
    }
}