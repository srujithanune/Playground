#include<iostream>
int main()
{
  int n,max;
  std::cin>>n;
  int arr[n],i;
  for(i=0;i<n;i++)
    std::cin>>arr[i];
  max=arr[0];
 i=1 ;
    while(i<n)
    {
    if(arr[i]>max)
      max=arr[i];
    i++;
}
  std::cout<<max;
}