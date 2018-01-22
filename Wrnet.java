// Wrnet.java
  // サーバにメッセージを送信し、返信を受け取って
  // 標準出力に出力する。
  //	usage:java Wrnet  サーバアドレス  ポート番号
  
import java.io.*;
import java.net.*;
  
public class Wrnet{
  public static void main(String[] args){
  	byte[] buff = new byte[1024];
  	Socket	wrsocket	=	null;
  	InputStream	instr	=	null;
  	OutputStream	outstr	=	null;
    boolean	cont	=	true;
  
  
  		// サーバへの接続
  		try	{
  			wrsocket	=	new Socket(args[0], Integer.parseInt(args[1]));
  			instr	=	wrsocket.getInputStream()	;
  			outstr	=	wrsocket.getOutputStream();
  		}	catch	(Exception	e)	{
  			System.err.println("ネットワークエラー");
  			System.exit(1);
  		}
  
  		// 入力を送信する。
  		while	(cont)
  		{
  			try	{
  				int	n	=	System.in.read(buff);
  				if	(buff[0]	== '.')	cont	=	false;
  				else	outstr.write(buff, 0, n);
  			} catch( Exception	e)	{
  				System.exit(1);
  			}
  		}
  
  
  		// サーバからの返信を出力する。
  		cont	=	true;
  		while	(cont)
  		{
  			try	{
  				int	n	=	instr.read(buff);
  				System.out.write(buff, 0, n);
  			}	catch	(Exception	e)	{
  				cont	=	false;
  			}
  		}
  
  
  		// 接続を閉じる。
  		try	{
  			instr.close();
  		}	catch	(Exception	e){
  			System.err.println("ネットワークエラー");
  			System.exit(1);
  		}
  
  }
}