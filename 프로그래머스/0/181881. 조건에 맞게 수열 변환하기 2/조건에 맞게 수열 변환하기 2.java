class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        while (true){
            int[] kk = arr.clone();
            boolean b = true;
            for(int i=0;i<arr.length;i++){
                if (arr[i]>=50 && arr[i]%2==0)
                    arr[i]=arr[i]/2;
                else if (arr[i]<50 && arr[i]%2==1)
                    arr[i]=arr[i]*2+1;
                
                if(arr[i]!=kk[i]) b=false;
            }
            if (b) break;
            answer+=1;
        }
        return answer;
    }
}