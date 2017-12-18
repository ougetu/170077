import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.GridLayout;   
    
public class UserReg1 extends JFrame{
  UserReg1(String title){
    setTitle(title);
    setSize(300,300);
    setLocation(500,500);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    JPanel panel = new JPanel();
    panel.setLayout(new GridLayout(2,2));
    //excelみたいに2列2行を設置する

    JPasswordField jpf = new JPasswordField("password");
    JLabel lbl = new JLabel("mail");
    JLabel lbl2 = new JLabel("Password");
    JTextField jtf = new JTextField("",20);
            
    panel.add(lbl);
    panel.add(jtf);
    panel.add(lbl2);
    panel.add(jpf);
            
    Container cp = getContentPane();
    cp.add(panel,BorderLayout.NORTH);  
    }
    
    public static void main(String args[]){
      UserReg1 window = new UserReg1("window");
      window.setVisible(true);    
    }
}