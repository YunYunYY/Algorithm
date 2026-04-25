import java.io.*;

public class Main {
	static int[] dp;
	static int[] medi;
	static int day;
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		day = Integer.parseInt(bf.readLine());
		
		medi = new int[day*3];
		for(int i=1;i<medi.length;i+=3)
			medi[i]=1;
		System.out.println(go(0, medi.length-1, 0));
	}
	static int go (int a,int b,int c) {
		if(a==b)
			return 1;
		if(c%3==1) {
			//System.out.println("lunch "+c);
			if(medi[a]==1)
				return go(a+1, b, c+1);
			else {
				return go(a, b-1, c+1);
			}
		}
		else if(medi[a]==0&&medi[b]==0)
			return go(a+1,b,c+1)+go(a, b-1, c+1);
		else if(medi[a]==0)
			return go(a+1, b, c+1);
		else
			return go(a, b-1, c+1);
				
	}
}