import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.GridLayout;
public class TestImageIcon extends JFrame{
  private ImageIcon usIcon=new ImageIcon("image/us.gif");
  private ImageIcon chinaIcon=new ImageIcon("image/china.gif");
  private ImageIcon frIcon=new ImageIcon("image/fr.gif");
  private ImageIcon ukIcon=new ImageIcon("image/uk.gif");
  
  public TestImageIcon(){
    setLayout(new GridLayout(1,4,5,5));
    add(new JLabel(usIcon));
    add(new JLabel(chinaIcon));
    add(new JButton(frIcon));
    add(new JButton(ukIcon));
  }
  public static void main(String[] args){
    TestImageIcon frame=new TestImageIcon();
    frame.setTitle("测试图标的使用");
    frame.setSize(800,600);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}

