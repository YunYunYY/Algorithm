import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] bb=new int[26];
		String b = sc.next();
		for(int i=0;i<b.length();i++) 
			bb[b.charAt(i)-'A']++;
		int ncnt=0;
		for(int i=0;i<a-1;i++) {
			String c = sc.next();
			int[] cc=new int[26];
			int[] dd = new int[26];
			for(int j=0;j<c.length();j++) 
				cc[c.charAt(j)-'A']++;
			
			int cnty=0,cntm=0,cntz=0,cnte=0;
			for(int j=0;j<26;j++) {
				dd[j]=bb[j]-cc[j];
				if(dd[j]==1)
					cnty++;
				else if(dd[j]==-1)
					cntm++;
				else if(dd[j]==0)
					cntz++;
				else
					cnte++;
			}
			if(cnte!=0) ncnt++;
			else if(cnty>1||cnty<-1) ncnt++;
			else if(cntm>1||cntm<-1) ncnt++;
			
		}
		System.out.println(a-ncnt-1);
		
		
	}

}