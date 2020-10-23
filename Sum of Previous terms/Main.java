#include <stdio.h>
int main()
{
   int n,i;
  scanf("%d",&n);
  if(n>30)
    printf("Invalid Input");
  else
  {
  int arr[n];
  arr[0]=1;
  arr[1]=2;
  for(i=2;i<n;i++)
  {
    arr[i]=arr[i-1]+arr[i-2];
  }
  printf("%d",arr[n-1]);
}
}