import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	static ArrayList<String>bb=new ArrayList<String>();
	static void proc(int[]arr) {
		String g = "";
		for(int i=0;i<arr.length;i++) g+=arr[i];
		bb.add(g);
		
	}
	static void perm(int[] t,int loc) {
		if(loc==t.length) proc(t);
		else {
			for(int i=loc;i<t.length;i++) {
				int p=t[loc];t[loc]=t[i];t[i]=p;
				perm(t, loc+1);
				p=t[loc];t[loc]=t[i];t[i]=p;
			}
		}
	}
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		int[]aa = new int[a];
		for(int i=0;i<a;i++)aa[i]=i+1;
		perm(aa, 0);
		Collections.sort(bb);
		StringBuilder sb = new StringBuilder();
		for(String i:bb) {
			for(int j=0;j<i.length()-1;j++) sb.append(i.charAt(j)+" ");
			sb.append(i.charAt(i.length()-1)+"\n");
		}
		System.out.println(sb);
	}
	
}