#include<iostream>
using namespace std;
int main()
{
  int n,i=2;;
  std::cin>>n;
  int arr[100];
  arr[0]=0,arr[1]=1;
  while(i<=n)
  {
    arr[i]=arr[i-1]+arr[i-2];
    i++;
  }
  std::cout<<arr[n-1];
  
}