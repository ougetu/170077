import java.net.ServerSocket;
import java.io.IOException;
import java.net.Socket;
import java.net.InetAddress;

public class MyServer02{
	public static void main(String[] args){
		ServerSocket servsock = null;
		Socket clientSock = null;

		try{
			servsock = new ServerSocket(6000,30);
			while(true){
				clientSock = servsock.accept();
				InetAddress iaClient = clientSock.getInetAddress();
				String ipClient = iaClient.toString();
				System.out.println("クライアントIP:"+ipClient);
			}
		}catch(IOException e){
			System.out.println("サーバエラー");
			System.exit(1);
		}	
	}
}