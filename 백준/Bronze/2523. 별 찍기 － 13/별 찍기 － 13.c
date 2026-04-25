#include <stdio.h>

int main() {

	int i;
	scanf("%d", &i);
	
	for (int k = 0; k < i; k++) {
		for (int j = k+1; j > 0; j--)
			printf("*");
		printf("\n");
	}
	for (int k = 1; k < i; k++) {
		for (int j = k; j < i; j++)
			printf("*");
		printf("\n");
	}
	return 0;
}