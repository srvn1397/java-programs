import java.util.*;
class Autoexit
{
public static void main(String arg[])
{
int i=0,count=1;
String str[]=new String[count];
String temp[]=new String[count];
Scanner sc=new Scanner(System.in);
String s1,d="q";
s1=sc.next();
while((s1.equals(d))==false)
{
str[i]=s1;
i++;
count++;
temp=new String[count];
for(int j=0;j<str.length;j++)
{
temp[j]=str[j];
}
str=new String[count];
for(int j=0;j<str.length;j++)
{
str[j]=temp[j];
}
s1=sc.next();
}

for(int j=0;j<str.length-1;j++)
{System.out.print(str[j]+" ");}
}
}
