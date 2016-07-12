import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class PTabbedPane extends JPanel 
{
	ArrayList<PPanel> ppPan = new ArrayList<>();
	
	public PTabbedPane(PCommand cmd)
	{
		super(new GridLayout(1,1));
		
		JTabbedPane jtbp = new JTabbedPane();
				
		ppPan.add(new PPanel( cmd ));
		ppPan.add(new PPanel( cmd ));
		ppPan.add(new PPanel( cmd ));
				
		jtbp.setTabPlacement(JTabbedPane.TOP);
		jtbp.addTab("p1", ppPan.get(0));
		jtbp.addTab("p2", ppPan.get(1));
		jtbp.addTab("p3", ppPan.get(2));
		
		jtbp.addChangeListener(cmd.chTabb);
		add (jtbp);
		cmd.ppPan = this.ppPan;
	}
}
