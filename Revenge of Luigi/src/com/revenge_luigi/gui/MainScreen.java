package com.revenge_luigi.gui;
import java.awt.Graphics;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainScreen extends JFrame {
	private static final long serialVersionUID = 2323072560021842638L;
	private JPanel currentPanel;
	public static ResourceBundle bundle;
	
	public MainScreen() {
		Locale locale = new Locale( "en", "US" );
		MainScreen.bundle = ResourceBundle.getBundle( "Messages", locale );
		
		MainScreenPanel titlePanel = new MainScreenPanel();
		setCurrentPanel(titlePanel);
	}
	
	public JPanel getCurrentPanel() {
		return currentPanel;
	}
	
	@Override
	public void paint(Graphics arg0) {
		// TODO Auto-generated method stub
		super.paint(arg0);
		currentPanel.update(arg0);
	}

	public void setCurrentPanel(JPanel currentPanel) {
		if( this.currentPanel != null ){
			remove(this.currentPanel);
		}
		
		this.currentPanel = currentPanel;
		
		add(currentPanel);
		repaint();
	}
}
