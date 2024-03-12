package JAVALAB;
//Client.java
import java.io.*;
import java.net.*;

public class clientt {
 public static void main(String[] args) {
     try {
         Socket socket = new Socket("localhost", 3339);
         System.out.println("Connected to server: " + socket);

         BufferedReader inputReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
         PrintWriter outputWriter = new PrintWriter(socket.getOutputStream(), true);
         BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));

         System.out.print("Enter file name to download: ");
         String fileName = consoleReader.readLine();
         outputWriter.println(fileName);

         String line;
         while ((line = inputReader.readLine()) != null) {
             if (line.equals("File not found")) {
                 System.out.println("File not found on server");
                 break;
             }
             System.out.println("Received: " + line);
         }

         socket.close();
     } catch (IOException e) {
         e.printStackTrace();
     }
 }
}

