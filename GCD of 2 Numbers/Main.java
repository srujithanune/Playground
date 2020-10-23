#include<iostream>
int gcd(int a,int b)
{
  while(a!=b)
  {
  if(a>b)
    a=a-b;
  if(b>a)
    b=b-a;
  }
  return a;
}
int main()
{
  int a,b;
  std::cin>>a>>b;
  std::cout<<"G.C.D of "<<a<<" and "<<b<<" = "<<gcd(a,b);
}