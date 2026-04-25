import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		int cnt=0;
		int i=6;
		while(true) {
			if(a==Math.pow(2, i)) {
				cnt+=1;break;
			}
			else if(a>Math.pow(2, i)) {
				a-=Math.pow(2, i);
				cnt+=1;
			}
			
			i--;
		}
		System.out.println(cnt);
	}
}