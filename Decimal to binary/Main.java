#include <stdio.h>
int main()
{
   int n,i=0,j;
  scanf("%d",&n);
  int bin[100];
  while(n>0)
  {
    bin[i]=n%2;
    n=n/2;
    i++;
  }
  for(j=i-1;j>=0;j--)
    printf("%d",bin[j]);
}