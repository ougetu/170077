import javax.swing.*;
import java.awt.*;

public class HelloMenuFukusuRBT extends JFrame{
	HelloMenuFukusuRBT(String title){
		setTitle(title);
		setSize(500,500);
		setLocation(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JMenuBar menubar = new JMenuBar();
	
		JPanel panel = new JPanel();

		JRadioButton rbt1 = new JRadioButton("A");
		JRadioButton rbt2 = new JRadioButton("B");
		JRadioButton rbt3 = new JRadioButton("C");

		panel.setLayout(new GridLayout(3,1));

		panel.add(rbt1);
		panel.add(rbt2);
		panel.add(rbt3);

		JMenu filemenu = new JMenu("File");
		JMenu editmenu= new JMenu("Edit");
		JMenu helpmenu = new JMenu("Help");

		JMenuItem newitem = new JMenuItem("new");
		JMenuItem openitem = new JMenuItem("open");
		JMenuItem closeitem = new JMenuItem("close");
	
		JMenuItem cutitem = new JMenuItem("cut");
		JMenuItem copyitem = new JMenuItem("copy");
		JMenuItem pasteitem = new JMenuItem("paste");
	
		JMenuItem versionitem = new JMenuItem("version");
		JMenuItem indexitem = new JMenuItem("index");

		//メニューバーをウィンドウにsetする
		setJMenuBar(menubar);
		//メニューバーにメニューを入れる
		menubar.add(filemenu);
		menubar.add(editmenu);
		menubar.add(helpmenu);
		//メニューにアイテムを入れる
		
		filemenu.add(newitem);
		filemenu.add(openitem);
		filemenu.add(closeitem);

		editmenu.add(cutitem);
		editmenu.add(copyitem);
		editmenu.add(pasteitem);

		helpmenu.add(versionitem);
		helpmenu.add(indexitem);

		Container cp = getContentPane();
		cp.add(panel,BorderLayout.NORTH);

	}

	public static void main(String[] args){
		HelloMenuFukusuRBT frame = new HelloMenuFukusuRBT("window");
		frame.setVisible(true);
	}
}