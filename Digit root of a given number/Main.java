#include<iostream>
int sumof(int n)
  {
  int sum=0;
  while(n>0||sum>9)
  {
    if(n==0)
    {
      n=sum;
      sum=0;
    }
    sum+=n%10;
    n=n/10;
  }
  return sum;
  }
int main()
{
  int n,m=0,sum;
  std::cin>>n;
  if(n<10)
    sum=n;
  else
    sum=sumof(n);
  std::cout<<sum;
}