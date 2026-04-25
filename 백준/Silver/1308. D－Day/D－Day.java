import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int[]aa = new int[3];int[]bb=new int[3];
		for(int i=0;i<3;i++)
			aa[i]=Integer.parseInt(st.nextToken());
		st=new StringTokenizer(bf.readLine());
		for(int i=0;i<3;i++)
			bb[i]=Integer.parseInt(st.nextToken());
		if(bb[0]-aa[0]>1000) {
			System.out.println("gg");return;
		}
		else if(bb[0]-aa[0]==1000&&bb[1]>aa[1]) {
			System.out.println("gg");return;
		}
		else if(bb[0]-aa[0]==1000&&bb[1]==aa[1]&&bb[2]>=aa[2]) {
			System.out.println("gg");return;
		}
		int c=aa[2],d=bb[2];
		aa[1]--;bb[1]--;
		if(aa[0]%4==0&&(aa[0]%100!=0||aa[0]%400==0)) {
			switch(aa[1]) {
			case 11:c+=30;
			case 10:c+=31;
			case 9:c+=30;
			case 8:c+=31;
			case 7:c+=31;
			case 6:c+=30;
			case 5:c+=31;
			case 4:c+=30;
			case 3:c+=31;
			case 2:c+=29;
			case 1:c+=31;break;
			}
		}
		else {
			switch(aa[1]) {
			case 11:c+=30;
			case 10:c+=31;
			case 9:c+=30;
			case 8:c+=31;
			case 7:c+=31;
			case 6:c+=30;
			case 5:c+=31;
			case 4:c+=30;
			case 3:c+=31;
			case 2:c+=28;
			case 1:c+=31;break;
			}
		}
		if(bb[0]%4==0&&(bb[0]%100!=0||bb[0]%400==0)) {
			switch(bb[1]) {
			case 11:d+=30;
			case 10:d+=31;
			case 9:d+=30;
			case 8:d+=31;
			case 7:d+=31;
			case 6:d+=30;
			case 5:d+=31;
			case 4:d+=30;
			case 3:d+=31;
			case 2:d+=29;
			case 1:d+=31;break;
			}
		}
		else {
			switch(bb[1]) {
			case 11:d+=30;
			case 10:d+=31;
			case 9:d+=30;
			case 8:d+=31;
			case 7:d+=31;
			case 6:d+=30;
			case 5:d+=31;
			case 4:d+=30;
			case 3:d+=31;
			case 2:d+=28;
			case 1:d+=31;break;
			}
		}
		aa[0]--;bb[0]--;
		while(aa[0]!=0) {
			if(aa[0]%4==0&&(aa[0]%100!=0||aa[0]%400==0)) {
				c+=366;
			}
			else c+=365;
			aa[0]--;
		}
		while(bb[0]!=0) {
			if(bb[0]%4==0&&(bb[0]%100!=0||bb[0]%400==0)) {
				d+=366;
			}
			else d+=365;
			bb[0]--;
		}
		System.out.println("D-"+(d-c));
	}
	   
}