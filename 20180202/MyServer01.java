import java.net.ServerSocket;
import java.io.IOException;
import java.net.Socket;

public class MyServer01{
	public static void main(String[] args){
		ServerSocket servsock = null;
		Socket clientSock = null;

		try{
			servsock = new ServerSocket(6000,30);
			while(true){
				clientSock = servsock.accept();
			}
		}catch(IOException e){
			System.out.println("サーバエラー");
			System.exit(1);
		}	
	}
}