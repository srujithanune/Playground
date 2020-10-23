#include<iostream>
using namespace std;
int main()
{
  int d1,d2,c1,c2;
  std::cin>>d1>>c1>>d2>>c2;
  int d,c;
  d=d1+d2;
  c=c1+c2;
  while(c>=100)
  {  d+=1;
   c-=100;
  }
  std::cout<<d<<"\n";
  std::cout<<c;
  
}