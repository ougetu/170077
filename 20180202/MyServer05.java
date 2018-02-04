import java.net.ServerSocket;
import java.io.IOException;
import java.net.Socket;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.net.InetAddress;
import java.util.Date;

public class MyServer05{
	public static void main(String[] args){
		ServerSocket servsock = null;
		Socket clientSock = null;
		OutputStream os;
		PrintWriter pw;
		String msg1 = "コードネーム：ougetu";
		String msg2;
		String serverData;
		Date d;

		try{
			servsock = new ServerSocket(4000,30);
			while(true){
				clientSock = servsock.accept();
				InputStream is = clientSock.getInputStream();
				InetAddress iaClient = clientSock.getInetAddress();
				String ipClient = iaClient.toString();
				System.out.println("クライアントIP:"+ipClient);


				d = new Date();
				msg2 = d.toString();
				os = clientSock.getOutputStream();
				pw = new PrintWriter(os);
				pw.println(msg2);
				pw.println(msg1);
				pw.flush();


				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(isr);
				serverData = br.readLine();
				System.out.println("受信データ:"+serverData);
				
			}
		}catch(IOException e){
			System.out.println("サーバエラー");
			System.exit(1);
		}	
	}
}
