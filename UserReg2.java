import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.GridLayout;   

public class UserReg2 extends JFrame{
  UserReg2(String title){
    setTitle(title);
    setSize(300,300);
    setLocation(500,500);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    JPanel panel = new JPanel();
    
    JCheckBox check1 = new JCheckBox("Linux");
    JCheckBox check2= new JCheckBox("macos");
    JCheckBox check3 = new JCheckBox("Android");

    panel.add(check1);
    panel.add(check2);
    panel.add(check3);

    //JPasswordField jpf = new JPasswordField();
    //JLabel lbl = new JLabel("mail");
    //JLabel lbl2 = new JLabel("Password");
   //JTextField jtf = new JTextField("",20);
    
    //panel.setLayout(new GridLayout(2,2));

    //panel.add(lbl);
    //panel.add(jtf);
    //panel.add(lbl2);
    //panel.add(jpf);
            
    Container cp = getContentPane();
    cp.add(panel,BorderLayout.NORTH);  
    }
    
    public static void main(String args[]){
      UserReg2 window = new UserReg2("window");
      window.setVisible(true);    
    }
}