#include <stdio.h>
#include <math.h>
int IsPrime(int n) {
	int i;
	int b = (int)sqrt(n);
	for (i = 2; i <= b; i++)
		if (n % i == 0) return 0;
	return 1;
}
main() {
	int a, b, u;
	scanf("%d %d", &a, &b);
	for (u = a; u <= b; u++) {
		if (IsPrime(u)&&u!=1)
			printf("%d\n", u);
	}

}