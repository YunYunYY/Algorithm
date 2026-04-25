#include <stdio.h>
#include<string.h>

int main()
{
	char me[80];

	int a, result, score,size;
	scanf("%d", &a);
	for (int i = 0; i < a; i++) {
		scanf("%s", &me, 80);
		size = strlen(me);
		result = 0; score = 1;
		for (int j = 0; j < size; j++) {
			if (me[j] == 'O') {
				result += score;
				score++;
			}
			if (me[j] == 'X') {
				score = 1;
			}
		}
		printf("%d\n", result);
	}
}