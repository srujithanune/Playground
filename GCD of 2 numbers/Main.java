#include <stdio.h>
int main()
{
   int a,b,hcf,i;
  scanf("%d",&a);
  scanf("%d",&b);
  for(i=1;i<=a||i<=b;i++)
  {
    if((a%i==0)&&(b%i==0))
      hcf=i;
  }
  printf("%d",hcf);
}