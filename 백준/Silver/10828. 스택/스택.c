#include <stdio.h>
#include <string.h>

int main() {
	int stack[10000];
	int a, k;
	char b[6];
	int top;
	top = 0;
	stack[0] = 0;
	scanf("%d", &a);
	
	for (int i = 0; i < a; i++) {
		scanf("%s", &b,6);
		if (strcmp("push", b)==0) {
			scanf("%d", &k);
			top++;
			stack[top] = k;
			
		}

		if (strcmp("pop", b) == 0) {
			if (stack[top] == 0)
				printf("-1\n");
			else {
				printf("%d\n", stack[top]);
				top--;
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

		if (strcmp("top", b) == 0) {
			if (top == 0)
				printf("-1\n");
			else
				printf("%d\n", stack[top]);
		}

	}
}