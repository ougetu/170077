import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HelloJCheckBox2 extends JFrame implements ActionListener{
	JLabel[] label;
	JCheckBox[] jb;
	
	public void actionPerformed(ActionEvent e){
		//System.out.println("CLICK!");
		for(int i=0;i<3;i++){
			if(this.jb[i].isSelected()){
				this.label[i].setText("CHECKBOX "+(i+1)+"が選択されています。");
			} else {
				this.label[i].setText("CHECKBOX "+(i+1)+"が選択されていません");
			}
		}
	}

	HelloJCheckBox2(String title){
		setTitle(title);
		setSize(600,500);
		setLocation(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel pl = new JPanel();
		pl.setLayout(new GridLayout(4,4));
		//行と列
			this.jb = new JCheckBox[3];
			this.label = new JLabel[3];

			this.label[0] = new JLabel();
			this.jb[0] = new JCheckBox("CHECKBOX 1");
			this.label[1] = new JLabel();
			this.jb[1] = new JCheckBox("CHECKBOX 2");
			this.label[2] = new JLabel();
			this.jb[2] = new JCheckBox("CHECKBOX 3");

			pl.add(this.label[0]);
			pl.add(this.jb[0]);
			pl.add(this.label[1]);
			pl.add(this.jb[1]);
			pl.add(this.label[2]);
			pl.add(this.jb[2]);

		JButton btn = new JButton("CHECK");
		btn.addActionListener(this);

		pl.add(btn);

		Container cp = getContentPane();
		cp.add(pl,BorderLayout.NORTH);

	}

	public static void main(String[] args){
		HelloJCheckBox2 hb = new HelloJCheckBox2("window");
		hb.setVisible(true);
	}
}
