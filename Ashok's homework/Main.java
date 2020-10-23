#include<iostream>
int main()
{
    int a,b,i,j;
  std::cin>>a>>b;
  int arr[a][b],arr2[a][b],arr3[a][b];
  for(i=0;i<a;i++)
  {
    for(j=0;j<b;j++)
    {
      std::cin>>arr[i][j];
    }
  }
  for(i=0;i<a;i++)
  {
    for(j=0;j<b;j++)
    {
      std::cin>>arr2[i][j];
    }
  }
  for(i=0;i<a;i++)
  {
    for(j=0;j<b;j++)
    {
      arr3[i][j]=arr[i][j]+arr2[i][j];
    }
  }
  for(i=0;i<a;i++)
  {
    for(j=0;j<b;j++)
    {
      std::cout<<arr3[i][j]<<" ";
    }
    std::cout<<"\n";
  }
  
}
   