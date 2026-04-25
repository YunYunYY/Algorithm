import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		char[] aa = new char [a];
		String s = bf.readLine();
		for(int i=0;i<a;i++)
			aa[i]=s.charAt(i);
		char[][] bb = {{'A','C','A','G'},{'C','G','T','A'},{'A','T','C','G'},{'G','A','G','T'}};
		for(int i=a-2;i>=0;i--) {
			int b,c;
			if(aa[i]=='A')b=0;
			else if(aa[i]=='G')b=1;
			else if(aa[i]=='C')b=2;
			else b=3;
			if(aa[i+1]=='A') c=0;
			else if(aa[i+1]=='G')c=1;
			else if(aa[i+1]=='C')c=2;
			else c=3;
			aa[i]=bb[b][c];
		}
		System.out.println(aa[0]);
	}

}