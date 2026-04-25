#include <stdio.h>

int main() {
	int a, b;
	int a1, a2, a3, b1, b2, b3;
	scanf("%d %d", &a, &b);
	a1 = a % 10;
	a2 = (a-a1) % 100;
	a3 = a / 100;
	a = a1 * 100 + a2 * 1 + a3 * 1;

	b1 = b % 10;
	b2= (b - b1) % 100;
	b3 = b / 100;
	b = b1 * 100 + b2 * 1 + b3 * 1;

	if (a < b)
		printf("%d", b);
	else
		printf("%d", a);
}