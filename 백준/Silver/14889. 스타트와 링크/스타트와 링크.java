import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int N, min=1000000000;
	static int[] team;
	static int[][] capa;
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		N=Integer.parseInt(bf.readLine());
		capa = new int[N][N];
		team = new int[N];
		
		for(int i=0;i<N;i++) {
			StringTokenizer stt = new StringTokenizer(bf.readLine());
			for(int j=0;j<N;j++)
				capa[i][j]=Integer.parseInt(stt.nextToken());
		}
		OnOff(team, 0);
		System.out.println(min);
	}
	
	public static void Eval() {
		int s=0, l=0, cnt =0;
		for (int i=0; i<N; i++)
			if (team[i] == 0)
				cnt++;
		if (cnt != N/2) return; 
		for (int i=0; i<N; i++)
			for (int j=0; j<N; j++) {
				if (team[i]==team[j] && team[i]==0)
					s += capa[i][j];
				if (team[i]==team[j] && team[i]==1)
					l += capa[i][j];
			}
		int r = s-l;
		if (r<0) r = -r;
		if (r<min) min = r;
		}
	
	public static void OnOff(int p[], int loc) {
		if (loc >=N) {
		Eval();
		return;	
		}
		p[loc] =0 ; OnOff(p, loc+1);
		p[loc] =1 ; OnOff(p, loc+1);
		}
}