import java.io.*;
import java.net.*;

public class Readnet_0129_01{
	public static void main(String[] args){
		byte[] buff = new byte[1024];
		Socket readsock = null;
		InputStream in = null;
		boolean cont = true;

		try{
			readsock = new Socket(args[0],Integer.parseInt(args[1]));
			in = readsock.getInputStream();

		} catch (Exception e){
			System.out.println("エラー");
			System.exit(1);
		}


		while(cont){
			try{	
				int n = in.read(buff);
				System.out.write(buff,0,n);
				in.close();
			} catch (Exception e){
				cont = false;
			}
		}

	}
}