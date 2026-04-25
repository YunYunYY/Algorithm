import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		if(a<100)
			System.out.println(a);
		else {
			int b = 99;
			for(int i=100;i<=a;i++)
				if(i/100+i%10==(i/10)%10*2)b++;
			System.out.println(b);
		}
		
	}
}