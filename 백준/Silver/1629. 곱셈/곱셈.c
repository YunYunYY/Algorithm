#include <stdio.h>
int c;
int po(int a, int b){
	if(b==0) return 1;
	long tmp = po(a,b/2);
	if(b%2==0) return tmp*tmp%c;
	else return tmp*tmp%c*a%c;
}
main(){
	int a,b;
	scanf("%d %d %d",&a,&b,&c);
	printf("%d",po(a,b));
}