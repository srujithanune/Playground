#include<iostream>
using namespace std;
int main()
{
  int n;
  float ht;
  std::cin>>n>>ht;
  if(n>3)
    std::cout<<"Number of items is more";
  else
  {
    if(n==2)
      std::cout<<(ht+0.5*ht);
    if(n==3)
      std::cout<<(ht*2);
  }
}