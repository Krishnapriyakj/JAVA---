import java.io.*;
public class CircleArea {
    static void calculateArea() {
        try {
            DataInputStream dis = new DataInputStream(System.in);
            System.out.println("Enter the radius of the circle: ");
            double radius = Double.parseDouble(dis.readLine());
            double area = Math.PI * radius * radius;
            System.out.println("Area of the circle: " + area);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void main(String args[]) {
        calculateArea();
    }
}

