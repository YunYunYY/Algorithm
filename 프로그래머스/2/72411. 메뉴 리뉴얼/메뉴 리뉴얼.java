import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
class Solution {
    static HashMap<String, Integer> mm = new HashMap<String, Integer>();
	static String b;
    public String[] solution(String[] orders, int[] course) {
       
		
		for(int i=0;i<orders.length;i++) {
			char[] aa = orders[i].toCharArray();
			Arrays.sort(aa);
			orders[i]=new String(aa);
			
			int a = orders[i].length();
			map = new int[a];
			b=orders[i];
			for(int j=0;j<course.length;j++) {
				if(a<course[j])continue;
				com(a, course[j]);
			}
			
		}
		HashMap<Integer, Integer> cc = new HashMap<Integer, Integer>();
		ArrayList<String> dd = new ArrayList<String>();
		for(String i : mm.keySet()) {
			int c = mm.get(i);
			cc.put(i.length(),Math.max(cc.getOrDefault(i.length(), 0), c));
		}
		
		for(int i=0;i<course.length;i++) {
            if(!cc.containsKey(course[i]))continue;
			int e = cc.get(course[i]);
			if(e<2)continue;
			for(String j:mm.keySet())
				if(j.length()==course[i]&&e==mm.get(j)) dd.add(j);
		}
		
		String[] answer = new String[dd.size()];
		int q=0;
		for(String i:dd)
			answer[q++]=i;
		Arrays.sort(answer);
		
		return answer;
    }
    static int[] map;
	static void com(int t,int n) {
		if(t==n) {
			for(int i=0;i<t;i++) 
				map[i]=1;
			qqq();
			return;
		}
		if(n==0) {
			for(int i=0;i<t;i++) map[i]=0;
			qqq(); return;
		}
		map[t-1]=0;
		com(t-1, n);
		map[t-1]=1;
		com(t-1, n-1);
	}
	static void qqq() {
		String t = "";
		for(int i=0;i<map.length;i++)
			if(map[i]==1) t+=b.charAt(i);
		mm.put(t, mm.getOrDefault(t, 0)+1);
	}
}