package edu.wmich.cs1120.la5;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MapCreatorFromTxt implements IMapCreator {
	
	private Area[][] areaArray = new Area[10][10];
	private Double[][] energyArray = new Double[10][10];
	private Double[][] elevationArray = new Double[10][10];
	private Double[][] radiationArray = new Double[10][10];
	private TerrainScanner scanner = new TerrainScanner();
	
	// *************************************************************************
	/**
	 * Reads from the file and fills all the subsequent arrays
	 */
	@Override
	public void scanTerrain(String fileName, int threshold) throws IOException {

		// Initialize & set up the Scanner / File Reader
		File file = new File(fileName);
		Scanner scan = new Scanner(file);

		// Initialize Variables
		double basicEnergyCost = 0;
		double elevation = 0;
		double radiation = 0;


		// While loop to parse & read the input array
			
			for (int i = 0; i < 10; i++){
				for (int j = 0; j < 10; j++){
					
					String[] str = scan.nextLine().split(" ");

					basicEnergyCost = Double.parseDouble(str[0]);
					elevation = Double.parseDouble(str[1]);
					radiation = Double.parseDouble(str[2]);

					energyArray[i][j] = basicEnergyCost;
					elevationArray[i][j] = elevation;
					radiationArray[i][j] = radiation;
					
//					System.out.println(energyArray[i][j]);
//					System.out.println(elevationArray[i][j]);
//					System.out.println(radiationArray[i][j]);

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
	 * Getter for scanner
	 */
	@Override
	public TerrainScanner getScanner() {
		
		return this.scanner;
	}
	
	// *************************************************************************
	/**
	 * Setter for the scanner
	 */
	@Override
	public void setScanner(TerrainScanner scanner) {
		
		this.scanner = scanner;
	}
	// *************************************************************************
	
}
