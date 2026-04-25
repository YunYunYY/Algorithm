import java.io.*;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;
public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int[][]aa=new int[3][2];
		for(int i=0;i<3;i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			aa[i][0]=Integer.parseInt(st.nextToken());
			aa[i][1]=Integer.parseInt(st.nextToken());
		}
		
		int c1 = (aa[2][0]-aa[1][0])*(aa[1][1]-aa[0][1]);
		int c2 = (aa[1][0]-aa[0][0])*(aa[2][1]-aa[1][1]);
		if(c1==c2) {
			System.out.println("X");return;
		}
		
		double[] bb = new double[3];
		for(int i=0;i<3;i++) {
			bb[i]=Math.sqrt((aa[i%3][0]-aa[(i+1)%3][0])*(aa[i%3][0]-aa[(i+1)%3][0])
					+(aa[i%3][1]-aa[(i+1)%3][1])*(aa[i%3][1]-aa[(i+1)%3][1]));
		}
		Arrays.sort(bb);
		
		if(bb[0]==bb[2]) {
			System.out.println("JungTriangle");return;
		}
		if(bb[0]==bb[1]||bb[1]==bb[2]) {
			if(bb[2]==Math.sqrt(bb[1]*bb[1]*2)) {
				System.out.println("Jikkak2Triangle");return;
			}
			else if(bb[2]>Math.sqrt(bb[1]*bb[1]*2)) {
				System.out.println("Dunkak2Triangle");return;
			}
			else {
				System.out.println("Yeahkak2Triangle");return;
			}
		}
		else {
			if(bb[2]==Math.sqrt(bb[1]*bb[1]+bb[0]*bb[0])) {
				System.out.println("JikkakTriangle");return;
			}
			else if(bb[2]>Math.sqrt(bb[1]*bb[1]+bb[0]*bb[0])) {
				System.out.println("DunkakTriangle");return;
			}
			else {
				System.out.println("YeahkakTriangle");return;
			}
		}
	}

}
