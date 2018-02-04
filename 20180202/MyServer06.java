import java.net.ServerSocket;
import java.io.IOException;
import java.net.Socket;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.OutputStream;
import java.io.PrintWriter;

public class MyServer06{
	public static void main(String[] args){
		ServerSocket servsock = null;
		Socket clientSock = null;
		PrintWriter pw = null;

		try{
			servsock = new ServerSocket(3999,30);
			while(true){
				clientSock = servsock.accept();
				InputStream is = clientSock.getInputStream();
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(isr);
				String serverData = br.readLine();
				System.out.println(serverData);
				OutputStream os = clientSock.getOutputStream();
				pw = new PrintWriter(os);
				pw.println(serverData);
				pw.flush();
			}
		}catch(IOException e){
			System.out.println("サーバエラー");
			System.exit(1);
		}	
	}
}
