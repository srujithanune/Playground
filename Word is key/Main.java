#include <iostream>
#include<string.h>
using namespace std;

int main() 
{
  char str[100];
  int flag=0;
  char input[16][10]={"break","case","continue","default","defer","else","fer'or",
   "func","goto","if","map","range","return","struct","type","var"};
  cin>>str;
  int i;
  for(i=0;i<16;i++)
  {
    if(strcmp(input[i],str)==0)
    { 
     flag=1;
    }
  }
    if(flag==1)
      cout<<str<<" is a keyword";
    else
      cout<<str<<" is not a keyword";
  
}