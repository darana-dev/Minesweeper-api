package com.deviget.api;


public class Render {
	
	private boolean gameOver;
	Game game;
	
	//new instance of a new game
	public Render() {
		  new Game();	
	}
	
	//characteristics for the game
	public void draw() {
	
		drawWindow();
		addItems();
		
	}
	
	//window properties
	public void drawWindow() {
		
		int size[] = {game.getWin_width(), game.getWin_height()};
		
	}
	
	//number of rows, columns and mines for the game
	public void addItems() {
		int items[] = {game.getNum_rows(), game.getNum_columns(), game.getNum_mines()};
	}

}
