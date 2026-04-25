import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		if(a<5)System.out.println(4);
		else {
			int i=1;
			while(true) {
				long q = i*i;
				if(q>=a) {
					long w = (i-1)*(i-1);
					if(a<=w+i-1)
						System.out.println((i-2)*4+2);
					else
						System.out.println((i-2)*4+4);
					return;
				}
				i++;
			}
		}
	}

}
