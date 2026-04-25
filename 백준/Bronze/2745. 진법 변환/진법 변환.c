#include <stdio.h>
main(){
	char n[40];
	int b,sum=0,tmp=1,i,a;
	scanf("%s %d", n,&b);
	
	for(i=strlen(n)-1;i>=0;i--){
		if(n[i]>='A'){
			a=n[i]-'A'+10;
			sum+=a*tmp;
		}
		else{
			a=n[i]-'0';
			sum+=a*tmp;
		}
		tmp*=b;
	}
	printf("%d",sum);
}