package edu.wmich.cs1120.la5;

import java.io.IOException;
import edu.wmich.cs1120.la5.Area;
import edu.wmich.cs1120.la5.TerrainScanner;

public class MapCreator implements IMapCreator {
	
//	private Area[][] areaArray = new Area[10][10];
//	private Double[][] energyArray = new Double[10][10];
//	private Double[][] elevationArray = new Double[10][10];
//	private Double[][] radiationArray = new Double[10][10];
	private TerrainScanner scanner = new TerrainScanner();
	
	// *************************************************************************
	/**
	 * 
	 */
	public MapCreator() {
		
	}
	
	// *************************************************************************
	@Override
	public void scanTerrain(String fileName, int threshold) throws IOException {
		
	}
	
	// *************************************************************************
	@Override
	public TerrainScanner getScanner() {
		
		return this.scanner;
	}
	
	// *************************************************************************
	@Override
	public void setScanner(TerrainScanner scanner) {
		
		this.scanner = scanner;
	}
	// *************************************************************************
	
}
