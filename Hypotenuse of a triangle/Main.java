#include<stdio.h>
int main()
{
  float o,a,h;
  scanf("%f%f",&o,&a);
  h=sqrt((o*o)+(a*a));
  printf("%0.2f",h);
  return 0;
}