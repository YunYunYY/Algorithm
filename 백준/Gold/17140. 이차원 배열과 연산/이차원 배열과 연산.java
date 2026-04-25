import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

class NumCnt{
	int num, cnt;
	NumCnt(int nn, int cc) {
		num = nn; cnt =cc;
	}
}


public class Main {
	static int[][] G;
	static int R, C, V;
	static int Rsize, Csize;
	static HashMap<Integer, Integer> map;
	public static void main(String[] args) {
		G = new int[100][100];
		Scanner sc = new Scanner(System.in);
		R = sc.nextInt()-1;
		C = sc.nextInt()-1;
		V = sc.nextInt();
		for (int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				G[i][j]=sc.nextInt();
		sc.close();
		Rsize=3; Csize =3;
		System.out.println(Proc());
	}
	static int Proc() {
		int cnt =0;
		while (cnt <=100) {
			if (G[R][C]== V) return cnt;
			if (Rsize >= Csize) RSpan();
			else CSpan();
			cnt++;
		}
		return -1;
	}
	static void RSpan() {
		int max =0;
		for (int i=0; i<Rsize; i++) {
			map = new HashMap<Integer, Integer>();
			for (int c = 0; c<Csize; c++)
				if (G[i][c] !=0)
					map.put(G[i][c], map.getOrDefault((Integer) G[i][c], 0)+1);
			
			ArrayList<NumCnt> nc = new ArrayList<NumCnt>();
			for (Integer key : map.keySet()) { // (number, frequency) 쌍을 넣음
				Integer value = map.get(key);
				nc.add(new NumCnt(key, value));
			}
			Collections.sort(nc, new Comparator<NumCnt>() {
				@Override
				public int compare(NumCnt o1,NumCnt o2) {
					int res = o1.cnt - o2.cnt;
					if (res == 0) return (o1.num - o2.num);
					else return res;
				}
			});
			
			int idx =0;
			Arrays.fill(G[i], 0);
			for (NumCnt e : nc) {
				G[i][idx++]=e.num;G[i][idx++]=e.cnt;
				if (idx == 100) break;
			}
			
			max = Math.max(max, idx);
		}
		Csize = max;
	}
	
	static void CSpan() {
		int max =0;
		for (int i=0; i<Csize; i++) {
			map = new HashMap<Integer, Integer>();
			for (int r=0; r<Rsize; r++)
			if (G[r][i] !=0) {
				map.put(G[r][i], map.getOrDefault((Integer) G[r][i], 0)+1);
				G[r][i] =0;
			}
			
			ArrayList<NumCnt> nc = new ArrayList<NumCnt>();
			for (Integer key : map.keySet()) {
				Integer value = map.get(key);
				nc.add(new NumCnt(key, value));
			}
			Collections.sort(nc, new Comparator<NumCnt>() {
				@Override
				public int compare(NumCnt o1, NumCnt o2) {
					int res = o1.cnt - o2.cnt;
					if (res == 0) return (o1.num - o2.num);
					else return res;
				}
			});
			
			int idx =0;
			for (NumCnt e : nc) {
				G[idx++][i]=e.num;G[idx++][i]=e.cnt;
				if (idx == 100) break;
			}
			max = Math.max(max, idx);
		}
		Rsize = max;
	}
		
	
}
