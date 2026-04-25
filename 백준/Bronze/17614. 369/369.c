#include <stdio.h>

int main() {
	int a, clap = 0, i, size, j;
	char aa[10];
	scanf("%d", &a);	
	for (i = 1; i <= a; i++) {
		sprintf(aa, "%d", i);
		size = strlen(aa);
		for (j = 0; j < size; j++) {
			if (aa[j] == '3'||aa[j]=='6'||aa[j]=='9')
				clap++;
		}
	}
	printf("%d\n", clap);
	
}