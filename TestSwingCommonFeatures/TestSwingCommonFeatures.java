import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JButton;
//import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JLabel;
//import javax.swing.*;
import javax.swing.border.*;
//import java.awt.*;

public class TestSwingCommonFeatures extends JFrame{
  public TestSwingCommonFeatures(){
    JPanel p1=new JPanel(new FlowLayout(FlowLayout.LEFT,2,2));
    JButton jbtLeft=new JButton("Left");
    JButton jbtCenter=new JButton("Center");
    JButton jbtRight=new JButton("Right");
    jbtLeft.setBackground(Color.WHITE);
    jbtCenter.setForeground(Color.GREEN);
    jbtRight.setToolTipText("This is the right button");
    p1.add(jbtLeft);
    p1.add(jbtCenter);
    p1.add(jbtRight);
    
    p1.setBorder(new TitledBorder("Three buttons"));
    
    Font largeFont=new Font("TimesRoman",Font.BOLD,20);
    Border lineBorder=new LineBorder(Color.BLACK,2);
    
    JPanel p2=new JPanel(new GridLayout(1,2,5,5));
    
    JLabel jlbRed=new JLabel("Red");
    JLabel jlbOrange=new JLabel("Orange");
    jlbRed.setForeground(Color.RED);
    jlbOrange.setForeground(Color.ORANGE);
    jlbRed.setFont(largeFont);
    jlbOrange.setFont(largeFont);
    jlbRed.setBorder(lineBorder);
    jlbOrange.setBorder(lineBorder);
    
    p2.add(jlbRed);
    p2.add(jlbOrange);
    
    p2.setBorder(new TitledBorder("Two Labels"));
    
    setLayout(new GridLayout(2,1,5,5));
    add(p1);
    add(p2);
  }
  
  public static void main(String[] args){
    JFrame frame=new TestSwingCommonFeatures();
    frame.setTitle("TestSwingCommonFeatures");
    frame.setSize(300,150);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}