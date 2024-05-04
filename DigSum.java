public class DigSum
{
public static void main(String args[])
{
int sum=0;
int i;
int j=235;
while(j>0)
{
i=j%10;
sum=sum+i;
j=j/10;
}
System.out.println("The sum of digit is"+ sum);
}
}