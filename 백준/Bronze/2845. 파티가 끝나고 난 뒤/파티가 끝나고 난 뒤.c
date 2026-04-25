#include <stdio.h>
main() {
	int a, b, aa[5], i, hop;
	scanf("%d %d", &a, &b);
	hop = a * b;
	for (i = 0; i < 5; i++)
		scanf("%d", &aa[i]);
	for (i = 0; i < 5; i++)
		printf("%d ", aa[i] - hop);
}