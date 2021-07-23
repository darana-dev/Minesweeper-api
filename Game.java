package com.deviget.api;

public class Game {

	//properties for a new game
	private int win_width;
	private int win_height;
	private int num_rows;
	private int num_columns;
	private int num_mines;

	//Initialization properties for a new game
	public void create(int win_width, int win_height, int num_rows, int num_columns, int num_mines) {
		this.win_width = win_width;
		this.win_height = win_height;
		this.num_rows = num_rows;
		this.num_columns = num_columns;
		this.num_mines = num_mines;

	}

}
