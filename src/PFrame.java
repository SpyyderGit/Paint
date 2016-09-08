

import javax.swing.JFrame;

public class PFrame extends JFrame
{

	public PFrame()
	{
		setTitle("Paint");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(10, 10, 1000, 800);
		add(new PPanel());
		setVisible(true);
	}
	
	
	

}
