import java.io.*;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;
public class Main{

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		String[] cc = {"ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
		String c = bf.readLine();
		int time = 0;
		int qq = -1;
		
		for(int i=0;i<c.length();i++) {
			if(c.charAt(i)==' ') {
				time+=a;qq=-1;
			}
			else {
			int d = -1,e=-1;
			for(int j=0;j<cc.length;j++) {
				for(int k=0;k<cc[j].length();k++) {
					if(cc[j].charAt(k)==c.charAt(i)) {
						d=j;e=k+1;
						break;
					}
				}
			}
			if(d==qq)time+=b;
			qq=d;
			time+=(a*e);
			}
		}
		System.out.println(time);
	}

}
