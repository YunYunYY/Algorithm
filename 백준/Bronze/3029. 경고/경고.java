import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = bf.readLine();
		StringTokenizer st = new StringTokenizer(s);
		String[] aa = s.split(":");
		
		s=bf.readLine();
		String[] bb = s.split(":");
		
		int[] cc = new int[3];
		if(aa[0].compareTo(bb[0])==0&&aa[1].compareTo(bb[1])==0&&aa[2].compareTo(bb[2])==0)
			System.out.println("24:00:00");
		else {
		cc[2]=Integer.parseInt(bb[2])-Integer.parseInt(aa[2]);
		if(cc[2]<0) {
			cc[2]+=60;
			bb[1]=String.valueOf(Integer.parseInt(bb[1])-1);
			
		}
		cc[1]=Integer.parseInt(bb[1])-Integer.parseInt(aa[1]);
		if(cc[1]<0) {
			cc[1]+=60;
			bb[0]=String.valueOf(Integer.parseInt(bb[0])-1);
		}
		cc[0]=Integer.parseInt(bb[0])-Integer.parseInt(aa[0]);
		if(cc[0]<0) {
			cc[0]+=24;
		}
		
		System.out.printf("%02d:%02d:%02d",cc[0],cc[1],cc[2]);
		}
	} 

}