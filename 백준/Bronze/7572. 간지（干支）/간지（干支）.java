import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;



public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] aa = {"6","7","8","9","0","1","2","3","4","5"};
		String[] bb = {"I","J","K","L","A","B","C","D","E","F","G","H"};
		int a = Integer.parseInt(bf.readLine());
		System.out.println(bb[a%12]+aa[a%10]);
		
	}
	
}