import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] aa = new int[3];
		for(int i=0;i<3;i++)
			aa[i]=sc.nextInt();
		if(aa[0]+aa[1]==aa[2])
			System.out.println(aa[0]+"+"+aa[1]+"="+aa[2]);
		else if(aa[0]==aa[1]+aa[2])
			System.out.println(aa[0]+"="+aa[1]+"+"+aa[2]);
		else if(aa[0]-aa[1]==aa[2])
			System.out.println(aa[0]+"-"+aa[1]+"="+aa[2]);
		else if(aa[0]==aa[1]-aa[2])
			System.out.println(aa[0]+"="+aa[1]+"-"+aa[2]);
		else if(aa[0]*aa[1]==aa[2])
			System.out.println(aa[0]+"*"+aa[1]+"="+aa[2]);
		else if(aa[0]==aa[1]*aa[2])
			System.out.println(aa[0]+"="+aa[1]+"*"+aa[2]);
		else if(aa[0]==aa[1]/aa[2])
			System.out.println(aa[0]+"="+aa[1]+"/"+aa[2]);
		else
			System.out.println(aa[0]+"/"+aa[1]+"="+aa[2]);
	}

}