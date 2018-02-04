import java.net.ServerSocket;
import java.net.Socket;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class MyClient03{
	public static void main(String[] args){
		String ipAddr = "192.168.0.14";
		int portNum = 5000;
		Socket socket = null;
		InputStream is = null;
		InputStreamReader isr;
		BufferedReader br;

		try{
			socket = new Socket(ipAddr,portNum);
			while(true){
				is = socket.getInputStream();
				isr = new InputStreamReader(is);
				br = new BufferedReader(isr);
				String serverData = br.readLine();
				System.out.println(serverData);
			}
		}catch(IOException e){
			System.out.println("クライアントエラー");
		}
	}
}