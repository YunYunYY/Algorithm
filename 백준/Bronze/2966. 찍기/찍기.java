import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		String b = bf.readLine();
		char[] aa = {'A','B','C'};
		char[] bb = {'B','A','B','C'};
		char[] cc = {'C','C','A','A','B','B'};
		int[] dd = new int[3];
		for(int i=0;i<a;i++) {
			char c = b.charAt(i);
			if(aa[i%aa.length]==c) dd[0]++;
			if(bb[i%bb.length]==c) dd[1]++;
			if(cc[i%cc.length]==c) dd[2]++;
		}
		int mm = 0;
		for(int i=0;i<3;i++)
			mm=Math.max(mm, dd[i]);
		System.out.println(mm);
		if(dd[0]==mm) System.out.println("Adrian");
		if(dd[1]==mm) System.out.println("Bruno");
		if(dd[2]==mm) System.out.println("Goran");
	}
}