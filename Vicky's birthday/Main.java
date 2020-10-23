#include<iostream>
int main()
{
  int n;
  std::cin>>n;
  if((n%4==0))
  {
   if(n%100!=0)
  {
    
    std::cout<<"Vicky can celebrate his birthday."; 

  }
    else
    {
      if(n%400==0)
        std::cout<<"Vicky can celebrate his birthday."; 
      else
    std::cout<<"Vicky can't celebrate.";
  }
  }
  else
    std::cout<<"Vicky can't celebrate.";
}