import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;
import javax.swing.filechooser.FileFilter;

public class PMenu extends JMenuBar
{
	public PMenu(PCommand cmd)
	{
		JMenu mFile = new JMenu("File");
		JMenuItem miOpen = new JMenuItem("Open");
		JMenuItem miSave = new JMenuItem("Save");
		
		JMenu mColor = new JMenu("Color");
		JMenuItem miRed = new JMenuItem("Red");
		JMenuItem miGreen = new JMenuItem("Green");
		JMenuItem miBlue = new JMenuItem("Blue");
		miRed.setActionCommand("Color red");
		miGreen.setActionCommand("Color green");
		miBlue.setActionCommand("Color blue");

		JMenu mWidht = new JMenu("Widht");
		JMenuItem miW1 = new JMenuItem("1px");
		JMenuItem miW5 = new JMenuItem("5px");
		JMenuItem miW10 = new JMenuItem("10px");
		miW1.setActionCommand("Width 1px");
		miW5.setActionCommand("Width 5px");
		miW10.setActionCommand("Width 10px");
				
		miOpen.addActionListener(cmd.aOpen);
		miSave.addActionListener(cmd.aSave);
		miRed.addActionListener(cmd.aColor);
		miGreen.addActionListener(cmd.aColor);
		miBlue.addActionListener(cmd.aColor);
		miW1.addActionListener(cmd.aWidth);
		miW5.addActionListener(cmd.aWidth);
		miW10.addActionListener(cmd.aWidth);
		
		add(mFile);
		add(mColor);
		add(mWidht);

		mFile.add(miOpen);
		mFile.add(miSave);
		
		mColor.add(miRed);
		mColor.add(miGreen);
		mColor.add(miBlue);
		
		mWidht.add(miW1);
		mWidht.add(miW5);
		mWidht.add(miW10);
	}
}
