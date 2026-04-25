#include <stdio.h>
main(){
	int a,i,j;
	scanf("%d",&a);
	for(i=0;i<a;i++){
		for(j=0;j<=i;j++) printf("*");
		for(j=i;j<a-1;j++) printf(" ");
		for(j=i;j<a-1;j++) printf(" ");
		for(j=0;j<=i;j++) printf("*");
		printf("\n");
	}
	for(i=0;i<a-1;i++){
		for(j=i;j<a-1;j++) printf("*");
		for(j=0;j<=i;j++) printf(" ");
		for(j=0;j<=i;j++) printf(" ");
		for(j=i;j<a-1;j++) printf("*");
		printf("\n");
	}
}