import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		int cnt=0,q=1;
		while(true) {
			if(a==0)break;
			if(a<q)q=1;
			else {
				a-=q;cnt++;q++;
			}
			
		}
		System.out.println(cnt);
	}

}
