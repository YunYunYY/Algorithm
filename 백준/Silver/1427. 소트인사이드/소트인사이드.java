import java.util.*;
import java.io.*;

public class Main{
	
	public static void main(String[] args) throws IOException {
		//Scanner sc = new Scanner (System.in);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String a = bf.readLine();
		char[]aa = new char[a.length()];
		for(int i=0;i<a.length();i++)
			aa[i]=a.charAt(i);
		Arrays.sort(aa);
		for(int i=a.length()-1;i>=0;i--)
			System.out.print(aa[i]);
			
		
	}
	
}