class Solution {
    public int[] solution(String[][] s) {
        int[] answer= new int[5];
		for(int i=0;i<5;i++) {
			String[] a = s[i];
			answer[i]=ww(a);
		}
		
		return answer;
    }
    static int ww(String[]s) {
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(s[i].charAt(j)=='P') {
					for(int k=0;k<4;k++) {
						int e = i+aa[k][0];
						int r = j+aa[k][1];
						if(e<0||e>4||r<0||r>4)continue;
						if(s[e].charAt(r)=='P') {
							return 0;
						}
						
					}
					for(int k=4;k<8;k++) {
						int e=i+aa[k][0];
						int r = j+aa[k][1];
						if(e<0||e>4||r<0||r>4)continue;
						if(s[e].charAt(r)=='P'&&s[(e+i)/2].charAt((r+j)/2)!='X') {
							return 0;
						}
					}
					for(int k=8;k<12;k++) {
						int e=i+aa[k][0];
						int r = j+aa[k][1];
						if(e<0||e>4||r<0||r>4)continue;
						if(s[e].charAt(r)=='P'&&(s[e].charAt(j)!='X'||s[i].charAt(r)!='X')) {
							return 0;
						}
					}
						
				}
			}
		}
		return 1;
	}
	static int[][] aa = {{-1,0},{0,-1},{1,0},{0,1},{0,-2},{-2,0},{2,0},{0,2},{-1,-1},{1,-1},{-1,1},{1,1}};

}