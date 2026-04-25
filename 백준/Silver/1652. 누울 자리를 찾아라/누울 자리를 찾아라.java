import java.io.*;
import java.util.StringTokenizer;
public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		char[][]aa=new char[a][a];
		int ga=0,se=0;
		for(int i=0;i<a;i++) {
			String s = bf.readLine();
			for(int j=0;j<a;j++) {
				aa[i][j]=s.charAt(j);					
			}
		}
		for(int i=0;i<a;i++) {
			int gcnt=0;
			for(int j=0;j<a;j++) {
				if(aa[i][j]=='.')
					gcnt++;
				else {
					if(gcnt>1)ga++;
					gcnt=0;
				}
			}
			if(gcnt>1)ga++;
			
		}
		for(int i=0;i<a;i++) {
			int scnt=0;
			for(int j=0;j<a;j++)
				if(aa[j][i]=='.')
					scnt++;
				else {
					if(scnt>1)se++;
					scnt=0;
				}
			if(scnt>1)se++;
		}
		System.out.println(ga+" "+se);
		
	}

}
