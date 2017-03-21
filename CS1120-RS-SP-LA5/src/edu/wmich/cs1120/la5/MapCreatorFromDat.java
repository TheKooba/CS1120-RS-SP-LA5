package edu.wmich.cs1120.la5;

import java.io.IOException;

public class MapCreatorFromDat implements IMapCreator {
	
	private TerrainScanner scanner = new TerrainScanner();
	
	// *************************************************************************
	/**
	 * 
	 */
	@Override
	public void scanTerrain(String fileName, int threshold) throws IOException {
		
		
		
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
