#include <stdio.h>

int main()
{
	int a, num[100], dap = 0;
	scanf("%d", &a);
	for (int i = 0; i < a; i++){
		scanf("%d", &num[i]);
		for (int j = 2; j <= num[i]; j++) {
			if (num[i] % j == 0) {
				if (num[i] == j)
					dap++;
				else
					break;
			}
		}
	}
	printf("%d\n", dap);
}