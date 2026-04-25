#include <stdio.h>

int main() {

	int aa[3];
	int cnt;
	scanf("%d %d %d", &aa[0], &aa[1], &aa[2]);
	for(int i=0;i<3;i++)
		for (int k = i; k < 3; k++) {
			if (aa[i] < aa[k]) {
				cnt = aa[i];
				aa[i] = aa[k];
				aa[k] = cnt;
			}
		}
	printf("%d\n", aa[1]);
}