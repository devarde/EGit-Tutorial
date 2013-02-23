package com.revenge_luigi.parsers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import com.revenge_luigi.beans.Tile;

public class TileParser {
	
	public static Tile[] readTiles( URL url ) throws IOException, URISyntaxException{
		File file = new File(url.toURI());
		//BufferedReader reader = new BufferedReader( new FileReader(file) );
		
		List<Tile> tileList = new ArrayList<>();
		Scanner scanner = new Scanner(file);
		scanner.nextLine();
		int totalV = scanner.nextInt();
		int totalH = scanner.nextInt();
		int tileH = scanner.nextInt();
		int tileV = scanner.nextInt();
		
		int tileWidth = totalH / tileH;
		int tileHeight = totalV / tileV;
		
		scanner.nextLine();
		
		while( scanner.hasNext() ){
			int posX = scanner.nextInt();
			int posY = scanner.nextInt();
			int layer = scanner.nextInt();
			String tileId = scanner.next().trim();
			String filename = scanner.nextLine().trim();
			
			Tile tile = new Tile(tileId, filename, tileWidth, tileHeight, posX, posY, layer);
			tileList.add(tile);
		}
		
		Tile[] tileArray = new Tile[tileList.size()];
		tileList.toArray(tileArray);
		
		return tileArray;
	}
	
}
