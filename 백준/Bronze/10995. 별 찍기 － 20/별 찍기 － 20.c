#include<stdio.h>
main(){
	int a,i,j;
	scanf("%d",&a);
	for(i=0;i<a;i++){
		if(i%2==1)
			for(j=0;j<a;j++)
				printf(" *");
		else{
			printf("*");
			for(j=0;j<a-1;j++)
				printf(" *");
		}
		printf("\n");
	}
}