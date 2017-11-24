import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Container;
import java.awt.BorderLayout;

public class Hello extends JFrame{
	Hello(String title){
		setTitle(title);
		setSize(200,200);
		setLocation(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton btn = new JButton("click me");
		
		JPanel pl = new JPanel();
		pl.add(btn);

		Container cp = getContentPane();
		cp.add(pl,BorderLayout.CENTER);
	}

	public static void main(String[] args){
		Hello hello = new Hello("ALOHA");
		hello.setVisible(true);
	}
}