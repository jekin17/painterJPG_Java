import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PButtonsPanel extends JPanel
{
	JButton btnW1 = null;
	JButton btnW5 = null;
	JButton btnW10 = null;
	JButton btnRed = null;
	JButton btnGreen = null;
	JButton btnBlue = null;
	
	
	public PButtonsPanel(PCommand cmd)
	{
		//setLayout(null);
		//setBounds(0, 20, 100, 800);
		
		ImageIcon iRed = new ImageIcon("C:/Users/Jeka/Desktop/Img/red-button.png");
		ImageIcon iGreen = new ImageIcon("C:/Users/Jeka/Desktop/Img/green-button.png");
		ImageIcon iBlue = new ImageIcon("C:/Users/Jeka/Desktop/Img/blue-button.png");

		btnW1 = new JButton("Width 1px");
		btnW1.setBounds(0, 50, 100, 30);
		btnW5 = new JButton("Width 5px");
		btnW5.setBounds(0, 90, 100, 30);
		btnW10 = new JButton("Width 10px");
		btnW10.setBounds(0, 140, 100, 30);
		btnRed = new JButton(iRed);
		btnRed.setBounds(0, 200, 100, 30);
		btnGreen = new JButton(iGreen);
		btnGreen.setBounds(0, 240, 100, 30);
		btnBlue = new JButton(iBlue);
		btnBlue.setBounds(0, 280, 100, 30);

		btnW1.addActionListener(cmd.aWidth);
		btnW5.addActionListener(cmd.aWidth);
		btnW10.addActionListener(cmd.aWidth);
		btnRed.addActionListener(cmd.aColor);
		btnGreen.addActionListener(cmd.aColor);
		btnBlue.addActionListener(cmd.aColor);

		btnRed.setActionCommand("Color red");
		btnGreen.setActionCommand("Color green");
		btnBlue.setActionCommand("Color blue");

		add(btnW1);
		add(btnW5);
		add(btnW10);
		add(btnRed);
		add(btnGreen);
		add(btnBlue);
	}
}
