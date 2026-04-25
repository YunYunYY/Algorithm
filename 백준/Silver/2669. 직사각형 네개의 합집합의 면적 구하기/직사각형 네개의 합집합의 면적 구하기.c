#include<stdio.h>
main(){
	int aa[4][4],i,j,k,cnt=0;
	int bb[101][101]={0, };
	for(i=0;i<4;i++)
		for(j=0;j<4;j++)
			scanf("%d",&aa[i][j]);
	
	for(i=0;i<4;i++)
		for(j=aa[i][0];j<aa[i][2];j++)
			for(k=aa[i][1];k<aa[i][3];k++)
				if(!bb[j][k]){
					cnt++; bb[j][k]=1;
				}
	printf("%d",cnt);
}