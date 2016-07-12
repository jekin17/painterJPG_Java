import java.awt.BasicStroke;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Iterator;

import javax.imageio.ImageTypeSpecifier;
import javax.swing.BorderFactory;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;

public class PPanel extends JPanel implements MouseListener, MouseMotionListener
{
	
	BufferedImage bi = new BufferedImage(800, 800, BufferedImage.TYPE_INT_RGB);
	int x;
	int y;
	PData pd;

	public PPanel(PCommand cmd)
	{
		setLayout(null);
		setBounds(110, 40, 750, 800);
		setBorder(BorderFactory.createLineBorder(Color.gray, 10));
		setComponentPopupMenu(new PContext(cmd));
		Graphics2D gg = (Graphics2D) bi.getGraphics();
		gg.setBackground(Color.white);
		gg.fillRect(0, 0, 800, 800);
		addMouseListener(this);
		addMouseMotionListener(this);
		this.pd = cmd.pd;
		cmd.pp = this;
	}
	
	@Override
	public void paint(Graphics g)
	{
		super.paint(g);
		Graphics2D gg = (Graphics2D) g;
		gg.drawImage(bi, 0, 0, null);
	}
	@Override
	public void mousePressed(MouseEvent e)
	{
		x = e.getX();
		y = e.getY();
	}

	@Override
	public void mouseDragged(MouseEvent e)
	{
		Graphics2D gg = (Graphics2D) bi.getGraphics();
		gg.setStroke(new BasicStroke(pd.width));
		gg.setColor(pd.color);
		gg.drawLine(x, y, e.getX(), e.getY());
		x = e.getX();
		y = e.getY();
		
		repaint();
	}

	@Override
	public void mouseClicked(MouseEvent e){}

	@Override
	public void mouseReleased(MouseEvent e){}

	@Override
	public void mouseEntered(MouseEvent e){}

	@Override
	public void mouseExited(MouseEvent e){}

	@Override
	public void mouseMoved(MouseEvent e){}

}
	

