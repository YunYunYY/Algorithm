#include <stdio.h>
#include <math.h>
int main() {
	int a, b;
	float M;
	double dap;
	scanf("%d %d", &a, &b);
	M = (float)(b - a) / 400;
	dap = pow(10.0, M);
	printf("%lf", 1/(1+dap));
}