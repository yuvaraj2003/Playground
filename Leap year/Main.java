#include<stdio.h>
int main()
{
  int a;
  scanf("%d",&a);
  if((a%4==0)||((a%400==0)&&(a%100==0)))
  {
  printf("Leap year");
  }
  else
  {
  printf("Not Leap year");
  }
  return 0;
}