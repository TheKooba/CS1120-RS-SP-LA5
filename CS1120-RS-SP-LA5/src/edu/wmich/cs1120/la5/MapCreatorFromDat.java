package edu.wmich.cs1120.la5;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class MapCreatorFromDat implements IMapCreator {
	
	private Area[][] areaArray = new Area[10][10];
	private Double[][] energyArray = new Double[10][10];
	private Double[][] elevationArray = new Double[10][10];
	private Double[][] radiationArray = new Double[10][10];
	private TerrainScanner scanner = new TerrainScanner();
	
	// *************************************************************************
	/**
	 * 
	 */
	@Override
	public void scanTerrain(String fileName, int threshold) throws IOException {
		

		// Initialize & set up the Scanner / File Reader
		File file = new File(fileName);
		DataOutputStream scan = new DataOutputStream(new FileOutputStream (file));

		// Initialize Variables
		double basicEnergyCost = 0;
		double elevation = 0;
		double radiation = 0;
		int i = 0;
		int j = 0;

		// While loop to parse & read the input array
		while (i == 0) {


			basicEnergyCost = 
			elevation = 
			radiation = 

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

			if (j == 9) {
				i++;
				j = -1;
			}
			j++;
		}
		scanner.setTerrain(areaArray);
		scan.close();
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
