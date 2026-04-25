#include <stdio.h>
main(){
	int aa[9],i,j;
	int sum=0,cnti=-1,cntj=-1,tmp;
	for(i=0;i<9;i++){
		scanf("%d",&aa[i]);
		sum+=aa[i];
	}
	sum-=100;
	
	for(i=0;i<9;i++)
		for(j=i+1;j<9;j++)
			if(aa[i]>aa[j]){
				tmp=aa[i];
				aa[i]=aa[j];
				aa[j]=tmp;
			}
	
	
	for(i=0;i<9;i++){
		for(j=i+1;j<9;j++){
			if(aa[i]+aa[j]==sum){
				cnti=i;cntj=j;
			}
		}
	}
	for(i=0;i<9;i++)
		if(i!=cnti&&i!=cntj) printf("%d\n",aa[i]);
		
}