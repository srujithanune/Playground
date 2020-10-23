#include<iostream>
int main(){
  int n;std::cin>>n;
  int fact=1,i;
  for(i=1;i<=n;i++)
    fact*=i;
  std::cout<<fact;
}