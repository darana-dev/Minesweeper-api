package com.deviget.api;

public class Cell {
	
	
	private int itemPos[] = new int[2]; //cell position
	private int value; //numeric value
	private boolean mine;//if a cell contain a mine
	private boolean flagged;//if a cell contain a flag
	
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public boolean isMine() {
		return mine;
	}
	public void setMine(boolean mine) {
		this.mine = mine;
	}
	public boolean isFlagged() {
		return flagged;
	}
	public void setFlagged(boolean flagged) {
		this.flagged = flagged;
	}
	public int[] getItemPos() {
		return itemPos;
	}
	public void setItemPos(int[] itemPos) {
		this.itemPos = itemPos;
	}
	
	
	
	

}
