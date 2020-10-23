#include<iostream>
int main()
{
    int a,b,i,j;
  std::cin>>a>>b;
  int arr[a][b];
  for(i=0;i<a;i++)
  {
    for(j=0;j<b;j++)
    {
      std::cin>>arr[i][j];
    }
  }
 for(i=0;i<b;i++)
  {
    for(j=0;j<a;j++)
    {
      std::cout<<arr[j][i]<<" ";
    }
   std::cout<<"\n";
  }
  
}