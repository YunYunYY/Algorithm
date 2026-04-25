#include <stdio.h>
#include<string.h>
int main()
{
	char aa[101];
	int size, arr[26];
	scanf("%s", &aa,100);
	size = strlen(aa);
	
	for (int i = 0; i < 26; i++)
		arr[i] = -1;
	for (int i = 0; i < size; i++) {
		if (arr[aa[i] - 97] == -1)
			arr[aa[i] - 97] = i;
	}
	for (int i = 0; i < 26; i++)
		printf("%d ", arr[i]);
}