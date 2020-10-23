#include <iostream>
using namespace std;

int main() 
{
  int m,n,i;
  cin>>m>>n;
  
    if(n>=100)
      for(i=m;i<=n;i++)
  {
      printf("%03d ",i);
      }
  else if(n>=10)
    for(i=m;i<=n;i++)
  {
    printf("%02d ",i);
    }
    
    else
      for(i=m;i<=n;i++)
  {
      printf("%d ",i);
  }
    return 0;
}