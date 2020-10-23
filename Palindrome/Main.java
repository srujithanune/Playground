#include <stdio.h>
int main()
{
   int n,copy,m,rev=0;
  scanf("%d",&n);
  copy=n;
  while(n>0)
  {
    m=n%10;
    rev=rev*10+m;
    n=n/10;
  }
  if(copy==rev)
    printf("Palindrome");
  else
    printf("Not a Palindrome");
}