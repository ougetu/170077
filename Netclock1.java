 import java.io.IOException;
 import java.io.ObjectInputStream;
 import java.io.ObjectOutputStream;
 import java.lang.ClassNotFoundException;
 import java.net.ServerSocket;
 import java.net.Socket;
 
 public class Netclock1 {
 
     private static ServerSocket server;
     private static int port = 6000;
 
     public static void main(String args[]){
 
         try{
             server = new ServerSocket(port,300);
 
           while(true){
               System.out.println("Waiting for client request");
               Socket socket = server.accept();
 
               try{
                 ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
                 String message = (String) ois.readObject();
 
                 System.out.println("Message Received: " + message);
                 ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
                 oos.writeObject("Hi Client "+message);
 
                 ois.close();
                 oos.close();
                 socket.close();
                 if(message.equalsIgnoreCase("exit")) break;
               }catch(ClassNotFoundException er){
                   System.out.println("class not found");
               }
 
 
           }
           System.out.println("Shutting down Socket server!!");
           server.close();
         }catch	(IOException	e)	{
            System.exit(1);
             System.out.println("error: ");
   	  	}
 
     }
 
 }