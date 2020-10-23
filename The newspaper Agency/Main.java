#include<iostream>
using namespace std;
int main()
{
  int w,x,y;
  std::cin>>w>>x>>y;
  int p=w*x;
  int r=w*y+100;
  std::cout<<p-r;
}