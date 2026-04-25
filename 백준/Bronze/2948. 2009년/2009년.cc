#include <stdio.h>

int main() {
	int a, b;
	scanf("%d %d", &b,&a);
	if (a == 3)
		a = 2;
	if (a == 10)
		a = 1;
	if (a == 7)
		a = 4;
	if (a == 12)
		a = 9;
	switch (a)
	{
	case 1:
		if (b % 7 == 1)
		{
			printf("Thursday\n"); break;
		}
		else if (b % 7 == 2)
		{
			printf("Friday\n"); break;
		}
		else if (b % 7 == 3)
		{
			printf("Saturday\n"); break;
		}
		else if (b % 7 == 4)
		{
			printf("Sunday\n"); break;
		}
		else if (b % 7 == 5)
		{
			printf("Monday\n"); break;
		}
		else if (b % 7 == 6)
		{
			printf("Tuesday\n"); break;
		}
		else
		{
			printf("Wednesday\n"); break;
		}

	case 2:
		if (b % 7 == 1)
		{
			printf("Sunday\n"); break;
		}
		else if (b % 7 == 2)
		{
			printf("Monday\n"); break;
		}
		else if (b % 7 == 3)
		{
			printf("Tuesday\n"); break;
		}
		else if (b % 7 == 4)
		{
			printf("Wednesday\n"); break;
		}
		else if (b % 7 == 5)
		{
			printf("Thursday\n"); break;
		}
		else if (b % 7 == 6)
		{
			printf("Friday\n"); break;
		}
		else
		{
			printf("Saturday\n"); break;
		}
	case 4:
		if (b % 7 == 1)
		{
			printf("Wednesday\n"); break;
		}
		else if (b % 7 == 2)
		{
			printf("Thursday\n"); break;
		}
		else if (b % 7 == 3)
		{
			printf("Friday\n"); break;
		}
		else if (b % 7 == 4)
		{
			printf("Saturday\n"); break;
		}
		else if (b % 7 == 5)
		{
			printf("Sunday\n"); break;
		}
		else if (b % 7 == 6)
		{
			printf("Monday\n"); break;
		}
		else
		{
			printf("Tuesday\n"); break;
		}
	case 5:
		if (b % 7 == 1)
		{
			printf("Friday\n"); break;
		}
		else if (b % 7 == 2)
		{
			printf("Saturday\n"); break;
		}
		else if (b % 7 == 3)
		{
			printf("Sunday\n"); break;
		}
		else if (b % 7 == 4)
		{
			printf("Monday\n"); break;
		}
		else if (b % 7 == 5)
		{
			printf("Tuesday\n"); break;
		}
		else if (b % 7 == 6)
		{
			printf("Wednesday\n"); break;
		}
		else
		{
			printf("Thursday\n"); break;
		}
	case 6:
		if (b % 7 == 1)
		{
			printf("Monday\n"); break;
		}
		else if (b % 7 == 2)
		{
			printf("Tuesday\n"); break;
		}
		else if (b % 7 == 3)
		{
			printf("Wednesday\n"); break;
		}
		else if (b % 7 == 4)
		{
			printf("Thursday\n"); break;
		}
		else if (b % 7 == 5)
		{
			printf("Friday\n"); break;
		}
		else if (b % 7 == 6)
		{
			printf("Saturday\n"); break;
		}
		else
		{
			printf("Sunday\n"); break;
		}
	case 8:
		if (b % 7 == 1)
		{
			printf("Saturday\n"); break;
		}
		else if (b % 7 == 2)
		{
			printf("Sunday\n"); break;
		}
		else if (b % 7 == 3)
		{
			printf("Monday\n"); break;
		}
		else if (b % 7 == 4)
		{
			printf("Tuesday\n"); break;
		}
		else if (b % 7 == 5)
		{
			printf("Wednesday\n"); break;
		}
		else if (b % 7 == 6)
		{
			printf("Thursday\n"); break;
		}
		else
		{
			printf("Friday\n"); break;
		}
	case 9:
		if (b % 7 == 1)
		{
			printf("Tuesday\n"); break;
		}
		else if (b % 7 == 2)
		{
			printf("Wednesday\n"); break;
		}
		else if (b % 7 == 3)
		{
			printf("Thursday\n"); break;
		}
		else if (b % 7 == 4)
		{
			printf("Friday\n"); break;
		}
		else if (b % 7 == 5)
		{
			printf("Saturday\n"); break;
		}
		else if (b % 7 == 6)
		{
			printf("Sunday\n"); break;
		}
		else
		{
			printf("Monday\n"); break;
		}

	case 11:
		if (b % 7 == 1)
		{
			printf("Sunday\n"); break;
		}
		else if (b % 7 == 2)
		{
			printf("Monday\n"); break;
		}
		else if (b % 7 == 3)
		{
			printf("Tuesday\n"); break;
		}
		else if (b % 7 == 4)
		{
			printf("Wednesday\n"); break;
		}
		else if (b % 7 == 5)
		{
			printf("Thursday\n"); break;
		}
		else if (b % 7 == 6)
		{
			printf("Friday\n"); break;
		}
		else
		{
			printf("Saturday\n"); break;
		}
	}
}