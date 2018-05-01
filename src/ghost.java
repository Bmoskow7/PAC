import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;


public class ghost 
{
	//what is dis
	Color c;
	int x;
	int y;
	int windowW;
	int windowH;
	ArrayList<Point> path;
	int timer = 0;
	int threshold;
	public ghost(Color color, int xCoor, int yCoor, int w,  int h, int thresh)
	{
		c = color;
		x = xCoor;
		y = yCoor;
		windowW = w;
		windowH = h;
		path = new ArrayList<Point>();
		path.add(new Point(x, y));
		threshold = thresh;
	}
	
	
	public ArrayList<Point> getPath() {
		return path;
	}


	public void setPath(ArrayList<Point> path) {
		this.path = path;
	}

	
	public void defualt()
	{
		c = Color.BLACK;
		x = 17;
		y = 13;
		path = new ArrayList<Point>();
		path.add(new Point(x,y));
	}
	
	public void setColor(Color color)
	{
		c = color;
	}
	
	public Color getColor()
	{
		return c;
	}
	
	public void setX(int c)
	{
		x = c;
	}
	
	public int getX()
	{
		return x;
	}
	
	public void setY(int c)
	{
		y = c;
	}
	
	public int getY()
	{
		return y;
	}
	
	public void draw(Graphics g)
	{
		g.setColor(c);
		g.fillOval(x*windowW, y*windowH, windowW, windowH);
	}
	
	public void update()
	{
		if(!path.isEmpty())
		{
			path.remove(0);
			if(!path.isEmpty())
			{
				x = path.get(0).x;
				y = path.get(0).y;
			}
		}
		
		if(timer == threshold)
		{
			x = 20;
			y = 15;
		}
		timer++;
	}
}
