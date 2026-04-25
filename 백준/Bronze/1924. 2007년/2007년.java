import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;
public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer (bf.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		String[]aa = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
		switch(a) {
		case 1:System.out.println(aa[b%7]);break;
		case 2:System.out.println(aa[(b+3)%7]);break;
		case 3:System.out.println(aa[(b+3)%7]);break;
		case 4:System.out.println(aa[(b+6)%7]);break;
		case 5:System.out.println(aa[(b+1)%7]);break;
		case 6:System.out.println(aa[(b+4)%7]);break;
		case 7:System.out.println(aa[(b+6)%7]);break;
		case 8:System.out.println(aa[(b+2)%7]);break;
		case 9:System.out.println(aa[(b+5)%7]);break;
		case 10:System.out.println(aa[b%7]);break;
		case 11:System.out.println(aa[(b+3)%7]);break;
		case 12:System.out.println(aa[(b+5)%7]);break;
		}
	}

}