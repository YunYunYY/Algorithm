import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		for(int q=0;q<a;q++){
		    StringTokenizer st = new StringTokenizer(bf.readLine());
		    int mm = 60;
		    for(int w = 0;w<3;w++){
		        int b = Integer.parseInt(st.nextToken());
		        if(b<mm)mm=b;
		    }
		    System.out.println(mm);   
		}
	}
	
}