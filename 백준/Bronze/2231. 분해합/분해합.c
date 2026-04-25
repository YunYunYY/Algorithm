#include<stdio.h>
int main(){
	int a,i,b,c;
	scanf("%d",&a);
	for(i=1;i<=a;i++){
		b=i;c=i;
		while(b>0){
			c+=b%10;
			b/=10;
		}
		if(c==a){
			printf("%d",i);return 0;
		}
	}
	printf("0");
}