class Solution {
    public String solution(String code) {
        StringBuilder answer = new StringBuilder();
        boolean mode = false;
        for(int i=0;i<code.length();i++){
            char k = code.charAt(i);
            if (mode){
                if(k!='1' && i%2==1)
                    answer.append(k);
                else if(k=='1')
                    mode=false;
            }
            else{
                if (k!='1' && i%2==0)
                    answer.append(k);
                else if (k=='1')
                    mode=true;
            }
                    
        }
        
        if (answer.toString().length()==0)
            answer.append("EMPTY");
        
        return answer.toString();
    }
}