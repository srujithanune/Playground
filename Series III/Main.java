#include<iostream>
int main()
{
  int n;
  std::cin>>n;
  int arr[n],f=5,i=0;
  arr[0]=6;
  for(i=1;i<n;i++)
  {
    arr[i]=arr[i-1]+f*i;
  }
  for(i=0;i<n;i++)
  {
   std::cout<<arr[i]<<" ";
  }
}