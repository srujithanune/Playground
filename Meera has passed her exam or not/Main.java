#include<iostream>
int main()
{
  int n;
  std::cin>>n;
  int arr[n],i,marks;
  for(i=0;i<n;i++)
  {
   std::cin>>arr[i];
  }
  
  std::cin>>marks;
  for(i=0;i<n;i++)
  {
   if(arr[i]==marks)
   {
     std::cout<<"She passed her exam";
     break;
  }
}
  if(i==n)
    std::cout<<"She failed";
  
}