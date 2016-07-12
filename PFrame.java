import java.awt.BorderLayout;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class PFrame extends JFrame 
{
	PPanel pPanel;
	PTabbedPane pTabb;
	public int index;

	public PFrame()
	{
		setLayout(null);
		setBounds(200, 10, 1000, 800);
		
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:/Users/Jeka/Desktop/Img/raster-app.png"));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Paint RASTER");
			
		PCommand cmd = new PCommand();
		
		PToolBar pToolBr = new PToolBar( cmd );
		pToolBr.setBounds(0, 0, 1000, 40);
		
		PButtonsPanel pBtnPan = new PButtonsPanel( cmd );
		pBtnPan.setBounds(0, 40, 100, 800);
		
		PTabbedPane pTabbPan = new PTabbedPane( cmd );
		pTabbPan.setBounds(100, 50, 800, 800);
		
		add( pBtnPan );
		add( pToolBr);
		add( pTabbPan);
		
		
		setJMenuBar(new PMenu( cmd ));
						
		setVisible(true);
		
	}

	
}




