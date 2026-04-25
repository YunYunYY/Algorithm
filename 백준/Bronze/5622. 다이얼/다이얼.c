#include <stdio.h>
#include <string.h>
int main() {
	int a, i, num[16] = { 0, }, dap=0;
	char qq[16];
	scanf("%s", &qq);
	a = strlen(qq);
	for (i = 0; i < a; i++){
		if (qq[i] >= 'A' && qq[i] <= 'C')
			num[i] = 2;
		else if (qq[i] >= 'D' && qq[i] <= 'F')
			num[i] = 3;
		else if (qq[i] >= 'G' && qq[i] <= 'I')
			num[i] = 4;
		else if (qq[i] >= 'J' && qq[i] <= 'L')
			num[i] = 5;
		else if (qq[i] >= 'M' && qq[i] <= 'O')
			num[i] = 6;
		else if (qq[i] >= 'P' && qq[i] <= 'S')
			num[i] = 7;
		else if (qq[i] >= 'T' && qq[i] <= 'V')
			num[i] = 8;
		else if (qq[i] >= 'W' && qq[i] <= 'Z')
			num[i] = 9;
	}
	for (i = 0; i < a; i++) {
		dap += num[i];
	}
	dap += a;
	printf("%d", dap);
}