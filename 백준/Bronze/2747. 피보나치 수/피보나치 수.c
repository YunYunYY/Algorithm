#include <stdio.h>
main() {
	int n, a=0, b=1, c=0, i;
	scanf("%d", &n);
	if (n == 1)
		printf("1");
	else {
		for (i = 0; i < n - 1; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		printf("%d", c);
	}
}