import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;

public class ColorPanel extends JPanel
{

	public static PaintData data = null;

	public ColorPanel(PaintData data)
	{
		this.data = data;
		setLayout(null);
		setBackground(Color.lightGray);

		ColorHandler ch = new ColorHandler();

		ImageIcon icon = new ImageIcon("D:\\GoogleShared\\shared\\mcpphw\\src\\Paint\\img\\color.png");

		
		JLabel lbl = new JLabel("More colors");
		lbl.setBounds(25, 215, 90, 84);
		add(lbl);
		JButton btn = new JButton(icon);
		btn.setBounds(20, 270, 84, 84);
		btn.setBackground(Color.LIGHT_GRAY);
		btn.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
		add(btn);

		JButton btnRed = new JButton();
		btnRed.setBounds(20, 10, 40, 40);
		btnRed.setBackground(Color.red);
		btnRed.setBorder(BorderFactory.createLoweredBevelBorder());
		btnRed.setActionCommand("red");
		btnRed.addActionListener(ch);
		add(btnRed);

		JButton btnBlack = new JButton();
		btnBlack.setBounds(65, 10, 40, 40);
		btnBlack.setBackground(Color.black);
		btnBlack.setBorder(BorderFactory.createLoweredBevelBorder());
		btnBlack.setActionCommand("black");
		btnBlack.addActionListener(ch);
		add(btnBlack);

		JButton btnBlue = new JButton();
		btnBlue.setBounds(20, 60, 40, 40);
		btnBlue.setBackground(Color.blue);
		btnBlue.setBorder(BorderFactory.createLoweredBevelBorder());
		btnBlue.setActionCommand("blue");
		btnBlue.addActionListener(ch);
		add(btnBlue);

		JButton btnOr = new JButton();
		btnOr.setBounds(65, 60, 40, 40);
		btnOr.setBackground(Color.ORANGE);
		btnOr.setBorder(BorderFactory.createLoweredBevelBorder());
		btnOr.setActionCommand("orange");
		btnOr.addActionListener(ch);
		add(btnOr);

		JButton btnGreen = new JButton();
		btnGreen.setBounds(20, 110, 40, 40);
		btnGreen.setBackground(Color.GREEN);
		btnGreen.setBorder(BorderFactory.createLoweredBevelBorder());
		btnGreen.setActionCommand("green");
		btnGreen.addActionListener(ch);
		add(btnGreen);

		JButton btnYellow = new JButton();
		btnYellow.setBounds(65, 110, 40, 40);
		btnYellow.setBackground(Color.yellow);
		btnYellow.setBorder(BorderFactory.createLoweredBevelBorder());
		btnYellow.setActionCommand("yellow");
		btnYellow.addActionListener(ch);
		add(btnYellow);

		JButton btnCyan = new JButton();
		btnCyan.setBounds(20, 160, 40, 40);
		btnCyan.setBackground(Color.cyan);
		btnCyan.setBorder(BorderFactory.createLoweredBevelBorder());
		btnCyan.setActionCommand("cyan");
		btnCyan.addActionListener(ch);
		add(btnCyan);

		JButton btnMag = new JButton();
		btnMag.setBounds(65, 160, 40, 40);
		btnMag.setBackground(Color.MAGENTA);
		btnMag.setBorder(BorderFactory.createLoweredBevelBorder());
		btnMag.setActionCommand("magenta");
		btnMag.addActionListener(ch);
		add(btnMag);

		btn.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				data.color = JColorChooser.showDialog(null, "Color", Color.black);
			}
		});
	}
}

class ColorHandler implements ActionListener
{

	@Override
	public void actionPerformed(ActionEvent e)
	{
		String getCmd = e.getActionCommand();

		switch (getCmd) {
		case "black":
			ColorPanel.data.setColor(Color.black);
			break;
		case "red":
			ColorPanel.data.setColor(Color.red);
			break;
		case "green":
			ColorPanel.data.setColor(Color.green);
			break;
		case "yellow":
			ColorPanel.data.setColor(Color.yellow);
			break;

		case "blue":
			ColorPanel.data.setColor(Color.blue);
			break;
		case "orange":
			ColorPanel.data.setColor(Color.orange);
			break;

		case "cyan":
			ColorPanel.data.setColor(Color.cyan);
			break;
		case "magenta":
			ColorPanel.data.setColor(Color.magenta);
			break;
		}
	}

}
