import javax.swing.*;
   import java.awt.*;

    public class two extends JPanel {
       /**
		 * 
		 */
		private static final long serialVersionUID = 3L;

	public void paintComponent(Graphics g) {
         super.paintComponent(g);
         g.fillRect(10,10,100,50);
         g.drawRect(10,80,100,50);
      }
   }