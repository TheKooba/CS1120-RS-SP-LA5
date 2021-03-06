package edu.wmich.cs1120.la5;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

public class MapCreatorFromDat implements IMapCreator {
	
	private Area[][] areaArray = new Area[10][10];
	private Double[][] energyArray = new Double[10][10];
	private Double[][] elevationArray = new Double[10][10];
	private Double[][] radiationArray = new Double[10][10];
	private TerrainScanner scanner = new TerrainScanner();
	
	// *************************************************************************
	/**
	 * Scans the terrain given by the .dat file to generate the GUI terrain.
	 */
	@Override
	public void scanTerrain(String fileName, int threshold) throws IOException {
		
		// Initialize & set up the Scanner / File Reader
		File file = new File(fileName);
		RandomAccessFile scan = new RandomAccessFile(file, "r");
		
		// Initialize Variables
		double basicEnergyCost = 0;
		double elevation = 0;
		double radiation = 0;
		int left = 0;
		int right = 0;
		int ind = 0;
		
		IExpression expresso;
		char car;
		
			// For-Loop reads the .dat file
			for (int i = 0; i < 10; i++){
				for (int j = 0; j < 10; j++){
					scan.seek(ind * 34);
					basicEnergyCost = scan.readDouble();
					elevation = scan.readDouble();
					radiation = scan.readDouble();

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
					car = scan.readChar();
					left = scan.readInt();
					right = scan.readInt();
					
					expresso = ExpressionFactory.getExpression(car, left, right);
					ind = expresso.getValue();
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
