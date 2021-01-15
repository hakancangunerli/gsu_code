package csc1302;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class PushCounterPanelMath extends JPanel{
	private int val;
	   private JButton increment, decrement;
	   private JLabel label;


	   public PushCounterPanelMath()
	   {
	      val = 50; // don't change this

		  increment = new JButton("Increment");
		  increment.addActionListener(new ButtonListener());
		  add(increment);
		  label = new JLabel("Value: " + val);
		  add(label);
		 
		  decrement = new JButton("Decrement");
		  add(decrement);
		  decrement.addActionListener(new ButtonListener());
		  
	      setBackground(Color.red);
	      setPreferredSize(new Dimension(300, 40));
	      
	      
	}
	   private class ButtonListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
	 		{
					String text = event.getActionCommand();
					if(text.equals("Increment")) {
						val += 1;
						label.setText("Number: "+ val);
					}else {
						val -= 1;
						label.setText("Number: "+ val);
					}
	 		}
		}
}
