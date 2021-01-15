package csc1302;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class PushCounterPanelSorter extends JPanel implements ActionListener{
	private JLabel label;
	private JButton button;
	private JTextField sorter_one, sorter_two, sorter_three, sorter_four, sorter_five;
	public PushCounterPanelSorter() {
		
		button = new JButton("sort");
		sorter_one = new JTextField(10);
		sorter_two = new JTextField(10);
		sorter_three = new JTextField(10);
		sorter_four = new JTextField(10);
		sorter_five = new JTextField(10); // ten digits is good.
		label = new JLabel("");
		add(sorter_one);
		add(sorter_two);
		add(sorter_three);
		add(sorter_four);
		add(sorter_five);
		add(button);
		add(label);
		setBackground(Color.red);
		setPreferredSize(new Dimension(400, 300));
		button.addActionListener(this);
	}
		public void actionPerformed(ActionEvent event)
 		{
			int sorted_num_one = Integer.parseInt(sorter_one.getText());
			int sorted_num_two = Integer.parseInt(sorter_two.getText());
			int sorted_num_three = Integer.parseInt(sorter_three.getText());
			int sorted_num_four = Integer.parseInt(sorter_four.getText());
			int sorted_num_five = Integer.parseInt(sorter_five.getText());
			int[] arr = {sorted_num_one,sorted_num_two,sorted_num_three,sorted_num_four,sorted_num_five};
			int temp;
			for(int a = 0; a < arr.length-1; a++) {
				for(int b = 0; b < arr.length-1; b++) {
					if(arr[b] > arr[b+1]) {
						temp = arr[b];
						arr[b] = arr[b+1];
						arr[b+1] = temp;
					}
				}
			label.setText("A sorted array: " + Arrays.toString(arr));
			
	}
}
}
