#include<iostream>
using namespace std;
int main()
{
  int n,r;
  std::cin>>n;
  if(n<=200)
  {
    r=int(n*0.5);
    std::cout<<"Rs."<<r;
  }
  else if(n<=400)
  {
    r=int(n*0.65+100);
    std::cout<<"Rs."<<r;
  }
  else if(n<=600)
  {r=int(n*0.80+200);
    std::cout<<"Rs."<<r;
  }
  else
  {
    r=int(n*1.25+425);
    std::cout<<"Rs."<<r;
  }
    
}