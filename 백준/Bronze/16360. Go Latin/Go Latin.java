
import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<a;i++) {
			String b = bf.readLine();
			boolean q = false;
			String w = "";
			switch(b.charAt(b.length()-1)) {
			case 'a':w="as";break;
			case 'i':
			case 'y':w="ios";break;
			case 'l':w="les";break;
			case 'o':w="os";break;
			case 'r':w="res";break;
			case 't':w="tas";break;
			case 'u':w="us";break;
			case 'v':w="ves";break;
			case 'w':w="was";break;
			case 'n':w="anes";break;
			}
			if(b.charAt(b.length()-1)=='e'&&b.charAt(b.length()-2)=='n')
				sb.append(b.substring(0, b.length()-2)+"anes\n");
			else if(w=="")
				sb.append(b+"us\n");
			else
				sb.append(b.substring(0,b.length()-1)+w+"\n");
			
		}
		System.out.println(sb);
	}
	

}