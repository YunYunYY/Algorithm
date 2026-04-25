#include <stdio.h>
int main() {
	int a, i, s, r, sum,j,cnt,k;
	int num[15][15] = { 0, };
	for (i = 0; i < 15; i++)
		num[0][i] = i;
	for (i = 1; i < 15; i++)
		for (j = 1; j < 15; j++)
			num[i][j] = num[i][j - 1] + num[i - 1][j];
	scanf("%d", &a);
	for (i = 0; i < a; i++) {
		scanf("%d %d", &s, &r);
		printf("%d\n", num[s][r]);
		
	}
}