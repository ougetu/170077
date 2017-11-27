import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Container;
import java.awt.BorderLayout;

public class Hello2 extends JFrame{
	Hello2(String title){
		setTitle(title);
		setSize(300,300);
		setLocation(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton btn = new JButton("click");

		JPanel pl = new JPanel();
		pl.add(btn);

		Container cp = getContentPane();
		cp.add(pl,BorderLayout.CENTER);
	}

	public static void main(String[] args){
		Hello2 hello = new Hello2("HELLO");
		hello.setVisible(true);
	}
}