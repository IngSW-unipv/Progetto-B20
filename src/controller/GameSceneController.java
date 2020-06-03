package controller;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.imageio.ImageIO;

import javafx.embed.swing.SwingFXUtils;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import model.entities.COLOR;
import model.entities.Player;
import model.entities.PlayersList;
import model.entities.RisikoGame;
import model.entities.Territory;
import model.util.FileHandler;
import model.util.ImageAssets;
import model.util.Pixel;

public class GameSceneController {
	
	@FXML
	ImageView map;
	
	RisikoGame game; 
	HashMap<Territory, ArrayList<Pixel>> mappa;
	
	public void initialize() throws NumberFormatException, IOException{
		game = new RisikoGame(PlayersList.getPlayers());
		File img = new File("src/view/fxmls/images/Territory_Color2.png");
		BufferedImage image = ImageIO.read(img ); 
		
		mappa = ImageAssets.imageProcess(image, game.getTerritories());
		
	}
	
	public void mapClicked(MouseEvent e) {
		int x =  (int)e.getX();
		int y =  (int)e.getY();
		
		for(Territory t : game.getTerritories()) {
			
			for(Pixel p : mappa.get(t)) {
				
				if((p.getX() == x) && (p.getY() == y)) {
					System.out.println(t.toString());
				}
				
			}
			
			
		}
		
		
		
		
	}
	
	
}
