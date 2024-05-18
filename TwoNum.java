
import java.io.*;
import java.lang.*;
class AddNum
{

int n1;
int n2;
public void getdata()
{
try{

  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String s;
System.out.println("Enter the first number");
s=br.readLine();
n1=Integer.parseInt(s);
System.out.println("Enter the second number");
s=br.readLine();
n2=Integer.parseInt(s);


}catch(Exception e)
{}
}
public int SumOf()
{
int sum=n1+n2;
return sum;
}
}

public class TwoNum
{
public static void main(String args[])
{

AddNum s1=new AddNum();
s1.getdata();
int s=s1.SumOf();
System.out.println("first is"+n1);
System.out.println("second is"+n2);
System.out.println("sum is"+s);


}

}