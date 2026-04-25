import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		int t=-30,u=0,o=0;
		StringTokenizer stt;
		for(int i=0;i<a;i++) {
			stt = new StringTokenizer(bf.readLine());
			String q = stt.nextToken();
			String w = stt.nextToken();
			int e = Integer.parseInt(w.substring(1));
			if(q.compareTo("temperature")==0)
				t+=e;
			else if(q.compareTo("oxygen")==0)
				o+=e;
			else
				u+=e;
			
		}
		if((t>=8&&o>=14)&&u>=9)
			System.out.println("liveable");
		else
			System.out.println("not liveable");
		
	}
}