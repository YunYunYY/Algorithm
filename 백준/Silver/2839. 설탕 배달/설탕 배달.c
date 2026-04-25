#include <stdio.h>

int main()
{
	int a, dap = 0;
	scanf("%d", &a);
	while (a>0) {
		if (a % 5 == 0) {
			a -= 5;
			dap++;
		}
		else if (a % 3 == 0) {
			a -= 3;
			dap++;
		}
		else if (a > 5) {
			a -= 5;
			dap++;
		}
		else {
			dap = -1;
			a = 0;
		}
	}
	printf("%d\n", dap);
}