#include<stdio.h>
main(){
	int a, aa[10000],i,j;
	long long sum=0;
	scanf("%d",&a);
	getchar();
	for(i=0;i<a;i++)
		scanf("%d",&aa[i]);
	for(i=0;i<a;i++)
		for(j=0;j<a;j++)
			sum+=abs(aa[i]-aa[j]);
	printf("%lld",sum);
}