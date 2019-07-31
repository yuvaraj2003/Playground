#include<stdio.h>
int main()
{
  int n,i,g;
  scanf("%d",&n);
  int a[n];
  for(i=0;i<n;i++)
  {
    scanf("%d",a+i);
  }
  scanf("%d",&g);
  for(i=0;i<n;i++)
  {
  if(a[i]==g)
  {
  printf("%d",i+1);
  return 0;
  }
  }
  printf("%d isn't present in the array.",g);
  return 0;
}