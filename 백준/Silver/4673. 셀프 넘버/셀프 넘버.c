#include <stdio.h>
int qqq (int n){
	int a = n;
	while(n>0){
		a+=n%10;
		n/=10;
	}return a;
}
int main(){
	int aa[10001]={0,},i,a;
	aa[0]=1;
	for(i=1;i<10001;i++){
		a=qqq(i);
		if(a>=10001) continue;
		aa[a]=1;
	}
	for(i=0;i<10001;i++)
		if(aa[i]==0)printf("%d\n",i);
}