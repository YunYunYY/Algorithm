import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine(),":");
		int[]aa=new int[3];
		for(int i=0;i<3;i++)
			aa[i]=Integer.parseInt(st.nextToken());
		int[]bb=new int[3];
		st = new StringTokenizer(bf.readLine(),":");
		for(int i=0;i<3;i++)
			bb[i]=Integer.parseInt(st.nextToken());
		if(bb[0]-aa[0]<0)bb[0]+=24;
		bb[0]=bb[0]-aa[0];
		if(bb[1]-aa[1]<0) {
			bb[1]+=60;bb[0]--;
		}
		bb[1]=bb[1]-aa[1];
		if(bb[2]-aa[2]<0) {
			bb[2]+=60;bb[1]--;
		}
		if(bb[1]<0) {
			bb[1]+=60;bb[0]--;
		}
		bb[2]=bb[2]-aa[2];
		System.out.printf("%02d:%02d:%02d",bb[0],bb[1],bb[2]);
	}
	

}