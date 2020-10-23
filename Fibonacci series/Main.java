#include <stdio.h>
int main()
{
   int n,min=0,max=1,sum,i=2;
  scanf("%d",&n);
  printf("%d ",min);
  while(i<=n)
  {
    sum=min+max;
    min=max;
    max=sum;
    printf("%d ",min);
    i++;
  }
  
}