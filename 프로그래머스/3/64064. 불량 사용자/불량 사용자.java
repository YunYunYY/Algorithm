import java.util.Arrays;
import java.util.HashSet;

class Solution {
    static int ll;
    static int answer;
    static String[] bb,uu;
    static HashSet<String> cc = new HashSet<String>();
    static void proc(String[] t) {
		boolean q = true;
		for(int i=0;i<ll;i++) {
			if(bb[i].length()==t[i].length()&&q)
				for(int j=0;j<t[i].length();j++) {
					if(bb[i].charAt(j)=='*')continue;
					if(t[i].charAt(j)!=bb[i].charAt(j))
						q=false;
				}
			else q = false;
			
		}
		if(q) {
			String cString = "";
			for(int i=0;i<ll;i++)
				for(int j=0;j<uu.length;j++)
					if(t[i].compareTo(uu[j])==0) {
						cString+=j;
					}
			char[] dd = cString.toCharArray();
			Arrays.sort(dd);
			cString=new String(dd);
			if(!cc.contains(cString)) {
				answer++; cc.add(cString);
			}
			
			
		}
		
		return;
	}
	static void perm(String[]t,int a) {
		if(a==ll) proc(t);
		else {
			for(int i=a;i<t.length;i++) {
				String p;
				p=t[a];t[a]=t[i];t[i]=p;
				perm(t, a+1);
				p=t[a];t[a]=t[i];t[i]=p;
			}
		}
	}
    public int solution(String[] user, String[] ban) {
        
		ll=ban.length;
		bb=Arrays.copyOf(ban,ban.length);
		uu=Arrays.copyOf(user,user.length);
		perm(user, 0);
		
		
			
		return answer;
    }
}