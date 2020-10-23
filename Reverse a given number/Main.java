#include <stdio.h>
int main()
{
int n,m,rev=0,n1;
  scanf("%d",&n);
  n1=n;
  while(n>0)
  {
    m=n%10;
    rev=rev*10+m;
    n=n/10;
  }
  printf("%d",rev);
}