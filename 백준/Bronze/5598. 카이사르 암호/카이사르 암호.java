import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		char[] aa = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		String a = bf.readLine();
		String b = "";
		for(int i=0;i<a.length();i++)
			b+=aa[(a.charAt(i)-'A'+23)%26];
		System.out.println(b);
	}
}