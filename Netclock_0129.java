import java.io.*;
import java.net.*;
import java.util.*;

public class Netclock_0129{
	public static void main(String[] args){
		ServerSocket servsock = null;
		Socket sock;

		try {
			servsock = new ServerSocket(6000,300);

			while(true){
				sock = servsock.accept();
				System.out.println("きたー");
			}
		} catch(IOException e){
			System.exit(1);
		}
	}
}
