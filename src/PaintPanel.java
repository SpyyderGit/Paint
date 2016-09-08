

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class PaintPanel extends JPanel implements MouseListener, MouseMotionListener
{
	PaintData data = null;
	
	int x = 0;
	int y = 0;
	BufferedImage bi = new BufferedImage(700, 700, BufferedImage.TYPE_4BYTE_ABGR);
	
	
	public PaintPanel(PaintData data)
	{
		this.data = data;
		Graphics2D gg = (Graphics2D) bi.getGraphics();
		gg.setBackground(java.awt.Color.ORANGE);
		gg.fillRect(0, 0, 700, 700);
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	@Override
	public void paint(Graphics g) 
	{
		g.drawImage(bi, 0, 0, null);
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
		gg.setStroke(new BasicStroke(data.width));
		gg.setColor(data.color);
		gg.drawLine(x, y, e.getX(), e.getY()); 
		x = e.getX();
		y = e.getY();
		repaint();
	}
	@Override
	public void mouseMoved(MouseEvent e) {}
	@Override
	public void mouseClicked(MouseEvent e) {}
	@Override
	public void mouseEntered(MouseEvent e) {}
	@Override
	public void mouseExited(MouseEvent e) {}
	@Override
	public void mouseReleased(MouseEvent e) {}
	
	public void openFile(String fileName) throws IOException
	{
		File f = new File(fileName);
		URL url = f.toURI().toURL();
		    bi = ImageIO.read(url);
		    this.repaint();
	}
	
}
