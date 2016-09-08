
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JPanel;

public class SaveLoad extends JPanel
{
	public SaveLoad()
	{
		setLayout(null);
		setBackground(Color.orange);

		JButton save = new JButton("Save");
		save.setBounds(5, 30, 90, 40);
		add(save);

		JButton load = new JButton("Load");
		load.setBounds(5, 80, 90, 40);
		add(load);

		save.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e)
			{
				JFileChooser fileopen = new JFileChooser();
				int ret = fileopen.showDialog(null, "Открыть файл");
				if (ret == JFileChooser.APPROVE_OPTION)
				{
					File file = fileopen.getSelectedFile();

				}

			}
		});

		load.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				JFileChooser fileopen = new JFileChooser();
				int ret = fileopen.showDialog(null, "Открыть файл");
				if (ret == JFileChooser.APPROVE_OPTION)
				{
					File file = fileopen.getSelectedFile();

				}
			}
		});

	}
}
