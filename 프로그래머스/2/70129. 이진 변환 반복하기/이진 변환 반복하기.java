class Solution {
    public int[] solution(String s) {

        int i=0, cnt=0;
        while(true){
            i++;
            int nc = 0;
            for(int j=0;j<s.length();j++)
                if(s.charAt(j)=='0')
                    nc++;
            
            s=Integer.toString(s.length()-nc,2);
            cnt+=nc;
            if(s.equals("1")) break;
        }
        int[] answer = {i,cnt};
        return answer;
    }
}