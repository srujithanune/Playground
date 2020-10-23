#include<iostream>
int main()
{
  int n,i,j,temp;
  std::cin>>n;
  temp=n;
  for(i=1;i<=4;i++)
  {
    for(j=1;j<=i;j++)
    std::cout<<n;
    std::cout<<"\n";
    n++;
  }
  temp=n-1;
  for(i=1;i<=4;i++)
  {
    for(j=4;j>=i;j--)
    std::cout<<temp;
    std::cout<<"\n";
    temp--;
  }

}