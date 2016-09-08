
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;



public class PCommand extends JPanel
{

	PCommand pc = null;
	PaintPanel pp = null;

	public PCommand(PaintPanel pp)
	{
		this.pp = pp;

		JFileChooser choose = new JFileChooser();
		setLayout(null);
		setBackground(Color.white);

		JMenuBar jmb = new JMenuBar();
		jmb.setBounds(0, 0, 1000, 30);
		JMenu jmFile = new JMenu("File");
		ImageIcon icon = new ImageIcon("D:\\GoogleShared\\shared\\mcpphw\\src\\Paint\\img\\save.png");
		ImageIcon iconOpen = new ImageIcon("D:\\GoogleShared\\shared\\mcpphw\\src\\Paint\\img\\open.png");
		ImageIcon iconExit = new ImageIcon("D:\\GoogleShared\\shared\\mcpphw\\src\\Paint\\img\\exit.png");
		ImageIcon iconAbout = new ImageIcon("D:\\GoogleShared\\shared\\mcpphw\\src\\Paint\\img\\about.png");
		
		JMenuItem itmOpen = new JMenuItem("Open", iconOpen);
		JMenuItem itmSave = new JMenuItem("Save", icon);
		JMenuItem itmExit = new JMenuItem("Exit",iconExit);

		jmFile.add(itmSave);
		jmFile.add(itmOpen);
		jmFile.add(itmExit);

		JMenu help = new JMenu("Help");
		JMenuItem ab = new JMenuItem("About",iconAbout);
		help.add(ab);
		jmb.add(jmFile);
		jmb.add(help);
		add(jmb);

		itmSave.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e)
			{
				choose.showSaveDialog(null);
				try
				{
					ImageIO.write(pp.bi, "png", new File(choose.getSelectedFile().getAbsolutePath() + ".png"));
				}
				catch (IOException e1)
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

		itmOpen.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				File file;
				choose.showOpenDialog(null);
				file = choose.getSelectedFile();

				try
				{
					pp.bi = ImageIO.read(file);
					Graphics2D gg = (Graphics2D) pp.bi.getGraphics();
					pp.repaint();
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		});

		itmExit.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				System.exit(0);
			}
		});

		ab.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				JOptionPane.showMessageDialog(null, "Рисовалка V_1 \nDevelop by Kovalenko Oleg");
			}
		});

	}
}
