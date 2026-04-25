#include <stdio.h>

int fibo(int n){
	if(n==1) return 1;
	else if (n==0) return 0;
	else if (n==2) return 1;
	else return (fibo(n-1)+fibo(n-2));
}
main(){
	int a,b;
	scanf("%d",&b);
	a=fibo(b);
	printf("%d\n",a);
}