import java.util.Scanner;
class Lift
{
int l[]=new int[6];
int d[]=new int[6];
int userfloor,userdirection;
Boolean flag=false;
void get()
{
System.out.println("Enter the lift positions");
Scanner s=new Scanner(System.in);
for(int i=0;i<l.length;i++)
{
System.out.println("lift  "+(i+1));
l[i]=s.nextInt();
}
System.out.println("enter the lift directions");
System.out.println("if upward give as 1");
System.out.println("if downward give as -1");
System.out.println("if not moving give as 0");
for(int i=0;i<l.length;i++)
{
System.out.println("lift  "+(i+1));
d[i]=s.nextInt();
}
System.out.println("Enter the userfloor");
userfloor=s.nextInt();
System.out.println("Enter the userdirection");
System.out.println("if upward give as 1");
System.out.println("if downward give as -1");
userdirection=s.nextInt();
}
void nearesthigh()
{
int nearhigh=10,liftnumber=0,i;
for(i=0;i<l.length;i++)
{
if(((l[i]>=userfloor)&&(d[i]<=0))||(d[i]==0))
{
if((l[i])<=(nearhigh))
{
nearhigh=l[i];
liftnumber=i+1;
flag=true;
}
}
}
if(flag==true)
{System.out.println("nearest lift is liftno="+liftnumber+"  in floor"+nearhigh);}
}
void nearestlow()
{
int nearlow=1,liftnumber=0,i;
for(i=0;i<l.length;i++)
{
if(((l[i]<=userfloor)&&(d[i]>=0))||(d[i]==0))
{
if((l[i])>=(nearlow))
{
nearlow=l[i];
liftnumber=i+1;
flag=true;
}
}
}
if(flag==true)
{System.out.println("nearest lift is liftno="+liftnumber+"  in floor="+nearlow);}
}
public static void main(String arg[])
{
Lift o=new Lift();
o.get();
if(o.userdirection>0)
{
o.nearestlow();
if(o.flag==false)
{o.nearesthigh();}
if(o.flag==false)
{System.out.println("please wait all lifts are going downward");}
}
else
{o.nearesthigh();
if(o.flag==false)
{o.nearestlow();}
if(o.flag==false)
{System.out.println("please wait all lifts are going upward");}
}
}
}