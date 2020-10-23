#include <stdio.h>
#include<ctype.h>
int main()
{
   char ch;
  scanf("%c",&ch);
  if(islower(ch))
    printf("%c",toupper(ch));
  else
    printf("%c",tolower(ch));
    
}