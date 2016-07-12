import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

public class PContext extends JPopupMenu
{
	public PContext(PCommand cmd)
	{	
		JMenuItem miRed = new JMenuItem("Red");
		JMenuItem miGreen = new JMenuItem("Green");
		JMenuItem miBlue = new JMenuItem("Blue");
		miRed.setActionCommand("Color red");
		miGreen.setActionCommand("Color green");
		miBlue.setActionCommand("Color blue");
	
		JMenuItem miW1 = new JMenuItem("1px");
		JMenuItem miW5 = new JMenuItem("5px");
		JMenuItem miW10 = new JMenuItem("10px");
		miW1.setActionCommand("Width 1px");
		miW5.setActionCommand("Width 5px");
		miW10.setActionCommand("Width 10px");
				
		miRed.addActionListener(cmd.aColor);
		miGreen.addActionListener(cmd.aColor);
		miBlue.addActionListener(cmd.aColor);
		miW1.addActionListener(cmd.aWidth);
		miW5.addActionListener(cmd.aWidth);
		miW10.addActionListener(cmd.aWidth);	
		
		add(miRed);
		add(miGreen);
		add(miBlue);
		addSeparator();
		add(miW1);
		add(miW5);
		add(miW10);
	}
}
