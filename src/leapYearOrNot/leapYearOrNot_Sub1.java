package leapYearOrNot;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
@SuppressWarnings("serial")
public class leapYearOrNot_Sub1 extends JFrame implements ActionListener{

	public int year;
	boolean leap = false;
	
	public JLabel titleonel;
	public JLabel titletwol;
	public JLabel yearl;
	public JLabel resultl;
	public JTextField yeartf;
	public JTextField resulttf;
	public JButton enter;
	public JButton clear;
	public JButton exit;
	
	public leapYearOrNot_Sub1() {
		Container c = getContentPane();
		
		c.setLayout(null);
		c.add(titleonel=new JLabel("Leap Year or"));
		c.add(titletwol=new JLabel("Not a Leap Year"));
		c.add(yearl=new JLabel("ENTER THE YEAR: "));
		c.add(resultl=new JLabel("RESULT: "));
		c.add(yeartf=new JTextField());
		c.add(resulttf=new JTextField());
		
		c.add(enter=new JButton("Enter"));
		c.add(clear=new JButton("Clear"));
		c.add(exit=new JButton("Exit"));
		
		enter.addActionListener(this);
		clear.addActionListener(this);
		exit.addActionListener(this);
		
		Color c1 = Color.white;
		Color c2 = Color.gray;
		
		Font f = (new Font ("Arial Sans", Font.PLAIN, 12));
		Font f2 = (new Font ("Arial Sans", Font.ITALIC, 20));
		titleonel.setFont(f2);
		titletwol.setFont(f2);
		yearl.setFont(f);
		resultl.setFont(f);
		yeartf.setFont(f);
		
		enter.setFont(f);
		clear.setFont(f);
		exit.setFont(f);
		
		c.setBackground(c2);
		
		titleonel.setForeground(c1);
		titletwol.setForeground(c1);
		yearl.setForeground(c1);
		resultl.setForeground(c1);
		
		titleonel.setBounds(125,30,150,30);
		titletwol.setBounds(110,60,150,30);
		
		yearl.setBounds(20,140,150,30);
		yeartf.setBounds(20,180,150,30);
		resultl.setBounds(20,220,150,30);
		resulttf.setBounds(20,260,150,30);	
		
		enter.setBounds(210,160,130,30);
		clear.setBounds(210,200,130,30);
		exit.setBounds(210,240,130,30);
		
		resulttf.setEditable(false);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==enter) {
			year = Integer.parseInt(yeartf.getText());
			if (year % 4 == 0) {

			      // if the year is century
			      if (year % 100 == 0) {

			        // if year is divided by 400
			        // then it is a leap year
			        if (year % 400 == 0)
			          leap = true;
			        else
			          leap = false;
			      }
			      
			      // if the year is not century
			      else
			        leap = true;
			    }
			    else
			      leap = false;

			    if (leap)
			    	resulttf.setText( year + " is a leap year.");
			    else
			    	resulttf.setText( year + " is not a leap year.");
		}		
		if(e.getSource()==clear) {
			yeartf.setText("");
			resulttf.setText("");
		}
		
		if(e.getSource()==exit) {
			System.exit(0);
		}
	} 
}
