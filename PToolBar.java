import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;

public class PToolBar extends JToolBar
{
	JButton btnW1 = null;
	JButton btnW5 = null;
	JButton btnW10 = null;
	JButton btnRed = null;
	JButton btnGreen = null;
	JButton btnBlue = null;
	
	public PToolBar(PCommand cmd)
	{
		//setBounds(0, 0, 1000, 40);
		
		ImageIcon iRed = new ImageIcon("C:/Users/Jeka/Desktop/Img/red-button.png");
		ImageIcon iGreen = new ImageIcon("C:/Users/Jeka/Desktop/Img/green-button.png");
		ImageIcon iBlue = new ImageIcon("C:/Users/Jeka/Desktop/Img/blue-button.png");

		btnW1 = new JButton("Width 1px");
		btnW5 = new JButton("Width 5px");
		btnW10 = new JButton("Width 10px");
		btnRed = new JButton(iRed);
		btnGreen = new JButton(iGreen);
		btnBlue = new JButton(iBlue);

		btnW1.addActionListener(cmd.aWidth);
		btnW5.addActionListener(cmd.aWidth);
		btnW10.addActionListener(cmd.aWidth);
		btnRed.addActionListener(cmd.aColor);
		btnGreen.addActionListener(cmd.aColor);
		btnBlue.addActionListener(cmd.aColor);

		btnRed.setActionCommand("Color red");
		btnGreen.setActionCommand("Color green");
		btnBlue.setActionCommand("Color blue");
		
		addSeparator();
		addSeparator();
		addSeparator();
		addSeparator();
		add(btnW1);
		add(btnW5);
		add(btnW10);
		addSeparator();
		addSeparator();
		add(btnRed);
		add(btnGreen);
		add(btnBlue);
	}
}
