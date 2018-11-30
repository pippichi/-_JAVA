import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class RadioButtonDemo extends CheckBoxDemo{
	private JRadioButton jrbRed,jrbBlue,jrbGreen;
	public RadioButtonDemo(){
		JPanel jpRadioButtons = new JPanel();
		jpRadioButtons.setLayout(new GridLayout(3,1));
		jpRadioButtons.add(jrbRed = new JRadioButton("Red"));
		jpRadioButtons.add(jrbBlue = new JRadioButton("Blue"));
		jpRadioButtons.add(jrbGreen = new JRadioButton("Green"));
		add(jpRadioButtons,BorderLayout.WEST);
		
		//create a radio-button group to group three buttons
		ButtonGroup group = new ButtonGroup();
		group.add(jrbRed);
		group.add(jrbBlue);
		group.add(jrbGreen);
		
		//Set keyboard mnemonics
		jrbRed.setMnemonic('E');
		jrbBlue.setMnemonic('U');
		jrbGreen.setMnemonic('G');
		
		jrbRed.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				messagePanel.setForeground(Color.red);
			}	
		});
		jrbBlue.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				messagePanel.setForeground(Color.blue);	
			}
		});
		jrbGreen.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				messagePanel.setForeground(Color.green);
			}
		});
		
		jrbBlue.setSelected(true);
		messagePanel.setForeground(Color.blue);
	}
	public static void main(String[] args){
			RadioButtonDemo frame = new RadioButtonDemo();
			frame.setTitle("RadioButtonDemo");
			frame.setSize(500,200);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setLocationRelativeTo(null);
			frame.setVisible(true);
	}	
}