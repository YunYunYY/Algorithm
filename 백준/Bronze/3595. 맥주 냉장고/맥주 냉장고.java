import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class Main{
	static ArrayList<Integer>aa = new ArrayList<Integer>();
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		di(a);
		int[] bb = {0,0,0};
		aa.add(1);aa.add(a);
		Collections.sort(aa);
		int mm = Integer.MAX_VALUE;
		for(int i=0;i<aa.size();i++) {
			for(int j=i;j<aa.size();j++) {
				int c = aa.get(i),d=aa.get(j);
				if(a%c!=0||a%d!=0)continue;
				//System.out.println(1+" "+c+" "+d);
				if(a%(c*d)!=0) continue;
				//System.out.println(2);
				int b = a/(c*d);
				//System.out.println(3);
				if(b<d) break;
				int e = b*c+c*d+b*d;
				if(e<mm) {
					mm=e;bb[0]=b;bb[1]=c;bb[2]=d;
					//System.out.println(bb[0]+" "+bb[1]+" "+bb[2]+" "+e);
				}
			}
		}
		System.out.println(bb[0]+" "+bb[1]+" "+bb[2]);
	}
	static void di(int a) {
		for(int i=2;i<Math.sqrt(a)+1;i++) {
			if(a%i==0) {
				aa.add(i);
				if(i!=a/i) {
					aa.add(a/i);
					//System.out.println(a/i);
				}
			}
		}
	}
}