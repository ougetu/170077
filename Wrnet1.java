import java.net.Socket;
import java.io.InputStream;
import java.io.IOException;

public class Wrnet1{
  public static void main(String[] args){
 //データ準備
    byte[] buff = new byte[1024];
  	Socket wrsocket = null;
   	InputStream instr = null;
    	//OuputStream outstr = null;
 //サーバに接続
 	  try {
  		wrsocket = new Socket("172.16.21.71",6000);
    	instr = wrsocket.getInputStream();
 // データを受信して標準出力に出力する
 		int n = instr.read(buff);
   	System.out.write(buff,0,n);
 //接続を切断する
 		instr.close();
  	} catch (Exception e) {
   		System.err.println("networkerror");
     	System.exit(1);
    }
 
 	}
}