import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Container;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AlohaGui extends JFrame implements ActionListener {
	private JTextField jtf;
	private JButton jb;

	public void actionPerformed(ActionEvent e){
		String msg ="ALOHA!";
		this.jtf.setText(msg);
	}

	AlohaGui(String title){
		setTitle(title);
		setSize(500,500);
		setLocation(0,0);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel jp = new JPanel();
		this.jtf = new JTextField("",20);
		this.jb = new JButton("click");
		jb.addActionListener(this);

		jp.add(jtf,BorderLayout.NORTH);
		jp.add(jb);

		Container ct = getContentPane();
		ct.add(jp,BorderLayout.CENTER);
	}

	public static void main(String[] args){
		AlohaGui ag = new AlohaGui("ALOHA");
		ag.setVisible(true);
	}
}
