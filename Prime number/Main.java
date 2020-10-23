#include <stdio.h>
#include<math.h>
int main()
{
   int n,i,prime=1;
  scanf("%d",&n);
  for(i=2;i<n;i++)
  {
    if(n%i==0)
    {
      prime=0;
      break;
    }
  }
  if(prime==1)
    printf("%0.2f",sqrt(n));
  else
    printf("0.00");
}
