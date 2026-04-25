import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		String[][] aa = new String[a][2];
		for(int i=0;i<a;i++) {
			StringTokenizer stt = new StringTokenizer(bf.readLine());
			aa[i][0]=stt.nextToken();
			String b = "";
			for(int j=0;j<2;j++)
				b=(String.format("%02d",Integer.parseInt(stt.nextToken()) ))+b;
			b=stt.nextToken()+b;
			aa[i][1]=b;
		}
		Arrays.sort(aa, new Comparator<String[]>() {
			@Override
			public int compare(String[]o1,String[]o2) {
				if(o1[1].compareTo(o2[1])>0) return -1;
				else return 1;
			}
		});
		System.out.println(aa[0][0]);
		System.out.println(aa[a-1][0]);
	}

}