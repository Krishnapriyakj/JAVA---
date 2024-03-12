package JAVALAB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class client {
	 public static void main(String[] args) {
	        DatagramSocket socket = null;

	        try {
	            // Create a client socket
	            socket = new DatagramSocket();

	            // Read input from the user
	            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

	            while (true) {
	                // Read message from the user
	                System.out.print("You: ");
	                String message = userInput.readLine();

	                // Convert message to byte array
	                byte[] sendData = message.getBytes();

	                // Specify server address and port
	                InetAddress serverAddress = InetAddress.getByName("localhost");
	                int serverPort = 9872;

	                // Create packet with message and send to server
	                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, serverPort);
	                socket.send(sendPacket);
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            if (socket != null) {
	                socket.close();
	            }
	        }
	    }}

