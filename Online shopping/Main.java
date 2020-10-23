#include<iostream>
using namespace std;
int main()
{
  int fp,fd,fs,sp,sd,ss,ap,ad,as;
  std::cin>>fp>>fd>>fs>>sp>>sd>>ss>>ap>>ad>>as;
  int ft,st,at;
  ft=(fp-(fp*fd)/100)+fs;
  st=(sp-(sp*sd)/100)+ss;
  at=(ap-(ap*ad)/100)+as;
  std::cout<<"In Flipkart Rs."<<ft<<"\n"<<"In Snapdeal Rs."<<st<<"\n"<<"In Amazon Rs."<<at<<"\n";
  if(ft<=st&&ft<=at)
    
    std::cout<<"He will prefer Flipkart";
  else if(st<=ft&&st<=at)
    
    std::cout<<"He will prefer Snapdeal";
  else if(at<=ft&&at<=st)
   
    std::cout<<"He will prefer Amazon";
  

}