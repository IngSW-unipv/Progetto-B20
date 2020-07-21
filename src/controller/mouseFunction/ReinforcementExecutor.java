package controller.mouseFunction;

import controller.GameSceneController;
import model.entities.Territory;
import model.util.Pixel;

public class ReinforcementExecutor implements FunctionExecutor{

	@Override
	public void executeClick(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void executeMove(int x, int y) {
		int check = 0;
		for(Territory t : GameSceneController.getInstance().getTerritories()) {
			check = 0;
			for(Pixel p : GameSceneController.getInstance().getPixelMap(t)) {
				
				if((p.getX() == x) && (p.getY() == y)) {
					check = 1;
					GameSceneController.getInstance().setTerritoryLabel(100, t);
					if(GameSceneController.getInstance().getCurrentPlayer().equals(t.getOwner())) {
						GameSceneController.getInstance().changeColor(GameSceneController.getInstance().getPixelMap(t));
						GameSceneController.getInstance().setSelTerritory(t);
					}
					break;
				} else {
					GameSceneController.getInstance().resetImage();
					GameSceneController.getInstance().setTerritoryLabel(0, t);
					GameSceneController.getInstance().setSelTerritory(null);
				}
					
			}
			if(check == 1) {
				break;
			}
		}
		
	}

}
