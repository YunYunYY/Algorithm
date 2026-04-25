
import java.io.*;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Job implements Comparable<Job>{
	int id,exe,pri;
	Job(int ii,int pp,int ee){
		id=ii;pri=pp;exe=ee;
	}
	@Override
	public int compareTo(Job o) {
		int res = this.pri-o.pri;
		if(res!=0)return res;
		return(this.id-o.id);
	}
}
class Event implements Comparable<Event>{
	int ts,id,ev,pri;
	Event(int tt,int ii, int pp,int ee){
		ts=tt;id=ii;pri=pp;ev=ee;
	}
	@Override
	public int compareTo(Event o) {
		int res = this.ts-o.ts;
		if(res!=0)return res;
		res=this.ev-o.ev;
		if(res!=0)return res;
		return this.pri-o.pri;
	}
}
public class Main {
	static PriorityQueue<Job> pq;
	static PriorityQueue<Event> eq;
	static int[][] A; static int N;
	static final int On=1,Off=2;
	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		eq = new PriorityQueue<Event>();
		pq = new PriorityQueue<Job>();
		N=Integer.parseInt(bf.readLine());
		A=new int[N][4];
		for(int i=0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			A[i][0]=i;
			A[i][1]=Integer.parseInt(st.nextToken());
			A[i][2]=-Integer.parseInt(st.nextToken())+A[i][1];
			A[i][3]=Integer.parseInt(st.nextToken());
			A[i][2]=A[i][2]*1001+A[i][3];
			eq.add(new Event(A[i][1], i, A[i][2], On));
		}
		
		StringBuilder sb = new StringBuilder(); 
		boolean running=false;
		while (!eq.isEmpty()) {
			Event ee = eq.poll();
			if(ee.ev==On) {
				int id = ee.id;
				if(!running) {
					sb.append(id+1+" ");running=true;
					eq.add(new Event(ee.ts+A[id][3], id, A[id][2], Off));
				}
				else pq.add(new Job(id, A[id][2], A[id][3]));
			}
			else {
				if(pq.isEmpty()) running=false;
				else {
					Job j = pq.poll(); int id=j.id; sb.append(id+1+" ");
					eq.add(new Event(ee.ts+A[id][3], id, A[id][2],  Off));
				}
			}
		}
		System.out.println(sb);
	}
	
}