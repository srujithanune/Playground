#include<iostream>
using namespace std;
int main()
{
  int n;
  std::cin>>n;
  if(n%4==0)
  {
    if(n%100!=0)
    {
      std::cout<<n<<" is a leap year";
    }
    else
    {
      if(n%400==0)
        std::cout<<n<<" is a leap year";
      else
        std::cout<<n<<" is not a leap year";
    }
  }
  else
    std::cout<<n<<" is not a leap year";
}