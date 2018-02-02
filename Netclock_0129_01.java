import java.io.*;
import java.net.*;
import java.util.*;

public class Netclock_0129_01{
	public static void main(String[] args){
		ServerSocket servsock = null;
		Socket sock;
		OutputStream out;
		String outstr;

		try{
			servsock = new ServerSocket(6000,300);

			while(true){
				sock = servsock.accept();
				System.out.println("きたー");

				outstr = "YES";
				out = sock.getOutputStream();

				for(int i=0;i<outstr.length();i++){
					out.write((int) outstr.charAt(i));
				}
			}

		} catch(IOException e){
			//System.err.println("error");
			System.exit(1);
		}
	}
}