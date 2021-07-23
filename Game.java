package com.deviget.api;

import java.util.UUID;

public class Game {

	//properties for a new game
	private String game_id;
	
	private int win_width;
	private int win_height;
	private int num_rows;
	private int num_columns;
	private int num_mines;
	
	

	public String getGame_id() {
		return game_id;
	}

	public int getWin_width() {
		return win_width;
	}

	public int getWin_height() {
		return win_height;
	}

	public int getNum_rows() {
		return num_rows;
	}

	public int getNum_columns() {
		return num_columns;
	}

	public int getNum_mines() {
		return num_mines;
	}

	//Initialization properties for a new game
	public void create(int win_width, int win_height, int num_rows, int num_columns, int num_mines) {
		this.win_width = win_width;
		this.win_height = win_height;
		this.num_rows = num_rows;
		this.num_columns = num_columns;
		this.num_mines = num_mines;
		this.game_id=generateId();

	}
	
	public String generateId(){
	    UUID uuid = UUID.randomUUID();
	    return uuid.toString();
	}

}
