import javax.swing.*;
import java.awt.*;

public class HelloMenuFukusuRBTandCB extends JFrame{
	HelloMenuFukusuRBTandCB(String title){
		setTitle(title);
		setSize(500,500);
		setLocation(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JMenuBar menubar = new JMenuBar();
	
		JPanel panel = new JPanel();

		JRadioButton rbt1 = new JRadioButton("RADIOBUTTON 1");
		JRadioButton rbt2 = new JRadioButton("RADIOBUTTON 2");
		JRadioButton rbt3 = new JRadioButton("RADIOBUTTON 3");

		JCheckBox cb1 = new JCheckBox("CHECK 1");
		JCheckBox cb2 = new JCheckBox("CHECK 2");
		JCheckBox cb3 = new JCheckBox("CHECK 3");
	
		panel.setLayout(new GridLayout(2,3));

		panel.add(rbt1);
		panel.add(rbt2);
		panel.add(rbt3);

		panel.add(cb1);
		panel.add(cb2);
		panel.add(cb3);

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
		HelloMenuFukusuRBTandCB frame = new HelloMenuFukusuRBTandCB("window");
		frame.setVisible(true);
	}
}