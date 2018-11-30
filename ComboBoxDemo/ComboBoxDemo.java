import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ComboBoxDemo extends JFrame{
	//Declare an array of Strings for flag titles
	private String[] flagTitles = {"Canda","China",
		"Denmark","France","Germany","India","Norway",
		"United Kingdom","United States of America"};
		
	//Declare an ImageIcon array for the national flags of 9 countries
	private ImageIcon[] flagImage = {
		new ImageIcon("image/ca.gif"),
		new ImageIcon("image/china.gif"),
		new ImageIcon("image/denmark.gif"),
		new ImageIcon("image/fr.gif"),
		new ImageIcon("image/germany.gif"),
		new ImageIcon("image/india.gif"),
		new ImageIcon("image/norway.gif"),
		new ImageIcon("image/uk.gif"),
		new ImageIcon("image/us.gif"),};
		
		//Declare an array of strings for flag descriptions
		private String[] flagDescription = new String[9];
		
		//Declare and create a description panel
		private DescriptionPanel descriptionPanel = new DescriptionPanel();
		private JComboBox jcbo = new JComboBox(flagTitles);
		
		public ComboBoxDemo(){
			flagDescription[0] = "Description of Canda...";
			flagDescription[1] = "Description of China...";
			flagDescription[2] = "Description of Denmark...";
			flagDescription[3] = "Description of France...";
			flagDescription[4] = "Description of Germany...";
			flagDescription[5] = "Description of India...";
			flagDescription[6] = "Description of Norway...";
			flagDescription[7] = "Description of UK...";
			flagDescription[8] = "Description of US...";
			
			//set the first country for display
			setDisplay(0);
			
			add(jcbo,BorderLayout.NORTH);
			add(descriptionPanel,BorderLayout.CENTER);
			
			jcbo.addItemListener(new ItemListener(){
				public void itemStateChanged(ItemEvent e){
					setDisplay(jcbo.getSelectedIndex());	
				}	
			});
		}
		
		/** set display information on the description panel*/
		public void setDisplay(int index){
			descriptionPanel.setTitle(flagTitles[index]);
			descriptionPanel.setImageIcon(flagImage[index]);
			descriptionPanel.setDescription(flagDescription[index]);	
		}
		public static void main(String[] args){
			ComboBoxDemo frame = new ComboBoxDemo();
			frame.pack();
			frame.setTitle("ComboBoxDemo");
			frame.setLocationRelativeTo(null);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);	
		}
}