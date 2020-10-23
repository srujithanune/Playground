#include <stdio.h>
int main()
{
   int a,b,sum=0,i,j;
  scanf("%d",&a);
  scanf("%d",&b);
  for(i=a+1;i<b;i++)
  {
    int prime=1;
    for(j=2;j<i;j++)
    {
      if(i%j==0)
      
      {prime=0;
       break;
      }
      
    }
    if(prime==1)
    {
      if(i!=1)
     sum=sum+i;
    }
  }
  printf("%d",sum);
}