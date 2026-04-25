import java.io.*;
import java.util.StringTokenizer;
public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		int jwa=0,Woo=0;
		int Mjwa=-1,MWoo=-1;
		int[] aa = new int[a];
		for(int i=0;i<a;i++) {
			aa[i]=Integer.parseInt(bf.readLine());
		}
		for(int i=0;i<a;i++) {
			if(Mjwa<aa[i]) {
				jwa++;Mjwa=aa[i];
			}
		}
		for(int i=a-1;i>=0;i--) {
			if(MWoo<aa[i]) {
				Woo++;MWoo=aa[i];
			}
		}
		System.out.println(jwa+" "+Woo);
		
	}

}