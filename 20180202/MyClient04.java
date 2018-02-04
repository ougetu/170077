import java.net.Socket;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.IOException;

public class MyClient04{
	public static void main(String[] args){
		
		String ipAddr = "192.168.0.14";
		int portNum = 4999;
		Socket socket = null;
		OutputStream os = null;
		PrintWriter pw = null;

		try{
			socket = new Socket(ipAddr,portNum);
			String[] outstr = {"学籍番号：170077","githubユーザ名:ougetu","Blesh you"};
			while(true){
				
				os = socket.getOutputStream();
				for(int i=0;i<3;i++){
					pw = new PrintWriter(os);
					pw.println(outstr[i]);
					pw.flush();
				}
				socket.close();
			}
		}catch(IOException e){

		}

	}
}