import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while (true) {
			String a = bf.readLine();
			if(a.compareTo("#")==0)break;
			String b = "";
			for(int i=a.length()-1;i>=0;i--) {
				if(a.charAt(i)=='b')b+="d";
				else if(a.charAt(i)=='d')b+="b";
				else if(a.charAt(i)=='p')b+="q";
				else if(a.charAt(i)=='q')b+="p";
				else if(a.charAt(i)=='i')b+='i';
				else if(a.charAt(i)=='o')b+='o';
				else if(a.charAt(i)=='v')b+='v';
				else if(a.charAt(i)=='w')b+='w';
				else if(a.charAt(i)=='x')b+='x';
				else {
					b="INVALID";break;
				}
			}
			sb.append(b+"\n");
		}
		System.out.println(sb);
	}
}