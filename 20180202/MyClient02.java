import java.net.ServerSocket;
import java.io.IOException;
import java.net.Socket;
import java.io.OutputStream;
import java.io.PrintWriter;

public class MyClient02{
	public static void main(String[] args){
		
		String ipAddr = "172.16.21.71";
		int portNum = 5999;
		Socket socket = null;
		OutputStream os= null;
		PrintWriter pw = null;
		String outstr;

		try{

			socket = new Socket(ipAddr,portNum);
			while(true){
				os = socket.getOutputStream();
				pw = new PrintWriter(os);
				pw.println("ALOHA");
				pw.flush();
				
			}

		}catch(IOException e){
			System.out.println("クライアントエラー");
			System.exit(1);
		}	
	}
}