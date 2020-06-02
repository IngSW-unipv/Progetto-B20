package model.util;

import java.awt.Color;

public class Pixel {
    
    private int x;
    private int y;
    private Color color;
          
    public Pixel (int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

	public Color getColor() {
		return color;
	}
    
}