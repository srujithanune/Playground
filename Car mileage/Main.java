#include<iostream>
using namespace std;
int main()
{
  int m,l,d;
  std::cin>>m>>l>>d;
  if(m*l>=d)
    std::cout<<"Can reach";
  else
    std::cout<<"Cannot reach";
}