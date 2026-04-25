#include <stdio.h>

int main() {
	int b, c;
	while(scanf("%d %d", &b, &c)==2)
		printf("%d\n", b + c);
	return 0;
}