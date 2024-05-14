import java.net.*;
import java.io.*;
public class MulticastChatClient {
    public static void main(String[] args) throws Exception {

        // Default port number we are going to use
        int portnumber = 8001;
        if (args.length >= 1){
            portnumber = Integer.parseInt(args[0]);
        }

        // Create a MulticastSocket
        MulticastSocket chatMulticastSocket = new MulticastSocket(portnumber);

        // Determine the Ip Address of a host, given the host name
        InetAddress group = InetAddress.getByName("225.4.5.6");


    }
}