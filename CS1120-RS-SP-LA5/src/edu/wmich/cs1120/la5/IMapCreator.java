package edu.wmich.cs1120.la5;

import java.io.IOException;

public interface IMapCreator {
	
	// *************************************************************************
	/**
	 * Read from the file, set up the IArea[10][10] and set the terrain 
	 * for the object of TerrainScanner
	 * @param fileName The variable that stores the input file name.
	 * @param threshold The value of the threshold that was input.
	 * @throws IOException Throws IOException. 
	 */
	void scanTerrain(String fileName, int threshold) throws IOException;
	
	// *************************************************************************
	/**
	 * Getter method for the Scanner.
	 * @return Returns the value for the scanner.
	 */
	TerrainScanner getScanner();
	
	// *************************************************************************
	/**
	 * Setter method for the Scanner.
	 * @param scanner Uses the value retrieved for the scanner.
	 */
	void setScanner(TerrainScanner scanner);
	
	// *************************************************************************
}
