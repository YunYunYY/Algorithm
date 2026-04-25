import java.io.*;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;
public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String a = bf.readLine();
		int[]aa=new int[a.length()];
		for(int i=0;i<aa.length;i++)
			aa[i]=a.charAt(i)-'0';
		int idx=aa.length-1;
		while(idx>0) {
			if(aa[idx]<5)
				aa[idx]=0;
			else {
				aa[idx-1]++;
				aa[idx]=0;
			}
			idx--;
		}
		for(int i=0;i<aa.length;i++)
			System.out.print(aa[i]);
	}

}