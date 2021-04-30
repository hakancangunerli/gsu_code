#include<stdio.h>
#include <string.h>

char*strCpy(char*strDest,const char*strSrc){
int i;
i=0;
while(strSrc[i]!= '\0')
{
strDest[i]=strSrc[i];
i++;
}
strDest[i]='\0';
return strDest;
} 