class Solution
{
    public int solution(int n, int a, int b)
    {
        int[] aa = new int[n];
        for(int i=0;i<n;i++){
            aa[i]=i/2;
        }
        int answer = 1;
        while(true){
            if(aa[a-1]==aa[b-1])break;
            answer++;
            for(int i=0;i<n;i++)
                aa[i]/=2;
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.

        return answer;
    }
}