#include <stdio.h>
int main() {
	int a, i, bo = 0, sc = 0;
	char aa[10001];
	scanf("%d", &a);
	scanf("%s", &aa, 10000);
	for (i = 0; i < a; i++) {
		if (aa[i] == 'O') {
			sc += i + 1+bo;
			bo++;
		}
		if (aa[i] == 'X')
			bo = 0;
	}
	printf("%d", sc);
}