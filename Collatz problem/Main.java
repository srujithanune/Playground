#include<iostream>
using namespace std;
int main()
{
  int n,arr[100],i=0,count=0,j;
  std::cin>>n;
  arr[0]=n;
  if(n==1)
  {
    std::cout<<1<<"\n";
    std::cout<<0;
  }
  else
  {
    
  do{
    if(arr[i]%2==0)
    {
      i++;
      arr[i]=arr[i-1]/2;
      count++;
    }
    else 
    {
      i++;
      arr[i]=3*arr[i-1]+1;
      count++;
    }
  }while(arr[i]!=1);
  i=0;
  while(arr[i]!=1){
    std::cout<<arr[i]<<"\n";
    i++;
  }
  std::cout<<1<<"\n";
  std::cout<<count;
}
}