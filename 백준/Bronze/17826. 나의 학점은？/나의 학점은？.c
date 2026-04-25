#include <stdio.h>

int main() {
	int i, sc[50], my,rnk;
	for (i = 0; i < 50; i++)
		scanf("%d", &sc[i]);
	scanf("%d", &my);
	for (i = 0; i < 50; i++)
		if (my == sc[i]) {
			rnk = i + 1;
			break;
		}
	if (rnk <= 5)
		printf("A+");
	else if (rnk <= 15)
		printf("A0");
	else if (rnk <= 30)
		printf("B+");
	else if (rnk <= 35)
		printf("B0");
	else if (rnk <= 45)
		printf("C+");
	else if (rnk <= 48)
		printf("C0");
	else
		printf("F");
	
}