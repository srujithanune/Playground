#include<iostream>
int main()
{
  int n;
  std::cin>>n;
  float arr[n];
  int i;
  arr[0]=0.5;
  for(i=1;i<=n;i++)
  {
    arr[i]=arr[i-1]*3;
  }
  for(i=0;i<n;i++)
  {
   std::cout<<arr[i]<<" ";
  }
}  