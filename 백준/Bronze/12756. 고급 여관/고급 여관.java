import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		//Scanner sc = new Scanner(System.in);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        //StringBuilder sb = new StringBuilder();
        String s = bf.readLine();
        StringTokenizer st = new StringTokenizer(s);
		int a =Integer.parseInt(st.nextToken());
		int b =Integer.parseInt(st.nextToken());
		s=bf.readLine();
		StringTokenizer st2 = new StringTokenizer(s);
		int c =Integer.parseInt(st2.nextToken());
		int d =Integer.parseInt(st2.nextToken());
		
		while(b>1&&d>1) {
			b-=c;d-=a;
		}
		if(b>0) System.out.println("PLAYER A");
		else if(d>0) System.out.println("PLAYER B");
		else System.out.println("DRAW");
		
		
	}
	
	
}