import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String a = bf.readLine();
		int cnt=0,idx=0;
		for(int i=0;i<a.length();i++) {
			if(idx%4!=0&&a.charAt(i)>='A'&&a.charAt(i)<='Z') {
				//System.out.println(idx+" "+a.charAt(i));
				cnt+=(4-idx%4); idx=1;
				
			}
			else idx++;
		}
		System.out.println(cnt);
	}
}