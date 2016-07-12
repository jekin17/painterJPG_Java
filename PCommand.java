import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class PCommand 
{
	PData pd = new PData();
	
	ActionFileOpen 	aOpen =  new ActionFileOpen();
	ActionFileSave 	aSave =  new ActionFileSave();
	ActionColor 	aColor = new ActionColor();
	ActionWidht 	aWidth = new ActionWidht();
	ChangeTabb	chTabb = new ChangeTabb();

	public PPanel pp;
	public ArrayList<PPanel> ppPan;
	int selectedIndex = 0;
	
	class ChangeTabb implements ChangeListener
	{

		@Override
		public void stateChanged(ChangeEvent e)
		{
			JTabbedPane pane = (JTabbedPane) e.getSource();
	        selectedIndex = pane.getSelectedIndex();
		}
	}
	
	class ActionFileOpen implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			JFileChooser fc = new JFileChooser();
			fc.showOpenDialog(null);
			String str = fc.getSelectedFile().getName();
			try
			{
				ppPan.get(selectedIndex).bi =  ImageIO.read(fc.getSelectedFile());
				//pp.bi = ImageIO.read(fc.getSelectedFile());
			}
			catch (IOException e1)
			{
				e1.printStackTrace();
			}
			ppPan.get(selectedIndex).repaint();
			System.out.println(str);
		}
	}

	class ActionFileSave implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			JFileChooser fc = new JFileChooser();
			fc.addChoosableFileFilter(new FileTypeFilter("jpg", "Image type"));
			fc.showSaveDialog(null);
			File fSave = fc.getSelectedFile();
			try
			{
				
				ImageIO.write(ppPan.get(selectedIndex).bi, "jpg", fSave);
			}
			catch (IOException e1)
			{
				e1.printStackTrace();
			}
		}

	}
	class ActionColor implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			String str = e.getActionCommand();
			JOptionPane.showMessageDialog(null, str);
			switch(str)
			{
			case "Color red": pd.color = Color.red; break;
			case "Color green": pd.color = Color.green; break;
			case "Color blue": pd.color = Color.blue; break;
			}
		}
	}
	class ActionWidht implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			String str = e.getActionCommand();
			JOptionPane.showMessageDialog(null, str);
			switch(str)
			{
			case "Width 1px": pd.width = 1; break;
			case "Width 5px": pd.width = 5; break;
			case "Width 10px": pd.width = 10; break;
			}
		}
	}
}

