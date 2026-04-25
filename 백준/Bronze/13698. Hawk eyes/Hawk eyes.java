import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String a = sc.next();
		int cup[]= {1,0,0,2};
		for(int i=0;i<a.length();i++) {
			switch(a.charAt(i)) {
			case 'A':
				int qw = cup[0];
				cup[0]=cup[1];
				cup[1]=qw;
				break;
			case 'B':
				qw = cup[0];
				cup[0]=cup[2];
				cup[2]=qw;
				break;
			case 'C':
				qw = cup[0];
				cup[0]=cup[3];
				cup[3]=qw;
				break;
			case 'D':
				qw = cup[1];
				cup[1]=cup[2];
				cup[2]=qw;
				break;
			case 'E':
				qw = cup[1];
				cup[1]=cup[3];
				cup[3]=qw;
				break;
			case 'F':
				qw = cup[2];
				cup[2]=cup[3];
				cup[3]=qw;
				break;
			}		
		}
		int fa=0,fb=0;
		for (int i=0;i<4;i++) {
			if(cup[i]==1)
				fa=i+1;
			if(cup[i]==2)
				fb=i+1;
		}
		System.out.println(fa);
		System.out.println(fb);
		
	}
}