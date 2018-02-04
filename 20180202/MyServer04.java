import java.net.ServerSocket;
import java.net.Socket;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

public class MyServer04{
	public static void main(String[] args){
		ServerSocket servsock = null;
		Socket sock = null;
		OutputStream os= null;
		PrintWriter pw = null;
		String outstr;

		try{
			outstr = "HELLO";
			servsock = new ServerSocket(5000,30);
			while(true){
				sock = servsock.accept();
				os = sock.getOutputStream();
				pw = new PrintWriter(os);
				pw.println(outstr);
				pw.flush();
			}			
		}catch(IOException e){
			System.out.println("サーバエラー");
		}

	}
}