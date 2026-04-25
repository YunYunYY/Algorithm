#include <stdio.h>
#include <string.h>

int main() {
	int stack[10000] = { 0, };
	int a, k;
	char b[6];
	int top;
	top = 0;
	scanf("%d", &a);
	
	for (int i = 0; i < a; i++) {
		scanf("%s", &b);
		if (strcmp("push", b)==0) {
			scanf("%d", &k);
			stack[top] = k;
			top++;
		}

		if (strcmp("pop", b) == 0) {
			if (stack[0] == 0)
				printf("-1\n");
			else {
				printf("%d\n", stack[0]);
				for (int i = 1; i < top; i++) {
					stack[i - 1] = stack[i];
				}
				stack[top - 1] = 0;
				top --;
			}
		}
	
		if (strcmp("size", b) == 0) {
			printf("%d\n", top);
		}

		if (strcmp("empty",b)==0)		{
			if (top == 0)
				printf("1\n");
			else
				printf("0\n");
		}

		
		if (strcmp("front", b) == 0)
		{
			if (top == 0)
				printf("-1\n");
			else
				printf("%d\n", stack[0]);
		}
		if (strcmp("back", b) == 0) {
			if (top == 0)
				printf("-1\n");
			else
				printf("%d\n", stack[top - 1]);
		}
	}
}