import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.StringTokenizer;
class Solution {
    public int[] solution(String s) {
        s=s.substring(1, s.length()-1);
		String[] aa = s.split("}");
		
		Arrays.sort(aa, new Comparator<String>() {
			@Override
			public int compare(String o1,String o2) {
				return o1.length()-o2.length();
			}
		});
		HashSet<Integer> bb = new HashSet<Integer>();
		ArrayList<Integer> cc = new ArrayList<Integer>();
		for(int i=0;i<aa.length;i++) {
			aa[i]=aa[i].substring(1);
			aa[i]=aa[i].replace("{", "");
			String b = aa[i];
			StringTokenizer stt = new StringTokenizer(b,",");
			while(stt.hasMoreTokens()) {
				int c = Integer.parseInt(stt.nextToken());
				if(!bb.contains(c))cc.add(c);
				bb.add(c);
			}
			//System.out.println(bb);	
		}
		System.out.println(cc.toString());
		int[] answer=new int[cc.size()];
		for(int i=0;i<cc.size();i++)
			answer[i]=cc.get(i);
		return answer;
    }
}