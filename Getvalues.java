import java.util.*;
class Getvalues
{
public static void main(String arg[])
{
Scanner s=new Scanner(System.in);
ArrayList a=new ArrayList();
String star,d="q";
star=s.next();
while((star.equals(d))==false)
{a.add(star);
star=s.next();
}
System.out.println(a);
}}