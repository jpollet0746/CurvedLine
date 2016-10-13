import java.awt.*;
import java.applet.*;


public class AssignmentCurve extends Applet
{
	public void paint(Graphics g)
	{
		int width = 980;
		int height = 630;
		int x1 = 10;
		int y1 = 640;
		int x2 = 990;
		int y2 = 640;
		g.drawRect(10,10,width,height);	
		g.drawRect(205, 205, 590, 240);
		for (x1 = 10; x1 < 990; x1 += 14){
		
			g.drawLine(x1 ,  y1,  x2,  y2);;
			y2 -= 9;
				
		}
		x1 = 990;
		y1 = 640;
		x2 = 10;
		y2 = 640;
		
		for (x1 = 990; x1 > 10; x1 -= 14){
			
			g.drawLine(x1 ,  y1,  x2,  y2);;
			y2 -= 9;
		}
		x1 = 10;
		y1 = 10;
		x2 = 10;
		y2 = 640;
		
		for (x1 = 10; x1 < 990; x1 += 14){
			
			g.drawLine(x1 ,  y1,  x2,  y2);;
			y2 -= 9;
		}
		x1 = 10;
		y1 = 10;
		x2 = 990;
		y2 = 10;
		
		for (x1 = 10; x1 < 990; x1 += 14){
			
			g.drawLine(x1 ,  y1,  x2,  y2);;
			y2 += 9;
		}
		x1 = 205;
		y1 = 445;
		x2 = 205;
		y2 = 205;
			
		for (x1 = 205; x1 < 590; x1 += 14){
				
				g.drawLine(x1 ,  y1,  x2,  y2);;
				y2 += 9;

		}
	}
}

