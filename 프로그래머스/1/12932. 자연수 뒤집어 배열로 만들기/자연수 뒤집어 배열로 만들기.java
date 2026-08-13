class Solution {
    public int[] solution(long d) {
        int a = String.valueOf(d).length();
		int[] answer = new int[a];
		
		for(int i=0;i<a;i++) {
			answer[i]=(int) (d%10);
			d/=10;
		}
		
		
        return answer;
    }
}