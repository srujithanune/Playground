#include <stdio.h>
#include<math.h>
int main()
{
   float a,b;
  float hyp;
  scanf("%f%f",&a,&b);
  hyp=(a)*(a)+(b)*(b);
 hyp=sqrt(hyp);
    printf("%0.2f",hyp);
}