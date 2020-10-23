#include<iostream>
using namespace std;
int main()
{
  int n;
  std::cin>>n;
  int arr[n],i,f=11;
  for(i=0;i<n;i++)
  {
    arr[i]=f*f;
    f=f+4;
  }
  for(i=0;i<n;i++)
    std::cout<<arr[i]<<" ";
}