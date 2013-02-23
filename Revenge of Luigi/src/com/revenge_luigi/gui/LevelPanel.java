package com.revenge_luigi.gui;

import java.awt.Graphics;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import javax.swing.JPanel;

import com.revenge_luigi.RevengeLuigi;
import com.revenge_luigi.beans.Tile;
import com.revenge_luigi.parsers.TileParser;

public class LevelPanel extends JPanel {
	Tile[] tiles;
	
	public LevelPanel( String resourceURL ) {
		URL url = RevengeLuigi.class.getResource( resourceURL );
		try {
			tiles = TileParser.readTiles(url);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		for (Tile tile : tiles) {
			g.drawImage(tile.getTileImage(), tile.getPosX(), tile.getPosY(), this);
		}
	}
	
}
