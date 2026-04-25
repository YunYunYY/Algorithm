#include <stdio.h>
#define Num 8
int aa[8],a,b,cnt;

void Dump(int t[]) {
	int w = 500,i;
	for(i=0;i<a;i++){
		w+=aa[t[i]];
		w-=b;
		if(w<500) return;
	}
	cnt++;
}
void swap (int *a, int *b) {
	int tmp;
	tmp = *a; *a = *b; *b = tmp;
		return;
}
void perm(int t[], int d) {
	int i;
	if (d == a) {
	Dump(t);
	return;
	}
	for (i=d; i<a; i++) {
		swap (&(t[d]), &(t[i]));
		perm(t, d+1);
		swap (&(t[d]), &(t[i]));
	}
}
main() {
	int i, idx=0, arr[Num];
	scanf("%d",&a);scanf("%d",&b);
	
	for (i=0; i<a; i++){
		arr[i] = i;scanf("%d",&aa[i]);
	}
	perm(arr, 0);
	printf("%d",cnt);
}