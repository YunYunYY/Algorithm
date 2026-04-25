#include <stdio.h>

int main() {

	int i;
	scanf("%d", &i);
	
	for (int k = 0; k < i; k++) {
		for (int g = 1; g < k+1; g++)
			printf(" ");
		for (int j = (k+1)*2; j < i*2; j++)
			printf("*");
		printf("*\n");
	}
	for (int k = 1; k < i; k++) {
		for (int g = k+1; g < i; g++)
			printf(" ");
		for (int j = 1; j < (k + 1) * 2; j++)
			printf("*");
		printf("\n");
	}
	return 0;
}