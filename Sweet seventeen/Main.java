#include <iostream>
#include<string.h>
#include<math.h>
using namespace std;

int main() 
{
  char str[10];
  cin>>str;
  int len,i,val;
  long long decimal;
  len=strlen(str);
  decimal=0;
  len--;
  for(i=0;str[i]!='\0';i++)
  {
    if(str[i]>='0'&&str[i]<='9')
      val=str[i]-48;
    else if(str[i]>='a'&&str[i]<='g')
      val=str[i]-97+10;
    else if(str[i]>='A'&& str[i]<='G')
      val=str[i]-65+10;
    decimal+=val*pow(17,len);
    len--;
  }
  cout<<decimal;
      
   
    return 0;
}