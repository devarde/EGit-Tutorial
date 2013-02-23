package com.revenge_luigi;

import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import com.revenge_luigi.gui.MainScreen;

public class RevengeLuigi {
	
	public static void main(String[] args) {
		StartGameThread gameThread = new StartGameThread();
		
		for (String string : args) {
			if( string.equalsIgnoreCase( "FULL" ) ){
				gameThread.setFullscreen(true);
			}
		}
		
		SwingUtilities.invokeLater(gameThread);
	}
	
	private static class StartGameThread implements Runnable{
		private boolean fullscreen;
		
		@Override
		public void run() {
			
			MainScreen screen = new MainScreen();
			screen.setSize(800, 600);
			screen.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
			
			if( fullscreen ){
				JFrame.setDefaultLookAndFeelDecorated(false);
				GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().setFullScreenWindow(screen);
			}
			
			screen.setVisible(true);
		}
		
		public boolean isFullscreen() {
			return fullscreen;
		}

		public void setFullscreen(boolean fullscreen) {
			this.fullscreen = fullscreen;
		}
	}
	
}
