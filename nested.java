import java.io.*;

class Cumul {
    public void cu1(int a) {
        int m = a * a;
        int z = cube(m, a);
        System.out.println("Cube is " + z);
    }

    public int cube(int a, int b) {
        int c = a * b;
        return c;
    }
}

public class Nested {
    public static void main(String args[]) {
        try {
            String s;
            DataInputStream d = new DataInputStream(System.in);
            System.out.println("Enter the number");
            s = d.readLine();
            int a = Integer.parseInt(s);
            Cumul c = new Cumul();
            c.cu1(a);
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
