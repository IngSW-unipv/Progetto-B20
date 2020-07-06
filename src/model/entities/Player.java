package model.entities;

import java.util.ArrayList;

public class Player {
	
	//private boolean isAI;
	
	private String name;
	private COLOR color;
	private int tanks;
	private int bonusTanks;
	private int continents;
	private int territories;
	private Mission mission;
	private DiceShaker shaker;
	private ArrayList<Card> cards;
	
	/**
	 * Creates a new player
	 * @param name is the name of the player
	 * @param color is the color chosen by the player
	 */
	public Player(String name, COLOR color) {
		this.name = name;
		this.color = color;
		this.tanks = 0;
		this.bonusTanks = 0;
		continents = 0;
		shaker = new DiceShaker();
		cards = new ArrayList<Card>();
	}
	
	/**
	 * Gives a mission to the player
	 * @param mission is the mission given
	 */
	public void giveMission(Mission mission) {
		this.mission = mission;
	}
	
	/**
	 * Gives tanks to the player
	 * @param newTanks is the number of tanks added
	 */
	public void addTanks (int newTanks) {
		tanks += newTanks;
	}
	
	/**
	 * Removes tanks from the player
	 * @param lostTanks is the number of tanks lost
	 */
	public void removeTanks (int lostTanks) {
		tanks -= lostTanks;
	}
	
	/**
	 * Modifies the number of additional tanks the player receives
	 * @param n is the number of tanks added or subtracted
	 */
	public void giveBonusTanks(int n) {
		bonusTanks += n;
	}
	
	/**
	 * Returns the number of bonus tanks the player gets each turn
	 * @return bonusTanks
	 */
	public int getBonusTanks() {
		return bonusTanks;
	}
	
	/**
	 * Returns the name of the player
	 * @return name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Returns the color chosen by the player
	 * @return color
	 */
	public COLOR getColor() {
		return color;
	}

	/**
	 * Returns the number of tanks that the player has
	 * @return tanks
	 */
	public int getTanks() {
		return tanks;
	}

	/**
	 * Returns the number of continents owned by the player
	 * @return continents
	 */
	public int getContinents() {
		return continents;
	}

	/**
	 * Returns the number of territories owned by the player
	 * @return territories
	 */
	public int getTerritories() {
		return territories;
	}

	/**
	 * Adds a territory to the number of territories owned by the player
	 */
	public void addTerritory() {
		this.territories += 1;
	}

	/**
	 * Returns the description of the mission of the player
	 * @return mission.toString()
	 */
	public String getMissionDescription() {
		return mission.toString();
	}
	
	/**
	 * Returns the name of the color chosen by the player
	 * @return Color
	 */
	public String getColorName() {
		switch(this.color) {
		case GREEN:
			return "Verde";
		case YELLOW:
			return "Giallo";
		case RED:
			return "Rosso";
		case PINK:
			return "Rosa";
		case BLUE:
			return "Blu";
		case BLACK:
			return "Nero";
		}
		return null;	
	}
	
	public void placeTank(int n) {
		
		this.bonusTanks -= n;
		this.tanks +=n;
		
	}
	
	public void giveCard(Card c) {
		cards.add(c);
	}
	
	public boolean equals(Player p) {
		if(p.getName() == this.name)
			return true;
		else
			return false;
	}
	
	public int[] rollDices(int n) {
		return shaker.rollDices(n);
	}
}
