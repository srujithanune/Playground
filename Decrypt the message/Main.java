#include<iostream>
int main()
{
  int n,i,m,add=0;
  std::cin>>n>>m;
  int sum=n+m;
  for(i=1;i<sum;i++)
  {
    if(sum%i==0)
    {
      add+=i;
    }
  }
  if(add==sum)
    std::cout<<"They can read the message";
  else
    std::cout<<"They can't read the message";
}