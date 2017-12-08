import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Container;

public class UserReg extends JFrame{
	UserReg(String title){
		setTitle(title);
		setSize(400,400);
		setLocation(0,0);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel mailLabel = new JLabel("mail");
		JLabel pwdLabel = new JLabel("password");

		JTextField mailField = new JTextField("wangyue707418@gmail.com");
		JPasswordField pwdField = new JPasswordField("password");
		//パスワードが表示しない、....と表示する。JPasswordFieldのパッケージがimportされたから
		JPanel panel = new JPanel();
		panel.add(mailLabel);
		panel.add(mailField);
		panel.add(pwdLabel);
		panel.add(pwdField);

		Container cp = getContentPane();
		cp.add(panel,BorderLayout.NORTH);
	}

	public static void main(String[] args){
		UserReg ug = new UserReg("ALOHA");
		ug.setVisible(true);
	}
}