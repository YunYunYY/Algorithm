import java.util.LinkedList;
import java.util.Scanner;

class NPoint {
	int r, c;
	NPoint (int rr, int cc) {
		r = rr; c = cc;
	}
}

public class Main {
	static LinkedList<NPoint> snake, apple;
	static int N, A, M;
	
	public static void main(String[] args) {
		LinkedList<NPoint> tm = new LinkedList<NPoint>();
		int dir = 0;
		int[][] move = {{0,1}, {1,0}, {0, -1}, {-1,0}};
		snake = new LinkedList<NPoint>(); 
		apple = new LinkedList<NPoint>();
		Scanner key = new Scanner(System.in);
		N = key.nextInt(); A = key.nextInt();
		for (int i=0; i<A; i++) {
			int x = key.nextInt(), y = key.nextInt();
			apple.add(new NPoint(x-1,y-1));
		}
		snake.add(new NPoint(0,0));
		M = key.nextInt();
		for (int i=0; i< M; i++) {
			int x = key.nextInt(); String y = key.next();
			if (y.charAt(0)=='L') tm.add(new NPoint(x, 0));
			if (y.charAt(0)=='D') tm.add(new NPoint(x, 1));
		}
		key.close();
		int t=0; int idx = 0;
		while (true) {
			int tr = snake.get(0).r + move[dir][0];
			int tc = snake.get(0).c + move[dir][1];
			NPoint tp = new NPoint(tr, tc); t++;
			if (TouchWall(tp) == true) break;
			if (Search(snake, tp)== true) break;
			if (Search(apple, tp)== true) snake.add(0, tp);
			else {
				snake.add(0,tp);
				snake.remove(snake.size()-1);
			}
			if ( (idx < tm.size()) && (t == tm.get(idx).r)) {
				if (tm.get(idx).c ==0) dir = (dir+3) %4;
				else dir = (dir+1) %4;
				idx++;
			}
		}
		System.out.println(t);
	}	
	static boolean Search (LinkedList<NPoint> ll, NPoint p) {
		for (int i=0; i< ll.size(); i++) {
			if (ll.get(i).r == p.r && ll.get(i).c== p.c) {
				ll.remove(i); return true;
			}
		}
		return false;
	}
	static boolean TouchWall(NPoint p) {
		if ((p.r < 0) || (p.r== N) || (p.c < 0) || (p.c== N))
			return true;
		return false;
	}
	
}
