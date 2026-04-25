import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stt = new StringTokenizer(bf.readLine());
		int a = Integer.parseInt(stt.nextToken());
		int b = Integer.parseInt(stt.nextToken());
		int c = Integer.parseInt(stt.nextToken());
		
		if((c-a)%b!=0)System.out.println("X");
		else if(b==-1&&(a<c)) System.out.println("X");
		else if((c-a)/b<0) System.out.println("X");
		else System.out.println((c-a)/b+1);
	}
}