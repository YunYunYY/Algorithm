#include <stdio.h>
main() {
	int a, b, c, i, hap;
	scanf("%d %d %d", &a, &b, &c);
	if (b >= c)
		printf("-1");
	else {
		i = a / (c - b)+1;
		printf("%d", i);
	}
}