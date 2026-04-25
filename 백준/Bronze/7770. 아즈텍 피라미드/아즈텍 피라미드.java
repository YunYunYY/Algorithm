import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		int i = 1;
		while(true) {
			
			int b = 0;
			for(int k=1;k<=i;k++) {
				for(int j=1;j<=2*k-1;j+=2)
					b+=j;
				for(int j=2*(k-1)-1;j>0;j-=2)
					b+=j;
			}
			
			if(a<b) {
				i--;
				break;
			}			
			//System.out.println("b "+b);
			i++;
		}
		System.out.println(i);
	}
	
}