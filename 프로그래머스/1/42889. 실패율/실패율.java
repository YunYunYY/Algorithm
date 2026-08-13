import java.io.*;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
class Solution {
    public int[] solution(int N, int[] stages) {
            int[] answer = new int[N];
		for(int i=0;i<stages.length;i++){
            int a = stages[i]-2;
            while(a>=0) {
            	answer[a]++;
            	a--;
            }
        }
		
		
		
		double[] fail = new double[N];
		fail[0]=(double)answer[0]/stages.length;
		for(int i=1;i<N;i++) {
			fail[i]=(double)answer[i]/answer[i-1];
		}
		HashMap<Integer, Double> aa = new HashMap<Integer, Double>();
		for(int i=0;i<N;i++) {
			aa.put(i+1, fail[i]);
		}
		int i=0;
		List<Map.Entry<Integer, Double>> entryList = new LinkedList<Map.Entry<Integer,Double>>(aa.entrySet());
		entryList.sort(Map.Entry.comparingByValue());
		for(Map.Entry<Integer, Double> entry : entryList) {
			//System.out.println("key : "+entry.getKey()+", value : "+entry.getValue());
			answer[i]=entry.getKey();
			i+=1;
		}
		
		
        return answer;
    }
}