#include <stdio.h>
#include <math.h>
main() {
	int a, b, c;
	scanf("%d %d %d", &a, &b, &c);
	printf("%d", (c-b-1)/(a-b)+1);
}