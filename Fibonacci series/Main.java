#include<stdio.h>
int main()
{
  int a,t1=1,t2=0,n,i;
  scanf(" %d\t ",&a);
  for(i=1;i<=a;i++)
  {
  printf("%d ",t2);
  n=t1+t2;
  t2=t1;
  t1=n;
  }
  
  return 0;
}