import java.io.*;
import java.net.*;

public class Readnet_0129{
	public static void main(String[] args){
		byte[] buff = new byte[1024];
		Socket readsock = null;

		try{
			readsock = new Socket(args[0],Integer.parseInt(args[1]));
		} catch(Exception e){
			System.err.println("error");
			System.exit(1);
		}
	}
}