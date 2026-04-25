#include <stdio.h>

int main() {
	
	int aa[3],bb[2];
	int min1, min2;
	for (int i = 0; i < 3; i++) 
		scanf("%d", &aa[i]);
	for (int i = 0; i < 2; i++)
		scanf("%d", &bb[i]);
	
	min1 = aa[0];
	min2 = bb[0];
	for (int i = 0; i < 3; i++)
		if (aa[i] < min1)
			min1 = aa[i];
	for (int i = 0; i < 2; i++)
		if (bb[i] < min2)
			min2 = bb[i];
	printf("%d\n", min1 + min2 - 50);
	
}