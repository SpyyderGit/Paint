
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;


public class PPanel extends JPanel

{
	public PPanel()
	{
		PaintData data = new PaintData();
		setLayout(null);
		ColorPanel cp = new ColorPanel(data);
		PaintPanel pp = new PaintPanel(data);
		WidthPanel wp = new WidthPanel(data);
		PCommand sl = new PCommand(pp);

		cp.setBounds(830, 70, 130, 400);
		cp.setBorder(BorderFactory.createLoweredBevelBorder());
		pp.setBounds(120, 50, 700, 700);
		pp.setBorder(BorderFactory.createLoweredBevelBorder());
		wp.setBounds(10, 70, 100, 150);
		wp.setBorder(BorderFactory.createLoweredBevelBorder());
		sl.setBounds(0, 0, 1000, 25);
		add(cp);
		add(pp);
		add(wp);
		add(sl);
	}
}
