#include <stdio.h>
int N;
int A[1000],B[1001][1001];
int max(int x,int y){
	return (x>y?x:y);
}
int lis(int n, int m){
	int mm=-100000;
	if(n==N) return 0;
	if(m==-1){
		mm=max(mm,lis(n+1,-1));
		mm=max(mm,lis(n+1,n)+1);
	}
	else{
		if(B[n][m]!=0) return B[n][m];
		mm=max(mm,lis(n+1,m));
		if(A[n]>A[m])
			mm=max(mm,lis(n+1,n)+1);
		B[n][m]=mm;
	}
	return(mm);
}
main(){
	int i;
	scanf("%d",&N);
	for(i=0;i<N;i++)
		scanf("%d",&A[i]);
	
	printf("%d",lis(0,-1));
}