#include<stdio.h>
#include<memory.h>
int N;

void RSort(int b[]) {
    int base = 1;
    int B[N];
    int C[10];
    int L[10];
    for (int i=0; i<7; i++) {
      memset(C, 0, sizeof(C));
      memset(L, 0, sizeof(L));
        for (int j=0; j< N; j++)
            C[(b[j]/base)%10]++;
        L[0]= 0;
        for (int j=1; j<10; j++)
           L[j] = L[j-1]+C[j-1];
           
      for (int j=0; j<N; j++)
         B[L[(b[j]/base)%10]++] = b[j];
   
      for (int j=0; j<N; j++)
         b[j] = B[j];

      base=base*10;
   }
}
   
int main() {
   scanf("%d", &N);
   int A[N];
   for (int i=0; i<N; i++)
       scanf("%d", A+i);
   for (int i=0; i<N; i++)
      A[i] += 1000000;
   RSort(A);
   for (int i=0; i<N; i++)
      printf("%d\n", A[i]-1000000);
}