import java.net.Socket;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class MyClient05{
	public static void main(String[] args){
		
		String ipAddr = "192.168.0.14";
		int portNum = 4000;
		Socket socket = null;
		InputStream is = null;
		OutputStream os = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		String numb = "学籍番号：170077";
		PrintWriter pw = null;
		try{
			socket = new Socket(ipAddr,portNum);
			is = socket.getInputStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			String serverData;

			while(true){
				serverData = br.readLine();
				System.out.println("受信データ:"+serverData);

				os = socket.getOutputStream();
				pw = new PrintWriter(os);
				pw.println(numb);
				pw.flush();

			}
		}catch(IOException e){

		}

	}
}