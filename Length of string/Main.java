#include<stdio.h>
int main()
{
  char s[100];
  int count=0,i;
  scanf("%[^\n]",s);
  for(i=0;s[i]!='\0';i++)
  {
  count=count++;
  }
  printf("%d",i);
  return 0;
}