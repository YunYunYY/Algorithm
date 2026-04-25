import java.io.*;
import java.util.*;

class CPoint {
	int r, c;
	CPoint (int x, int y) {
		r =x; c =y;
	}
}
public class Main {
	static CPoint[] chicken;
	static CPoint[] house;
	static int[] map;
	static int S, N, K;
	static int min = 1000000000;
	public static void main(String[] args)throws IOException {
		//BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Scanner key = new Scanner(System.in);
		S = key.nextInt();
		K = key.nextInt();
		int[][] t = new int[S][S];
		int c=0, h=0;
		for (int i=0; i<S; i++) {
			for (int j =0; j<S; j++) {
				t[i][j] = key.nextInt();
				if (t[i][j] == 1) h++;
				if (t[i][j] == 2) c++;
			}
		}
		chicken = new CPoint[c];
		house = new CPoint[h];
		int cidx=0, hidx =0;
		for (int i=0; i<S; i++) {
			for (int j =0; j<S; j++) {
				if (t[i][j] == 1)
					house[hidx++] = new CPoint(i,j);
				if (t[i][j] == 2)
					chicken[cidx++] = new CPoint(i,j);}
			}
		N = chicken.length;
		int[] A= new int[K];
		Combi(A,0,0);
		System.out.println(min);
	}
	
	static void Combi(int[] a, int loc, int from) {
		if (loc == K) {
			Eval(a); return;
		}
		for (int i=from; i<N; i++) {
			a[loc] =i;
			Combi(a, loc+1, i+1);
		}
	}
	
	static void Eval(int[] a) {
		map = new int[N];
		for (int i=0; i<K; i++)
		map[a[i]]= 1;
		int city=0;
		for (int i=0; i<house.length; i++) {
			int dist = 1000000000;
			for (int j=0; j<chicken.length; j++) {
				if (map[j] == 0) continue;
				int t = Math.abs(house[i].r - chicken[j].r) 
					+Math.abs(house[i].c - chicken[j].c);
				dist =Math.min(dist, t);
			}
			city += dist;
		}
		min = Math.min(city, min);
	}
	
}
