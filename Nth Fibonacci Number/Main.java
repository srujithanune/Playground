#include <stdio.h>
int main()
{
   int n,i=2;
  scanf("%d",&n);
  int arr[n];
  arr[0]=0;
  arr[1]=1;
  while(i<n)
  {
    arr[i]=arr[i-2]+arr[i-1];
    i++;
  }
  printf("%d",arr[n-1]);
}