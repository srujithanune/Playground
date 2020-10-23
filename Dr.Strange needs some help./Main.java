#include<iostream>
int main()
{
  int m,n,req;
  std::cin>>m>>n>>req;
 int  r=1,i;
  for(i=0;i<n;i++)
  {
    r=r*m;
  }
  if(r>=req)
    std::cout<<"Doctor, you can proceed with your experiment.";
  else
    std::cout<<"Sorry Doctor! You need more bacteria.";
}