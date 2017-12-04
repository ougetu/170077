import java.awt.*;
import javax.swing.*;


public class TestGui extends JFrame{
	TestGui(String title){
		setTitle(title);
		setSize(1000,1000);
		setLocation(0,0);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel pl = new JPanel();

		JTextField jtf = new JTextField("",20);
		JPasswordField jpf = new JPasswordField("ALOHA");

		pl.add(jtf,BorderLayout.NORTH);
		pl.add(jpf,BorderLayout.NORTH);

		Container cp = getContentPane();
		cp.add(pl,BorderLayout.NORTH);
	}

	public static void main(String[] args){
		TestGui tg = new TestGui("ALOHA");
		tg.setVisible(true);
	}
}