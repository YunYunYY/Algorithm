#include <stdio.h>
main(){
	int aa[5];
	int i,j,sum=0,tmp;
	for(i=0;i<5;i++)
		scanf("%d",&aa[i]);
	for(i=0;i<4;i++){
		for(j=i+1;j<5;j++){
			if(aa[i]>aa[j]){
				tmp=aa[i];
				aa[i]=aa[j];
				aa[j]=tmp;
			}
		}
	}
	for(i=0;i<5;i++)
		sum+=aa[i];
	printf("%d\n%d",sum/5,aa[2]);

}