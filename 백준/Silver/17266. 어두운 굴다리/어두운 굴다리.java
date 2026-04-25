import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int c = sc.nextInt();
		int[] dd = new int[c];
		for(int i=0;i<c;i++)
			dd[i]=sc.nextInt();
		int height=Math.max(dd[0],Math.abs(dd[c-1]-a));
		if(c!=1) {
		int[] ee = new int[c-1];
		for(int i=0;i<c-1;i++)
			ee[i]=dd[i+1]-dd[i];
		Arrays.sort(ee);
		height=Math.max(height, (ee[ee.length-1]+1)/2);
		}
		System.out.println(height);
		
	} 

}