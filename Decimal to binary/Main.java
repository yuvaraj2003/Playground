#include<stdio.h>
int main()
{
  int n,a[128],i,r=0;
  scanf("%d",&n);
  while(n!=0)
  {
  a[r++]=n%2;
  n=n/2;
  }
  for(i=r-1;i>=0;i--)
  {
    printf("%d",a[i]);
  }
  return 0;
}