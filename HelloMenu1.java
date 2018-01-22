<<<<<<< HEAD
import javax.swing.*;
import java.awt.*;

public class HelloMenuFukusu extends JFrame{
	HelloMenu1(String title){
		setTitle(title);
		setSize(500,500);
		setLocation(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JMenuBar menubar = new JMenuBar();

		JMenu menu1 = new JMenu("File");
		//JMenu menu2 = new JMenu("Edit");
		//JMenu menu3 = new JMenu("Help");

		JMenuItem menuitem = new JMenuItem();

		setJMenuBar(menubar);
		menubar.add(menu1);
		menu1.add(menuitem);

	}

	public static void main(String[] args){
		HelloMenuFukusu frame = new HelloMenuFukusu("window");
		frame.setVisible(true);
	}
=======
import javax.swing.*;
import java.awt.*;

public class HelloMenuFukusu extends JFrame{
	HelloMenu1(String title){
		setTitle(title);
		setSize(500,500);
		setLocation(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JMenuBar menubar = new JMenuBar();

		JMenu menu1 = new JMenu("File");
		//JMenu menu2 = new JMenu("Edit");
		//JMenu menu3 = new JMenu("Help");

		JMenuItem menuitem = new JMenuItem();

		setJMenuBar(menubar);
		menubar.add(menu1);
		menu1.add(menuitem);

	}

	public static void main(String[] args){
		HelloMenuFukusu frame = new HelloMenuFukusu("window");
		frame.setVisible(true);
	}
>>>>>>> 328ff421f40732aac58cb0718516c986348ed654
}