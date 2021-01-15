package csc1302;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class PushCounterPanel extends JPanel
{
   private int count;
   private JButton push;
   private JLabel label;

  // also given to us.
   public PushCounterPanel()
   {
      count = 0;

      push = new JButton("Push Me!");
      label = new JLabel();
      push.addActionListener(new ButtonListener());
      add(push);
      add(label);

      setBackground(Color.red);
      setPreferredSize(new Dimension(300, 40));
}
   private class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
 		{
        		label.setText("Number: "+ (int) (Math.random()*100 + 1));
 		}
	}

}
