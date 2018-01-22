import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GuiInput extends JFrame implements ActionListener {
  String a = "ALOHA........";
  public JTextField field;

  public void actionPerformed(ActionEvent e){
    this.field.setText(a);
  }
  
  GuiInput(String title){
    setTitle(title);
 	  setBounds(100,100,500,500);
  	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 	
   
  
  	JButton btn = new JButton("push");
  	JPanel panel = new JPanel();
   	panel.add(btn);
    
   	this.field = new JTextField("",20);

 	  btn.addActionListener(this);

  	Container cp = getContentPane();
   	cp.add(panel,BorderLayout.NORTH);
    cp.add(field,BorderLayout.CENTER);
     
 	}
  	
    public static void main(String[] args){
   		GuiInput gi = new GuiInput("ALOHA");
     	gi.setVisible(true);
    }
 } 