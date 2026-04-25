import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String a = bf.readLine();
		int[] aa = new int[10];
		for(int i=0;i<a.length();i++)
			aa[a.charAt(i)-'0']++;
		int sum=0;
		StringBuilder sb = new StringBuilder();
		for(int i=9;i>-1;i--) {
			sum+=i*aa[i];
			for(int j=0;j<aa[i];j++)
				sb.append(i);
		}
		if(sum%3!=0||aa[0]==0)System.out.println(-1);
		else System.out.println(sb);
	}
}