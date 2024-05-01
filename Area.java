class newRect
{
int length;
int breadth;
 newRect(int l,int b)
{
 length=l;
 breadth=b;
}
int arect()
{

int a= length*breadth;
return a;}
}
public class Area
{
public static void main(String args[])
{
 newRect r1=new newRect(8,8);
 int ar=r1.arect();
System.out.println("area is"+ar);


}

}