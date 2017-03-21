package edu.wmich.cs1120.la5;

import java.io.IOException;

public interface IMapCreator {
	
	// *************************************************************************
	/**
	 * Read from the file, set up the IArea[10][10] and set the terrain 
	 * for the object of TerrainScanner
	 * @param fileName
	 * @param threshold
	 * @throws IOException
	 */
	void scanTerrain(String fileName, int threshold) throws IOException;
	
	// *************************************************************************
	/**
	 * 
	 * @return
	 */
	TerrainScanner getScanner();
	
	// *************************************************************************
	/**
	 * 
	 * @param scanner
	 */
	void setScanner(TerrainScanner scanner);
	
	// *************************************************************************
}
