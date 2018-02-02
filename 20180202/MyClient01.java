import java.net.ServerSocket;
import java.io.IOException;
import java.net.Socket;

public class MyClient01{
	public static void main(String[] args){
		
		String ipAddr = "172.16.21.71";
		int portNum = 6000;
		Socket socket = null;
		
		try{
			socket = new Socket(ipAddr,portNum);
			System.out.println("サーバに接続しました。");
		}catch(IOException e){
			System.out.println("クライアントエラー");
			System.exit(1);
		}	
	}
}