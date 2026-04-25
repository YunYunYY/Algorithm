import java.util.*;

public class Main {
	static int[] cup = {1,0,0}; 
	static void SS(int a, int b) {
		int tmp = cup[a];cup[a]=cup[b];cup[b]=tmp;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		for(int i=0;i<a.length();i++) {
			switch(a.charAt(i)) {
			case 'A':SS(0,1);break;
			case 'B':SS(1,2);break;
			case 'C':SS(0,2);break;
			}
		}
		for(int i=0;i<3;i++)
			if(cup[i]==1)
				System.out.println(i+1);
	}

}