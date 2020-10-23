#include<iostream>
using namespace std;
int main()
{
  int n,e=0,o=0;
  std::cin>>n;
  while(n>0)
  {
    int m=n%10;
    if(m%2==0)
    {
      e=e+m;
    }
    else
      o=o+m;
    n=n/10;
  }
  if(e==o)
    std::cout<<"Yes";
  else
    std::cout<<"No";
}