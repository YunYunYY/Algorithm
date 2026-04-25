import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String a = bf.readLine();
		String b = bf.readLine();
		int[]aa = new int[26];
		int[]bb = new int[26];
		for(int i=0;i<a.length();i++)
			aa[a.charAt(i)-'a']++;
		for(int i=0;i<b.length();i++)
			bb[b.charAt(i)-'a']++;
		int cnt=0;
		for(int i=0;i<26;i++) {
			cnt+=Math.abs(aa[i]-bb[i]);
		}
		System.out.println(cnt);
	}

}