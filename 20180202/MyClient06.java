import java.net.ServerSocket;
import java.io.IOException;
import java.net.Socket;
import java.io.OutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.PrintWriter;

public class MyClient06{
	public static void main(String[] args){
		
		String ipAddr = "192.168.0.14";
		int portNum = 3999;
		Socket socket = null;
		OutputStream os= null;
		PrintWriter pw = null;
		String outstr;

		try{

			socket = new Socket(ipAddr,portNum);

			while(true){
				outstr = "ALOHA";
				os = socket.getOutputStream();
				pw = new PrintWriter(os);
				pw.println(outstr);
				pw.flush();

				InputStream is = socket.getInputStream();
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(isr);
				String serverData = br.readLine();
				System.out.println("送り返してきたデータ："+serverData);
			}

		}catch(IOException e){
			System.out.println("クライアントエラー");
			System.exit(1);
		}	
	}
}