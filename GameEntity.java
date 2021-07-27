package com.deviget.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "game")
public class GameEntity {
	
	
	    
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private long id;
	    private String user;
	    private int rows;
	    private int cols;
	    private int mines;
	    
	    
	    
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getUser() {
			return user;
		}
		public void setUser(String user) {
			this.user = user;
		}
		public int getRows() {
			return rows;
		}
		public void setRows(int rows) {
			this.rows = rows;
		}
		public int getCols() {
			return cols;
		}
		public void setCols(int cols) {
			this.cols = cols;
		}
		public int getMines() {
			return mines;
		}
		public void setMines(int mines) {
			this.mines = mines;
		}

	    // standard constructors / setters / getters / toString
	    
	}


