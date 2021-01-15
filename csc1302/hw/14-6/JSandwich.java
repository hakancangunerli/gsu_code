// i did this in vscode so it might look like i just copied and pasted it.
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JSandwich extends JFrame implements ItemListener {
    FlowLayout flow = new FlowLayout();
    JLabel companyName = new JLabel("Sublime Sandwich");
    JComboBox<String> mainBox = new JComboBox<String>();
    JLabel mainList = new JLabel("Main ingredient");
    JComboBox<String> breadBox = new JComboBox<String>();
    JLabel breadList = new JLabel("Breads");
    JTextField totPrice = new JTextField(10);
    int mainNum, breadNum;
    double[] mainPrices = {6.99, 7.99, 8.99};
    double sumPrice = mainPrices[0];
    double breadPrice = 0;
    double mainPrice = mainPrices[0];
    double[] breadPrices = {0, 0, 0};
    String output;
    public JSandwich()
    {
       super("Sublime Sandwich Shop");
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
       setLayout(flow);
       add(companyName);
       companyName.setFont(new Font("Helvetica", Font.BOLD, 24));
       // meat options
       mainBox.addItem("Chicken");
       mainBox.addItem("Beef");
       mainBox.addItem("Tuna");
       // bread options
       breadBox.addItem("White");
       breadBox.addItem("Rye");
       breadBox.addItem("Whole Wheat");

       add(mainList);
       add(mainBox);
       mainBox.addItemListener(this);
       add(breadList);
       add(breadBox);
       breadBox.addItemListener(this);
       output = "Total Price $" + sumPrice;
       totPrice.setText(output);
       add(totPrice);
    }
    public static void main(String[] arguments)
    {
       JSandwich sandframe = new JSandwich();
       sandframe.setSize(240,200);
       sandframe.setVisible(true);
    }
 
    @Override
    public void itemStateChanged(ItemEvent list)
    {
        Object source = list.getSource();
        if (source == mainBox)
        {
           mainNum = mainBox.getSelectedIndex();
           mainPrice = mainPrices[mainNum];
           sumPrice = mainPrice + breadPrice;
           output = "Total Price $" + sumPrice;
           totPrice.setText(output);
        }
        else if (source == breadBox)
        {
           breadNum = breadBox.getSelectedIndex();
           breadPrice = breadPrices[breadNum];
           sumPrice = mainPrice + breadPrice;
           output = "Total Price $" + sumPrice;
           totPrice.setText(output);
        }
    }
 }
