package JAVALAB;
import java.io.*;    
import java.net.*;    
   
public class contentdemo {
	public static void main(String[] args) {
        try {
            // Create a URL object
            URL url = new URL("https://www.wikipedia.org");

            // Open a connection to the URL
            URLConnection urlConnection = url.openConnection();

            // Create a BufferedReader to read the content from the URL
            BufferedReader in = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));

            // Read the content line by line and print it
            String inputLine;
            System.out.println("Content of the URL:");
            while ((inputLine = in.readLine()) != null) {
                System.out.println(inputLine);
            }

            // Close the BufferedReader
            in.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}
