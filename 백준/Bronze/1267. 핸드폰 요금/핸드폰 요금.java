import java.util.*;
import java.math.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int Y=0,M=0;
		for(int i=0;i<a;i++) {
			int b =sc.nextInt();
			int Ya = (b/30+1)*10;
			int Ma = (b/60+1)*15;
			Y+=Ya;M+=Ma;
		}
		//int Y=(sum/30+1)*10,M=(sum/60+1)*15;
		if(Y==M) System.out.println("Y M "+Y);
		else if(Y<M)System.out.println("Y "+Y);
		else System.out.println("M "+M);
	}
}