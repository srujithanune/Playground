#include<iostream>
using namespace std;
int main()
{
  int n;
  std::cin>>n;
  int temp,sum=0;
  temp=n;
  while(n>0)
  {
    int m=n%10;
    sum=sum+m;
    n=n/10;
  }
  
  if(temp%sum==0)
    std::cout<<"Harshad Number";
  else
    std::cout<<"Not Harshad Number";
}