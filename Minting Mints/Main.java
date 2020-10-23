#include <iostream>
using namespace std;

int main() 
{
   int start,len,sum,res=0,i,j;
  cin>>start>>len;
  int mints[len];
  mints[0]=start;
  res=start;
  for(i=1;i<len;i++)
  {
    mints[i]=res-1;
    res=res+mints[i];
  }
  for(i=0;i<len;i++)
  {
    sum=sum+mints[i];
  }
  cout<<sum;
}
    
  
