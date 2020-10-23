#include <iostream>
int main() 
{
	int n,m,rev=0;
  std::cin>>n;
  while(n>0)
  {
    m=n%10;
    if(m==0);
      
    else
      rev=rev*10+m;
    n=n/10;
  }
  std::cout<<rev;
}