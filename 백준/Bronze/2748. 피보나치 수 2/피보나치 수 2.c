#include <stdio.h>

int main() {
	long long a = 0, b = 1, c;
	int n;

	scanf("%d", &n);

	if (n == 1)
		printf("1");
	else {
		for (int i = 0; i < n - 1; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		printf("%lld\n", c);
	}
	return 0;
}