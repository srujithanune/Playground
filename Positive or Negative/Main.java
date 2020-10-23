#include<iostream>
int main()
{
  int a;
  std::cin>>a;
  (a>=0)?std::cout<<a<<" is a positive number.":std::cout<<a<<" is a negative number.";
}