package gui.view;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import gui.controller.GUIAppController;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SpringLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class GUIPanel extends JPanel
{
	private GUIAppController appController;
	private JButton firstButton;
	private SpringLayout appLayout;
	public GUIPanel(GUIAppController appController)
	{
		super();
		this.appController = appController;
		firstButton = new JButton("Click on  the button");
		
		appLayout = new SpringLayout();
		
		setupPanel();
		setupLayout();
	}
	/**
	 * Used to add all the components to the screen and install a layout manager.
	 * Also set Color.
	 */
	private void setupPanel()
	{
		this.setBackground(Color.BLUE);
		this.setLayout(appLayout);
		this.add(firstButton);
		
	}
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.NORTH, firstButton, 97, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, firstButton, 80, SpringLayout.WEST, this);
	}
	private void setupListeners()
	{
		firstButton.addActionListener(new ActionListener()
			{
			public void actionPerformed(ActionEvent click)
				{
				
				}
			
			});
	}
	
	
	
	
}

