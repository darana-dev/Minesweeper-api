/**
 * 
 */
package com.deviget.api;

import java.util.Random;
import java.util.UUID;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

/**
 * @author daran
 *
 */
@RestController

public class Game {
	
	/* Properties for a new game */

	// game identifier
	private String game_id;
	
	// game parameters
	private int num_rows;
	private int num_columns;
	private int num_mines;
	private String[] concate;
	
	
	int totalcell = this.getNum_rows() * this.getNum_columns();
	int voidCell = totalcell - this.getNum_mines();
	int Mines = 2;//this.getNum_mines();
	
	
	@GetMapping(path = "/newgame/{rows}/{cols}/{mines}/{user}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String getItems(@PathVariable int rows,@PathVariable int cols,@PathVariable int mines, @PathVariable String user) {
		
		create(rows,cols,mines);

		int totalcell = this.getNum_rows() * this.getNum_columns();
		int voidCell = totalcell - this.getNum_mines();
		//int mines = this.getNum_mines();

		String[] mine_items = new String[mines];
		String[] void_items = new String[voidCell];

		for (int i = 0; i < mines; i++) {
			mine_items[i] = "MINE";

		}
		for (int i = 0; i < voidCell; i++) {
			void_items[i] = "VOID";
		}

		System.out.println("--MINES:");
		for (int i = 0; i < mine_items.length; i++) {
			System.out.print(mine_items[i] + " ");
		}
		System.out.println("\n--VOID_ITEMS:");
		for (int i = 0; i < void_items.length; i++) {
			System.out.print(void_items[i] + " ");
		}

		concate = new String[mines + voidCell];
		System.arraycopy(mine_items, 0, concate, 0, mines);
		System.arraycopy(void_items, 0, concate, mines, voidCell);

		System.out.println("\n--all_ITEMS:");
		for (int i = 0; i < concate.length; i++) {
			System.out.print(concate[i] + " ");
		}
		// System.out.println("Concatenated Array: " + Arrays.toString(concate));
		shuffle(concate);
		for (String number : concate) {
			System.out.println(number);
		}

		Gson gson = new Gson();

		// Convert numbers array into JSON string.
		String numbersJson = gson.toJson(concate);

		return numbersJson;
	}
	
	public static <T> void shuffle(T[] array) {
		Random random = new Random();
		int i = 0;
		for (int j : random.ints(array.length, 0, array.length).toArray()) {
			swap(array, i++, j);
		}
	}

	protected static <T> void swap(T[] array, int i, int j) {
		T temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	// Initialization properties for a new game
		public void create( int num_rows, int num_columns, int num_mines) {
			
			this.num_rows = num_rows;
			this.num_columns = num_columns;
			this.num_mines = num_mines;
			this.game_id = generateId();
			
			}
		
		// generate a unique identifier for every game
		public String generateId() {
			UUID uuid = UUID.randomUUID();
			return uuid.toString();
		}

		// getters and setters
		public String getGame_id() {
			return game_id;
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

}
