package de.realseb3d.RandomGamePicker;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;



public class GameReader{
	
	public String[] readGames() throws GameReaderException {
		
		try (BufferedReader b = new BufferedReader(new FileReader("game.txt"))){
			String[] gameName = new String[0];
			while (b.ready()) {
				String name = b.readLine();
				gameName = Arrays.copyOf(gameName, gameName.length + 1);
				gameName[gameName.length - 1] = name;
			}
			return gameName;
		} catch (FileNotFoundException e) {
			throw new GameReaderException(e);
		} catch (IOException e) {
			throw new GameReaderException(e);
		}
	}
	
}