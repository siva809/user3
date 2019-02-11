
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
 
public class App extends Applet{
 
	public void paint(Graphics g){
		
		//set color to red
		setForeground(Color.red);
		
		/*
		 * to draw an arc in an applet window use,
		 * void drawArc(int x1,int y1, int width, int height,int startAngle, int arcAngle)
		 * method.
		 * 
		 * This method draws an arc of specified width and
		 * height at (x1,y1)
		 */
		
		//this will draw an arc of width 50 & height 100 at (10,10)
		g.drawArc(10,10,50,100,10,45);
		
		
		/*
		 * To draw a filled arc use
		 * fillArc(int x1,int y1, int width, int height,int startAngle, int arcAngle)
		 * method of Graphics class.
		 */
		
		//draw filled arc
		g.fillArc(100,10,100,100,0,90);
		
	}
}
