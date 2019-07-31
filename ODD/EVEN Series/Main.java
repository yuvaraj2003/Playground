#include<stdio.h>
int main()
{
	int a,d,n,s1,s2,x;
  	scanf("%d",&n);
  	if(n%2==1)
    {
    a=0,d=2;
    s1=(n+1)/2;
    x=(a+(s1-1)*d);
    printf("%d",x);
    }
  else
  {
  a=0,d=1;
  s2=n/2;
  x=(a+(s2-1)*d);
  printf("%d",x);
  }
	
}