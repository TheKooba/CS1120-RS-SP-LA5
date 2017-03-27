package edu.wmich.cs1120.la5;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class MapCreatorFromDat implements IMapCreator {
	
	private Area[][] areaArray = new Area[10][10];
	private Double[][] energyArray = new Double[10][10];
	private Double[][] elevationArray = new Double[10][10];
	private Double[][] radiationArray = new Double[10][10];
	private TerrainScanner scanner = new TerrainScanner();
	
	// *************************************************************************
	/**
	 * Scans the terrain given by the .Dat file to generate the GUI terrain.
	 */
	@Override
	public void scanTerrain(String fileName, int threshold) throws IOException {
		
		// Initialize & set up the Scanner / File Reader
		File file = new File(fileName);
		DataInputStream scan = new DataInputStream(new FileInputStream (file));
		
		// Initialize Variables
		double basicEnergyCost = 0;
		double elevation = 0;
		double radiation = 0;
		
			// For-Loop reads the .dat file
			for (int i = 0; i < 10; i++){
				for (int j = 0; j < 10; j++){
					basicEnergyCost = scan.readDouble();
					elevation = scan.readDouble();
					radiation = scan.readDouble();

					energyArray[i][j] = basicEnergyCost;
					elevationArray[i][j] = elevation;
					radiationArray[i][j] = radiation;

					if (radiation >= 0.5) {
						areaArray[i][j] = new HighArea(basicEnergyCost, elevation, radiation);
					} else if (radiation < 0.5 && elevation > (0.5 * threshold)) {
						areaArray[i][j] = new HighArea(basicEnergyCost, elevation, radiation);
					} else {
						areaArray[i][j] = new LowArea(basicEnergyCost, elevation, radiation);
					}
				}
			}
			
			scanner.setTerrain(areaArray);
			scan.close();
		}

		
	
	// *************************************************************************
	/**
	 * Getter method for retrieving the scanner variable
	 */
	@Override
	public TerrainScanner getScanner() {
		
		return this.scanner;
	}
	
	// *************************************************************************
	/**
	 * Setter method for retrieving the scanner variable
	 */
	@Override
	public void setScanner(TerrainScanner scanner) {
		
		this.scanner = scanner;
	}
	// *************************************************************************
	
}
