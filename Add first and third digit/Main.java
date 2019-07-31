#include<stdio.h>
int main()
{
  int a, b, C, d, e;
  scanf("%d", &a) ;
  b=a%10;
  C=a/10;
  d=C/10;
  e=b+d;
  printf("%d", e) ;
  return 0;
}