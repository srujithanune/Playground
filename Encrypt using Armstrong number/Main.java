#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
  int m,temp=n,arm=0,count=0;
  while(n>0)
  {
    m=n%10;
    n=n/10;
    count++;
  }
  n=temp;
  while(n>0)
  {
    m=n%10;
    arm=arm+power(m,count);
    n=n/10; 
  }
  if(arm==temp)
    return 1;
  else
    return 0;  
   
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}