package com.revenge_luigi.beans;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Tile {
	private String tileId;
	private String imgPath;
	private Image tileImage;
	private int width;
	private int height;
	private int posX;
	private int posY;
	private int layer;
	
	public Tile(String tileId, String imgPath, int width, int height, int posX, int posY, int layer) {
		this.tileId = tileId;
		this.imgPath = imgPath;
		this.width = width;
		this.height = height;
		this.posX = posX;
		this.posY = posY;
		this.layer = layer;
		
		try {
			this.tileImage = ImageIO.read( new File(imgPath) );
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getTileId() {
		return tileId;
	}

	public void setTileId(String tileId) {
		this.tileId = tileId;
	}

	public String getImgPath() {
		return imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

	public Image getTileImage() {
		return tileImage;
	}

	public void setTileImage(Image tileImage) {
		this.tileImage = tileImage;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public int getLayer() {
		return layer;
	}

	public void setLayer(int layer) {
		this.layer = layer;
	}
	
	
	
}
