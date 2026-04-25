#include <stdio.h>
 
int main()
{
    char input[1000000];
    int alphabet[26] = { 0 }, best = 0, max = 0;
    int overlap = 0;
    scanf("%s", &input);
    for(int i = 0; input[i] != 0; i++)
    {
        if(input[i] < 91)
            alphabet[input[i] - 65]++;
        else
            alphabet[input[i] - 97]++;
    }
    for(int i = 0; i < 26; i++)
    {
        if(alphabet[i] > max)
        {
            max = alphabet[i];
            best = i;
        }
    }
    for(int i = 0; i < 26; i++)
    {
        if(max == alphabet[i]) overlap++;
    }
    if(overlap >= 2)
        printf("?");
    else
        printf("%c", best + 65);
    return 0;
}
