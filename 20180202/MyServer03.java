import java.net.ServerSocket;
import java.io.IOException;
import java.net.Socket;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class MyServer03{
	public static void main(String[] args){
		ServerSocket servsock = null;
		Socket clientSock = null;

		try{
			servsock = new ServerSocket(5999,30);
			while(true){
				clientSock = servsock.accept();
				InputStream is = clientSock.getInputStream();
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(isr);
				String serverData = br.readLine();

				System.out.println("受信したデータ:"+serverData);
			}
		}catch(IOException e){
			System.out.println("サーバエラー");
			System.exit(1);
		}	
	}
}
//7番から