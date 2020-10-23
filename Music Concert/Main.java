#include<iostream>
#include<cstdlib>
int main(){
  // Type your code here
  int n,ecount=0,ocount=0,i;
 std::cin>>n;
  int *p=(int*)malloc(n*sizeof(int));
  for(i=0;i<n;i++)
  std::cin>>*(p+i);
  for(i=0;i<n;i++)
  {
    if(*(p+i)%2==0)
      ecount+=1;
    if(*(p+i)%2!=0)
      ocount+=1;
  }
  std::cout<<ocount<<"\n";
  std::cout<<ecount;
  return 0;
}