import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;

public class TestScanner{
	public static void main(String[] args){
		try{
			FileWriter fw = new FileWriter("data.txt",true);
			BufferedWriter bw = new BufferedWriter(fw);

			String userData = "";

			FileReader fr = new FileReader("data.txt");
			BufferedReader br = new BufferedReader(fr);
			
			String str = br.readLine();

			while(str !=null){
				System.out.println(str);

				str = br.readLine();
			}

			while(true){
				System.out.print("input mas >");
				userData = new Scanner(System.in).nextLine();
				if(userData.equals("exit")) break;
				bw.write(userData+"\r\n");
 			}

			bw.close();

		} catch(IOException e){
			System.out.println("File writing ... faild");
		}
	}
}