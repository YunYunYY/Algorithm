import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		int[] aa = new int[a];
		for(int i=0;i<a;i++) {
			aa[i]=Integer.parseInt(bf.readLine());
		}
		int ch = a;
		while(a>=0) {
			int c = 0;
			for(int i=0;i<a;i++)
				if(aa[i]==2) c++;
			for(int i=a;i<aa.length;i++)
				if(aa[i]==1) c++;
			ch=Math.min(ch, c);
			a--;
		}
		System.out.println(ch);
		
	}

}