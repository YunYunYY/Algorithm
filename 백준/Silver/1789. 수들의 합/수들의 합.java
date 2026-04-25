import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		long a = Long.parseLong(bf.readLine());
		long su = 0,i=1;
		while(true) {
			su+=i;
			if(su>a)break;
			i++;
		}
		System.out.println(i-1);
	}
}