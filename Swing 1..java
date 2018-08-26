import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class one extends JPanel
{
   public static void main(String[] a) 
   {
      JFrame f = new JFrame();
      f.setSize(200, 400);
      f.add(new one());
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setVisible(true);
   }
   public void paint(Graphics g)
   {

	      g.setColor (new Color(128,0,128)); 
	   g.fillRect (100,100,300,300);

   }
}