#include<iostream>
using namespace std;
int power(int a,int n)
{
  if(n==0)
    return 1;
  else if(n==1)
    return a;
  else
    return( a*power(a,n-1));
}
int main()
{int a,n;
 std::cout<<"Enter the value of a \n";
  std::cin>>a;
  std::cout<<"Enter the value of n \n";
  std::cin>>n;
std::cout<<"The value of "<<a<<" power "<<n<<" is "<< power(a,n);
  
}