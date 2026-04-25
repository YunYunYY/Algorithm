
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;

class cache{
	int id,referenced,stamp;
	cache() {
		id=-1;referenced=0;
		stamp=-1;
	}
}
public class Main {
	static cache[] cache;
	static int N,R;
	public static void main(String[] args)throws IOException {
		//BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		N=sc.nextInt();R=sc.nextInt();
		cache= new cache[N];
		for(int i=0;i<N;i++) cache[i]= new cache();
		for(int i=0;i<R;i++) {
			int r = sc.nextInt();
			int h = hit(r);
			if(h!=-1) cache[h].referenced++;
			else {
				int v = findvictim();
				cache[v].id=r;
				cache[v].referenced=1;
				cache[v].stamp=i;
			}
		}
		ArrayList<Integer> aa = new ArrayList<Integer>();
		for(int i=0;i<N;i++)
			if(cache[i].id!=-1) aa.add(cache[i].id);
		Collections.sort(aa);
		for(int q : aa) System.out.print(q+" ");
		System.out.println();
	}
	static int hit(int id) {
		for(int i=0;i<N;i++)
			if(id==cache[i].id) return i;
		return -1;
	}
	static int findvictim() {
		int min = 1000000000,mini=-1,ts=-1;
		for(int i=0;i<N;i++) {
			if(cache[i].id==-1) return i;
			if(min>cache[i].referenced) {
				min=cache[i].referenced;
				mini=i;ts=cache[i].stamp;
			}
			else if(min==cache[i].referenced) {
				if(cache[i].stamp<ts) {
					ts=cache[i].stamp; mini=i;
				}
			}
		}return mini;
	}
}
