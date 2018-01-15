import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class File{
	public static void main(String[] args){
		try{
			FileWriter fw = new FileWriter("data.txt");
			BufferedWriter bw = new BufferedWriter(fw);

			bw.write("ALOHA");
			bw.close();
		} catch(IOException e){
			System.out.println("File writing ... faild");
		}
	}
}