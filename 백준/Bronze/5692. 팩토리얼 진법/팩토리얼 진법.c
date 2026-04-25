#include <stdio.h>
main(){
	int a,i,b,k,e;
	while(1){
		scanf("%d",&a);
		if(a==0)break;
		k=1;e=0;
		while(a>0){
			b=a%10;a/=10;
			for(i=k;i>0;i--)
				b*=i;
			e+=b;k++;
		}
		printf("%d\n",e);
	}
}