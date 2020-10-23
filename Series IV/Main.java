#include<iostream>
using namespace std;
int main()
{
  int n;
  std::cin>>n;
  int arr[n],i,f=2;
  arr[0]=0;
  for(i=1;i<n;i++)
  {
    arr[i]=arr[i-1]+f;
    if(i%2!=0)
    f=f+4;
    }
  for(i=0;i<n;i++)
  {
    std::cout<<arr[i]<<" ";
  }
  }