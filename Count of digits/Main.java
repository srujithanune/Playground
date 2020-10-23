#include<iostream>
int main()
{int n,count=0;
  std::cin>>n;
  do{
    int m=n%10;
    count++;
    n=n/10;
  }while(n>0);
  std::cout<<count;
}
  // Type your code here
