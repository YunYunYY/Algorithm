#include <stdio.h>

int main() {
	int a, b;
	scanf("%d %d", &a, &b);
	int b1 = b % 10;
	int b2 = ((b - b1) % 100) / 10;
	int b3 = b / 100;

	int c1 = a * b1;
	int c2 = a * b2;
	int c3 = a * b3;
	printf("%d\n%d\n%d\n%d\n", c1, c2, c3, a * b);
}