<<<<<<< HEAD
import javax.swing.*;
import java.awt.*;

public class HelloMenu extends JFrame{
	HelloMenu(String title){
		setTitle(title);
		setSize(500,500);
		setLocation(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JMenuBar menubar = new JMenuBar();
		JMenu menu = new JMenu("File");
		JMenuItem menuItem1 = new JMenuItem("new");
		JMenuItem menuItem2 = new JMenuItem("open");

		setJMenuBar(menubar);
		menubar.add(menu);
		menu.add(menuItem1);
		menu.add(menuItem2);

	}

	public static void main(String[] args){
		HelloMenu frame = new HelloMenu("ALOHA");
		frame.setVisible(true);
	}
=======
import javax.swing.*;
import java.awt.*;

public class HelloMenu extends JFrame{
	HelloMenu(String title){
		setTitle(title);
		setSize(500,500);
		setLocation(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JMenuBar menubar = new JMenuBar();
		JMenu menu = new JMenu("File");
		JMenuItem menuItem1 = new JMenuItem("new");
		JMenuItem menuItem2 = new JMenuItem("open");

		setJMenuBar(menubar);
		menubar.add(menu);
		menu.add(menuItem1);
		menu.add(menuItem2);

	}

	public static void main(String[] args){
		HelloMenu frame = new HelloMenu("ALOHA");
		frame.setVisible(true);
	}
>>>>>>> 328ff421f40732aac58cb0718516c986348ed654
}