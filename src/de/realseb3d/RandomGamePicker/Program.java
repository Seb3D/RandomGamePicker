package de.realseb3d.RandomGamePicker;

import java.util.Random;

/* Dieses Programm gibt dem User ein zufaelliges Spiel aus, welche der User vorher eingegeben hat.
 * @author Sebastian "Seb3D" Lein 
*/

public class Program {

	public static void main(String[] args) {
		
		try{
			GameReader gr = new GameReader();
			
			String[] gameNames = gr.readGames();
			
			int counter = gameNames.length;
			
			System.out.print("Dein Game ist: ");
			
			Random r = new Random();

			System.err.println(gameNames[r.nextInt(counter)]);
		}
		
		catch(GameReaderException e) {
			e.printStackTrace();
		}
		
	}
	
}
