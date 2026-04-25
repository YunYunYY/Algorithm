import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;




public class Main{
	static int c,a;
	static boolean[]bb;
	static int[] aa;
	static ArrayList<Integer> cc ;
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		a = Integer.parseInt(bf.readLine());
		aa = new int[a];
		bb= new boolean[a];
		cc= new ArrayList<Integer>();
		for(int i=0;i<a;i++)
			aa[i]=Integer.parseInt(bf.readLine())-1;
		for(int i=0;i<a;i++) {
			bb[i]=true;
			c=i;
			qqq(i);
			bb[i]=false;
		}
		System.out.println(cc.size());
		Collections.sort(cc);
		for(int i:cc)
			System.out.println(i+1);
	}
	static void qqq(int o) {
		if(!bb[aa[o]]) {
			bb[aa[o]]=true;
			qqq(aa[o]);
			bb[aa[o]]=false;
		}
		if(aa[o]==c)
			cc.add(c);
			
	}
}