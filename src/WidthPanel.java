
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class WidthPanel extends JPanel
{

	PaintData data = null;

	public WidthPanel(PaintData data)
	{
		this.data = data;
		setLayout(null);
		setBackground(Color.lightGray);

		JButton btn = new JButton("Check");
		btn.setBounds(5, 30, 90, 40);
		add(btn);

		JLabel lbl = new JLabel("set width");
		lbl.setBounds(20, 70, 90, 40);
		add(lbl);

		JTextArea txt = new JTextArea(5, 5);
		txt.setBounds(5, 100, 90, 20);
		txt.setText(data.width + "");
		add(txt);

		btn.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e)
			{
				int w = Integer.parseInt(txt.getText());
				data.width = w;
			}
		});
	}

}
