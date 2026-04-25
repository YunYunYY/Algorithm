import java.util.ArrayList;
import java.util.Scanner;
class TShape {
	int H, V;
	int[][] pt;
	TShape(int v, int h, int[][] pp) {
		H=h; V=v;
		pt = new int[4][2];
		for (int i=0; i<4; i++) {
			pt[i][0] = pp[i][0]; pt[i][1] = pp[i][1];
		}
	}
	void dump() {
		System.out.print(V+ " "+ H+ " : ");
		for (int i=0; i<4; i++)
			System.out.print(pt[i][0]+" "+pt[i][1]+ " ");
		System.out.println();
	}
}
public class Main{
	static int M, N;
	static int[][] map;
	static ArrayList<TShape> shape= new ArrayList<>();
	public static void main(String[] args) {
		int[][] pp1 = {{0,0}, {0,1}, {1,0}, {1,1}}; 
		shape.add(new TShape(2,2,pp1));
		
		int[][] pp2 = {{0,0}, {0,1}, {0,2}, {0,3}};
		TShape t = new TShape(1,4,pp2); 
		shape.add(t); shape.add(Symm(t));
		
		int[][] pp3 = {{0,0}, {1,0}, {2,0}, {2,1}};
		t = new TShape(3,2,pp3); 
		shape.add(t); shape.add(VMirror(t));
		
		TShape ht = HMirror(t); 
		shape.add(ht); shape.add(VMirror(ht));
		t = Symm(t); 
		shape.add(t); shape.add(VMirror(t));
		ht = HMirror(t); 
		shape.add(ht); shape.add(VMirror(ht));
		
		int[][] pp4 = {{0,0}, {1,0}, {1,1}, {2,1}};
		t = new TShape(3,2,pp4); 
		shape.add(t); shape.add(Symm(t));
		ht = HMirror(t); 
		shape.add(ht); shape.add(Symm(ht));
		
		int[][] pp5 = {{0,1}, {1,0}, {1,1}, {1,2}};
		t = new TShape(2,3,pp5); 
		shape.add(t); shape.add(Symm(t));
		ht = VMirror(t); 
		shape.add(ht); shape.add(Symm(ht));
		
		Scanner key = new Scanner(System.in);
		M = key.nextInt(); N = key.nextInt();
		map = new int[M][N];
		
		for (int i=0; i<M; i++)
			for (int j=0; j<N; j++)
				map[i][j] = key.nextInt();
		key.close();
		
		int max = -1;
		for (TShape ts : shape)
			for (int r=0; r<= M-ts.V; r++)
				for (int c=0; c<= N-ts.H; c++) {
					int sum = 0;
					for (int i=0; i<4; i++)
						sum += map[r+ts.pt[i][0]][c+ts.pt[i][1]];
					if (sum > max) max = sum;
				}
		System.out.println(max);
			
		
	}
	static TShape HMirror(TShape t) {
		int[][] p = new int[4][2];
		for (int i=0; i<4; i++) {
			p[i][0] = t.pt[i][0]; p[i][1] = t.H- 1-t.pt[i][1];
		}
		return new TShape(t.V, t.H, p);
	}
	static TShape VMirror(TShape t) {
		int[][] p = new int[4][2];
		for (int i=0; i<4; i++) {
			p[i][0] = t.V- 1-t.pt[i][0]; p[i][1] = t.pt[i][1];
		}
		return new TShape(t.V, t.H, p);
	}
	static TShape Symm(TShape t) {
		int[][] p = new int[4][2];
		for (int i=0; i<4; i++) {
			 p[i][0] = t.pt[i][1]; p[i][1] = t.pt[i][0]; 
		}
		return new TShape(t.H, t.V, p);
	}
}