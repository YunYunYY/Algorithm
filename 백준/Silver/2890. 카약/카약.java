import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stt = new StringTokenizer(bf.readLine());
		int a = Integer.parseInt(stt.nextToken());
		int b = Integer.parseInt(stt.nextToken());
		int[]aa = new int[10];
		TreeSet<Integer> bb = new TreeSet<Integer>();
		for(int i=0;i<a;i++) {
			String c = bf.readLine();
			for(int j=0;j<c.length();j++) {
				boolean d = false;
				if(c.charAt(j)>='1'&&c.charAt(j)<='9') {
					aa[c.charAt(j)-'0']=j;
					bb.add(j);d=true;
				}
				if(d)break;
			}
		}
		
		int[] cc = new int[10];
		int ran=1,sz=bb.size();
		for(int i=0;i<sz;i++) {
			int k=bb.pollLast();
			for(int j=1;j<aa.length;j++)
				if(aa[j]==k)cc[j]=ran;
			ran++;
		}
		
		for(int i=1;i<cc.length;i++)
			System.out.println(cc[i]);
			
	}
}