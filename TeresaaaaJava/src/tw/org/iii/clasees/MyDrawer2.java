package tw.org.iii.clasees;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.LinkedList;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class MyDrawer2 extends JPanel{
	private LinkedList<LinkedList<HashMap<String, Integer>>> lines, garbag;
	
	public MyDrawer2() {
		lines = new LinkedList<>();
		garbag = new LinkedList<>();
		setBackground(Color.YELLOW);
		MyListener myListener = new MyListener();
		addMouseListener(myListener);
		addMouseMotionListener(myListener);
		
	}
	
	private class MyListener extends MouseAdapter{
		@Override
		public void mousePressed(MouseEvent e) {
			int x = e.getX(), y = e.getY();
			HashMap<String, Integer> point = new HashMap<>();
			point.put("x",x); point.put("y", y);
			
			LinkedList<HashMap<String, Integer>> line = new LinkedList<>();
			line.add(point);
			
			lines.add(line);
			
			garbag.clear();
//			repaint();
		}
//		@Override
//		public void mouseReleased(MouseEvent e) {
//			
//		}
		@Override
		public void mouseDragged(MouseEvent e) {
			int x = e.getX(), y = e.getY();
			HashMap<String, Integer> point = new HashMap<>();
			point.put("x",x); point.put("y", y);
			
			lines.getLast().add(point);
			
			repaint();
		}
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D)g;
		
		g2d.setColor(Color.blue);
		g2d.setStroke(new BasicStroke(4));
		
		for(LinkedList<HashMap<String, Integer>> line : lines) {
			for (int i=1; i<line.size();i++) {
				HashMap<String,Integer> p0 = line.get(i-1);
				HashMap<String,Integer> p1 = line.get(i);
				g2d.drawLine(p0.get("x"), p0.get("y"), p1.get("x"), p1.get("y"));
			}
		}
		
		
//		if(g instanceof DebugGraphics) {
//			System.out.println("111");
//		}else if (g instanceof Graphics2D) {
//			System.out.println("222");
//		}else {
//			System.out.println("333");
//		}
		
		
	}
	public void clear() {
		lines.clear();
		garbag.clear();
		repaint();
	}
	public void undo() {
		if(lines.size()>0) {
			garbag.add(lines.removeLast());
			repaint();
		}
	}
	public void redo() {
		if(garbag.size()>0) {
			lines.add(garbag.removeLast());
			repaint();
		
		}
	}
	public void saveJPEG() {
		BufferedImage img = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_RGB);
		Graphics g = img.createGraphics();
		paint(g);
		try {
			if(ImageIO.write(img,"jpg", new File("dir1/brad.jpg"))) {
				System.out.println("OK");
			}else {
				System.out.println("XX");
			}
			System.out.println("saveJPEG()2");
			
		}catch(IOException e) {
			System.out.println(e);
		}
	}
	public void saveLines() throws Exception{
		try(ObjectOutputStream oout =
				new ObjectOutputStream(new FileOutputStream("dir1/brad.sign"))){
			oout.writeObject(lines);
			oout.flush();
		}
	}
	public void loadLines() throws Exception{
		ObjectInputStream oin=
				new ObjectInputStream(new FileInputStream("dir1/brad.sign"));
		Object obj = oin.readObject();
		lines =(LinkedList<LinkedList<HashMap<String, Integer>>>)obj;
		oin.close();
		
		repaint();
	}
}

class Line{
	private LinkedList<HashMap<String, Integer>> points;
	private Color color;
	private float width;
	
	public Line(Color color, float width) {
		points = new LinkedList<>();
		this.color = color;
		this.width = width;
	}
	
	public void addPoint(int x, int y) {
		HashMap<String, Integer> point = new HashMap<>();
		point.put("x", x); point.put("y", y);
		points.add(point);
	}
	
	public int getPointX(int index) {
		return points.get(index).get("x");
	}
	public int getPointY(int index) {
		return points.get(index).get("y");
	}
	public int getSize() {return points.size();}
	public Color getColor() {
		return color;
	}
	public float getWidth() {
		return width;
	}
}
