package com.revenge_luigi.gui;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.revenge_luigi.RevengeLuigi;
import com.revenge_luigi.utils.Utils;

public class MainScreenPanel extends JPanel {
Image titleImage;
	
	public MainScreenPanel() {
		setLayout(null);
		
		JLabel testeLabel = new JLabel(MainScreen.bundle.getString("new_game"));
		testeLabel.setFont( testeLabel.getFont().deriveFont(40.0f) );
		testeLabel.addMouseListener( new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				super.mousePressed(e);
				MainScreen mainScreen = (MainScreen) Utils.getAncestor(MainScreenPanel.this, MainScreen.class);
				LevelPanel levelPanel = new LevelPanel("tile_maps/teste");
				mainScreen.setCurrentPanel(levelPanel);
			}
		});
		testeLabel.setBounds(new Rectangle(10, 400, 400, 200));
		add(testeLabel);
		
		JLabel opcoesLabel = new JLabel(MainScreen.bundle.getString("options"));
		opcoesLabel.setFont( opcoesLabel.getFont().deriveFont(40.0f) );
		opcoesLabel.addMouseListener( new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				super.mousePressed(e);
				
				JLabel another = new JLabel("Another");
				another.setBounds(new Rectangle(10,10,100,10));
				MainScreenPanel.this.add(another);
				
				MainScreenPanel.this.repaint();
			}
		});
		opcoesLabel.setBounds(new Rectangle(600, 400, 400, 200));
		add(opcoesLabel);
		
		try {
			titleImage = ImageIO.read( RevengeLuigi.class.getResource( "images/logo.png" ) );
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(-1);
		}
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		
		g.drawImage(titleImage, 100, 100, 600, 200, this);
	}
}
