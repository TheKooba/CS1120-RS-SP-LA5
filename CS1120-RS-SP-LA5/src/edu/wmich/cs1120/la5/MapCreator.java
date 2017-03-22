package edu.wmich.cs1120.la5;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import edu.wmich.cs1120.la5.TerrainScanner;

public class MapCreator implements IMapCreator {
	
	private TerrainScanner scanner = new TerrainScanner();
	
	// *************************************************************************
	/**
	 * 
	 */
	@Override
	public void scanTerrain(String fileName, int threshold) throws IOException {

		// Initialize & set up the Scanner / File Reader
		File file = new File(fileName);
		Scanner scan = new Scanner(file);
		
		// If-Statement for the TEXT File
		if(fileName == "terrain.txt") {
			MapCreatorFromTxt mct = new MapCreatorFromTxt();
			mct.scanTerrain(fileName, threshold);
		}
		
		// If-Statement for the DAT File
		if(fileName == "terrain.dat") {
			MapCreatorFromDat mcd = new MapCreatorFromDat();
			mcd.scanTerrain(fileName, threshold);
		}
		
		
	}
	
	// *************************************************************************
	/**
	 * 
	 */
	@Override
	public TerrainScanner getScanner() {
		
		return this.scanner;
	}
	
	// *************************************************************************
	/**
	 * 
	 */
	@Override
	public void setScanner(TerrainScanner scanner) {
		
		this.scanner = scanner;
	}
	// *************************************************************************
	
}
