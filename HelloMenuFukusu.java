import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloMenuFukusu extends JFrame implements ActionListener{
	JMenu filemenu;
	JMenu editmenu;
	JMenu helpmenu;
	JTextField textfield;
	HelloMenuFukusu(String title){
		setTitle(title);
		setSize(500,500);
		setLocation(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

   		JPanel panel = new JPanel();
   		this.textfield = new JTextField("",20);
     	panel.add(textfield);

		JMenuBar menubar = new JMenuBar();

		this.filemenu = new JMenu("File");
		this.editmenu= new JMenu("Edit");
		this.helpmenu = new JMenu("Help");

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

		newitem.addActionListener(this);
		openitem.addActionListener(this);
		closeitem.addActionListener(this);
		cutitem.addActionListener(this);
		copyitem.addActionListener(this);
		pasteitem.addActionListener(this);
		versionitem.addActionListener(this);
		indexitem.addActionListener(this);

		Container cp = getContentPane();
        cp.add(panel,BorderLayout.CENTER);

	}

	public static void main(String[] args){
		HelloMenuFukusu frame = new HelloMenuFukusu("window");
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand() == "new") {
			String text = this.filemenu.getText();
			this.textfield.setText("ファイルを作成");
  		}
   		if(e.getActionCommand() == "open") {
     		String text = this.filemenu.getText();
   			this.textfield.setText("ファイルを開く");
   		}
   		if(e.getActionCommand() == "close") {
     		String text = this.filemenu.getText();
   			this.textfield.setText("ファイルを閉じる");
   		}
   		if(e.getActionCommand() == "cut") {
      		String text = this.filemenu.getText();
   			this.textfield.setText("切り取り");
   		}
   		if(e.getActionCommand() == "copy") {
     		String text = this.filemenu.getText();
   			this.textfield.setText("コピー");
   		}
   		if(e.getActionCommand() == "paste") {
     		String text = this.filemenu.getText();
   			this.textfield.setText("貼り付ける");
   		}
   		if(e.getActionCommand() == "version") {
     		String text = this.filemenu.getText();
   			this.textfield.setText("更新");
   		}
   		if(e.getActionCommand() == "index") {
     		String text = this.filemenu.getText();
   			this.textfield.setText("stoneslorp");
   		}
	}
}