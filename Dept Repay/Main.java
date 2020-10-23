#include<iostream>
using namespace std;
int main()
{
  int p,r,t;
  std::cin>>p>>r>>t;
  float i,a,d,fs;
  i=(p*t*r)/100;
  a=p+i;
  d=(i*2)/100;
  fs=a-d;
  std::cout<<i<<"\n"<<a<<"\n"<<d<<"\n"<<fs;
}