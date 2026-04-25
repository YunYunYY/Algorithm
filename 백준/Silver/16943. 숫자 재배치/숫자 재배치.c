#include <stdio.h>
int aa[10];
int a,b,q,min=-1;
void Dump(int t[]){
	int num=0,i;
	if(t[0]==0) return;
	for(i=0;i<q;i++) num=num*10+t[i];
	if(num<=b&&num>min)min=num;
}
void swap (int *a, int *b) {
	int tmp;
	tmp = *a; *a = *b; *b = tmp;
		return;
}
void perm(int t[], int d) {
	int i;
	if (d == q) {
	Dump(t);
	return;
	}
	for (i=d; i<q; i++) {
		swap (&(t[d]), &(t[i]));
		perm(t, d+1);
		swap (&(t[d]), &(t[i]));
	}
}
main(){
	scanf("%d %d",&a,&b);
	while(a>0){
		aa[q++]=a%10;
		a/=10;
	}
	perm(aa,0);
	printf("%d",min);
}