<<<<<<< HEAD
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HelloMenuFukusuRBTandCB1 extends JFrame implements ActionListener{
	JLabel[] label;
	JCheckBox[] checkbox;
	JRadioButton[] radiobutton;
	int i = 0;

	public void actionPerformed(ActionEvent e){
		while(i>0){
			if(this.radiobutton[i].isSelected()){
				this.label[i].setText(e.getActionCommand()+"が選択されています。");
			} else {
				//this.radiobutton[n].getText("が選択されていません。");
				this.label[i].setText(e.getActionCommand()+"が選択されていません。");
			}
		}
	}

	HelloMenuFukusuRBTandCB1(String title){
		setTitle(title);
		setSize(500,500);
		setLocation(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JMenuBar menubar = new JMenuBar();
	
		JPanel panel = new JPanel();
		JButton button = new JButton("CHECK");
		button.addActionListener(this);

		panel.add(button);
		panel.setLayout(new GridLayout(4,3));

		this.label = new JLabel[3];
		this.checkbox = new JCheckBox[3];
		this.radiobutton = new JRadioButton[3];

		ButtonGroup group = new ButtonGroup();

		while(i<3){
			this.label[i] = new JLabel("here is a label");
			this.checkbox[i] = new JCheckBox("CHECKBOX "+(i+1));
			this.radiobutton[i] = new JRadioButton("RADIOBUTTON "+(i+1));

			group.add(this.radiobutton[i]);

			panel.add(this.label[i]);
			panel.add(this.checkbox[i]);
			panel.add(this.radiobutton[i]);
			i++;
		}

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
		HelloMenuFukusuRBTandCB1 frame = new HelloMenuFukusuRBTandCB1("window");
		frame.setVisible(true);
	}
=======
//できないやつ


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HelloMenuFukusuRBTandCB1 extends JFrame implements ActionListener{
	JLabel[] label;
	JCheckBox[] checkbox;
	JRadioButton[] radiobutton;
	int i = 0;
	public void actionPerformed(ActionEvent e){
		while(i<3){
			if(this.radiobutton[i].isSelected()){
				this.label[i].setText(this.radiobutton[i].getText("が選択されています。"));
			} else {
				//this.radiobutton[n].getText("が選択されていません。");
				this.label[i].setText(this.radiobutton[i].getText("が選択されていません。"));
			}
			i++;
		}
	}

	HelloMenuFukusuRBTandCB1(String title){
		setTitle(title);
		setSize(500,500);
		setLocation(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JMenuBar menubar = new JMenuBar();
	
		JPanel panel = new JPanel();
		JButton button = new JButton("CHECK");
		button.addActionListener(this);

		panel.setLayout(new GridLayout(4,3));

		this.label = new JLabel[3];
		this.checkbox = new JCheckBox[3];
		this.radiobutton = new JRadioButton[3];

		while(i<3){
			this.label[i] = new JLabel("here is a label");
			this.checkbox[i] = new JCheckBox("CHECKBOX "+(i+1));
			this.radiobutton[i] = new JRadioButton("RADIOBUTTON "+(i+1));

			panel.add(this.label[i]);
			panel.add(this.checkbox[i]);
			panel.add(this.radiobutton[i]);
			i++;
		}

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
		HelloMenuFukusuRBTandCB1 frame = new HelloMenuFukusuRBTandCB1("window");
		frame.setVisible(true);
	}
>>>>>>> 328ff421f40732aac58cb0718516c986348ed654
}