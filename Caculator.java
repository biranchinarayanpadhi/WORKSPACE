package awt;
import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Calculator extends JFrame implements ActionListener
{
    
    JLabel l1=new JLabel("Enter Number");
    JTextField t1=new JTextField();
    
    JLabel l3=new JLabel("Enter Number");
    JTextField t3=new JTextField();
    
    JLabel l2=new JLabel("Result");
    JTextField t2=new JTextField();
    
    JButton b1=new JButton("Add");
    JButton b2=new JButton("Substraction");
    JButton b3=new JButton("Division");
    JButton b4=new JButton("Multiplication");
    JButton b5=new JButton("Mod");
    JButton b6=new JButton("sqrt");
    
	Calculator()
	{
            
            super.setLayout(null);
            l1.setBounds(50,50,100,30);
            super.add(l1);
            l3.setBounds(50,80,100,30);
            super.add(l3);
            l2.setBounds(50,110,100,30);
            super.add(l2);
            
            t1.setBounds(150,50,100,30);
            super.add(t1);
            t3.setBounds(150,80,100,30);
            super.add(t3);
            t2.setBounds(150,110,100,30);
            super.add(t2);
            
            
            b1.setBounds(50,200,100,30);
            super.add(b1);
           
            b2.setBounds(150,200,100,30);
            super.add(b2);
            
            b3.setBounds(250,200,100,30);
            super.add(b3);
            
             
            b4.setBounds(50,250,100,30);
            super.add(b4);
            
             
            b5.setBounds(150,250,100,30);
            super.add(b5);
             
            b6.setBounds(250,250,100,30);
            super.add(b6);
            super.setVisible(true);
            super.setTitle("Fact");
            super.setBounds(200,200,500,500);
            
            b1.addActionListener(this);
            b2.addActionListener(this);
            b3.addActionListener(this);
            b4.addActionListener(this);
            b5.addActionListener(this);
            b6.addActionListener(this);
            
            
            
	}
        public void actionPerformed(ActionEvent ae)
        {
            if(ae.getSource()==b1)
            {
                
                double r=Double.parseDouble(t1.getText());
                double i=Double.parseDouble(t3.getText());
                
                double s=r+i;
               
               t2.setText(s+" ");
            }
            else if(ae.getSource()==b2)
            {
                double r=Double.parseDouble(t1.getText());
                double i=Double.parseDouble(t3.getText());
                
                double s=r-i;
               
               t2.setText(s+" ");
            }
            
            else if(ae.getSource()==b3)
            {
                double r=Double.parseDouble(t1.getText());
                double i=Double.parseDouble(t3.getText());
                
                double s=r/i;
               
               t2.setText(s+" ");   
                        
            }
            else if(ae.getSource()==b4)
            {
                double r=Double.parseDouble(t1.getText());
                double i=Double.parseDouble(t3.getText());
                
                double s=r*i;
               
               t2.setText(s+" ");
            }
            else if(ae.getSource()==b5)
            {
                double r=Double.parseDouble(t1.getText());
                double i=Double.parseDouble(t3.getText());
                
                double s=r%i;
               
               t2.setText(s+" ");
            }
            else
            {
                double r=Double.parseDouble(t1.getText());
                double i=Double.parseDouble(t3.getText());
                
                double s=Math.sqrt(r);
                double t=Math.sqrt(i);
               
               t2.setText(s+"\t"+t);
            }
                    
        }
	public static void main(String args[])
	{
	Calculator c=new Calculator();
	}
}
