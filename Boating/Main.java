#include<iostream>
using namespace std;
int main()
{
 int w,a,c;
  std::cin>>w>>a>>c;
  int re;
  re=(75*a+30*c);
  if(re>w)
    std::cout<<"Boat will drow";
  else
    std::cout<<"Boat is stable";
}