  import java.net.ServerSocket;
  import java.net.Socket;
  import java.io.IOException;
  
  public class MyServer1 {
    // data
    static int portNum = 5999;
    // method
    // main
    public static void main (String[] args) {
      // 変数宣言
      ServerSocket servSock = null;
      Socket clientSock = null;
  
      try {
        // サーバソケットをつくる
        servSock = new ServerSocket(portNum, 30);
  
        // 繰り返し、クライアントからの接続を待つ
        while (true) {
          // クライアントの接続を受け付ける
          clientSock = servSock.accept();
          System.out.println("接続を受付ました.");
        }
      } catch (IOException e) {
        System.err.println("サーバエラー");
        System.exit(1);
      }
    }
  }