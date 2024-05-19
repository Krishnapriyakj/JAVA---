public class throwsdemo1
{
public static void main(String args[]) 
{
int i=17;
try{

if(i<20) throw new MyException
{
System.out.println("number is less than 20");
}
else
{
System.out.println("i");
}
}
catch(MyException e)
{
System.out.println("user defined exception");
e.printStackTrace();
}
}
}
static class MyException extends Exception
{
MyException(String m);
{
super(m);
}
}