package model.util;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.imageio.ImageIO;

import model.entities.Territory;

public class ImageAssets {

	
	
	
	
	public static HashMap<Territory, ArrayList<Pixel>> imageProcess(BufferedImage image, ArrayList<Territory> list) {
	    int w = image.getWidth();
	    int h = image.getHeight();
	    Pixel pixel;
	    Color tempColor;
	    ArrayList<Pixel> pixelList = new ArrayList<Pixel>();
	    //System.out.println("Width, Height: " + w + ", " + h);
	    
	    HashMap<Territory, ArrayList<Pixel>> map = new HashMap<Territory, ArrayList<Pixel>>();
		for(Territory t : list) {
			map.put(t, new ArrayList<Pixel>());
		}
	    
	    
	    for (int i = 0; i < w; i++) {
	        for (int j = 0; j < h; j++) {
	        	
	        	tempColor = new Color(image.getRGB(i,j));
	        	pixel = new Pixel(i, j, tempColor);
	            
	        	if(!tempColor.equals(Color.BLACK) && !tempColor.equals(Color.WHITE)) {

	        	}
	        	
	        	
	            
	        }
	    }
	    
	    //System.out.println("Il y a " + list.size() + " colori diversi.");
	    return map;
	  }
	
	
	
}