import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		int k1 = 0,k2=0;
		for(int i=0;i<a;i++) {
			String b = bf.readLine();
			if(b.compareTo("KBS1")==0)k1=i;
			else if(b.compareTo("KBS2")==0)k2=i;
		}
		for(int i=0;i<k1;i++) System.out.print(1);
		for(int i=0;i<k1;i++) System.out.print(4);
		if(k1>k2)k2++;
		for(int i=0;i<k2;i++) System.out.print(1);
		for(int i=0;i<k2-1;i++) System.out.print(4);
		
	}
}