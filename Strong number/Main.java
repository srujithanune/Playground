#include <stdio.h>
int fact(int n)
{
  int f=1,i;
  for(i=1;i<=n;i++)
    f=f*i;
  return f;
}
int main()
{
   int n,n1,sum=0,m;
  scanf("%d",&n);
  n1=n;
  while(n>0)
  {
    m=n%10;
    sum=sum+fact(m);
    n=n/10;
  }
  if(sum==n1)
    printf("Yes");
  else
    printf("No");
}
  
