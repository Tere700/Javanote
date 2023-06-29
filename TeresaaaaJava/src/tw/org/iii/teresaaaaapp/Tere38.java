package tw.org.iii.teresaaaaapp;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class Tere38 extends JFrame implements MouseListener{

	private JTextField mesg, mesg2;	
	public Tere38() {
		
			setLayout(new BorderLayout());
			mesg = new JTextField();
			add(mesg,BorderLayout.NORTH);
			
			mesg2 = new JTextField();
			add(mesg2,BorderLayout.SOUTH);
		
			addMouseListener(new MyMouseListner(this));
			addMouseListener(this);
			addMouseListener(new MyMouseListenerV3());
			addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					
				}
			});
			
			setSize(800,600);
			setVisible(true);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			
		}
	
	public void setMesgText(String mesgText) {
		mesg.setText(mesgText);
	}
	
	public static void main(String[] args) {
		new Tere38();
		
	}

	class MyMouseListenerV3 extends MouseAdapter{
		@Override
		public void mousePressed(MouseEvent e) {
			mesg.setText(e.getX() + "," + e.getY());
			
		}
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("Pressed2:" + e.getX() + "," + e.getY());
		mesg2.setText(e.getX() + "," + e.getY());
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
class MyMouseListner implements MouseListener{
	private Tere38 tere38;
	public MyMouseListner(Tere38 T38) {
		tere38 = T38;
	}
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		//System.out.println("Clicked");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("Pressed1:" + e.getX() + "," + e.getY());
		tere38.setMesgText( e.getX() + "," + e.getY());
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		//System.out.println("Released");
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
	}

}

class MyListener2 extends MouseAdapter{

	@Override
	public void mousePressed(MouseEvent e) {
		
	}
	
}




