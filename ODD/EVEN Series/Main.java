#include <stdio.h>
int main()
{
   int n,i;
  scanf("%d",&n);
  int arr[n];
  arr[0]=arr[1]=0;
  for(i=2;i<n;i++)
  {
    if(i%2==0)
      arr[i]=arr[i-2]+2;
    else
      arr[i]=arr[i-2]+1;
  }
  //for(i=0;i<n;i++)
  printf("%d",arr[n-1]);
}