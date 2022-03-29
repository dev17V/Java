import java.net.*;
import java.io.*;

public class server{
      public static void main(String[] args) throws IOException {
      ServerSocket ss = new ServerSocket(1771); //1771 is the port
      String port = "1771";
      System.out.println("SERVER ONLINE ON PORT: "+port);
      while (true) {
              Socket s = ss.accept();
              System.out.println("CLIENT ENTERED: "+ss);    
      }
	    //System.out.println("TEST DONE");
	}
}
