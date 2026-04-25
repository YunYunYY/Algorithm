import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String a = bf.readLine();
		int j=0,i=0;
		for(int k=0;k<a.length();k++) {
			if(k+2<a.length()&&a.charAt(k)=='J'&&a.charAt(k+1)=='O'&&a.charAt(k+2)=='I') {
				j++;k++;
			}
			else if(k+2<a.length()&&a.charAt(k)=='I'&&a.charAt(k+1)=='O'&&a.charAt(k+2)=='I') {
				i++;k++;
			}
		}
		System.out.println(j);
		System.out.println(i);
		
	}
}