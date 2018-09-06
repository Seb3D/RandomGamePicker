package de.realseb3d.RandomGamePicker;

import java.util.Random;
import java.util.Scanner;

/* Dieses Programm gibt dem User ein zufälliges Spiel aus, welche der User vorher eingegeben hat.
 * @author Sebastian "Seb3D" Lein 
*/

public class Program {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Wie viele Spiele möchtest du eingeben?");
		
		int counter = input.nextInt();
		
		String[] games = new String[counter];
		
		System.out.println("Gebe alle Spiele ein, welche du spielen möchtest!");
		
		for(int x = 0; x < counter; x++) {
			
			games[x] = input.next();
			
		}
		
		Random r = new Random();

		System.out.println(games[r.nextInt(counter)]);
		
		input.close();
		
	}
	
}
