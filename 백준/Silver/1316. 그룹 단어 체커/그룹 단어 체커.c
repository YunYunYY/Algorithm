#include <stdio.h>
#include <string.h>
main() {
	int a, i, k, j, cnt = 0;
	int aa[100] = { 0, };
	char qq[101][101];
	scanf("%d", &a);
	for (i = 0; i < a; i++)
		scanf("%s", qq[i]);
	for(i=0;i<a;i++)
		for (k = 0; k < strlen(qq[i]); k++)
			for (j = k+1; j < strlen(qq[i]); j++) {
				if (qq[i][k] == qq[i][j]) {
					if (j - k == 1) {
						k++;
						continue;
					}
					else {
						aa[i] = 1; break;
					}
				}

			}
	for (i = 0; i < a; i++)
		cnt += aa[i];
	printf("%d", a - cnt);

}