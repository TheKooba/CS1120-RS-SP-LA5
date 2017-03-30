package edu.wmich.cs1120.la5;

import java.util.ArrayList;

public class ElevationAnalyzer implements IRover {
	
	private String analysis;
	private ArrayList<IArea> path = new ArrayList<IArea>();
	private double averageElevation;
	private double totalElevation;
	
	// *************************************************************************
	/**
	 * Getter method for the ArrayList.
	 */
	@Override
	public ArrayList<IArea> getPath() {
		
		return path;
	}
	
	// *************************************************************************
	/**
	 * Setter method for the ArrayList.
	 */
	@Override
	public void setPath(ArrayList<IArea> path) {
		
		this.path = path;
	}
	
	// *************************************************************************
	/**
	 * This method is used to analyze the path using the elevation.
	 */
	@Override
	public void analyzePath() {
		
		for(int i = 0; i < path.size(); i++) {
			totalElevation += path.get(i).getElevation();
		}
		
		averageElevation = totalElevation / path.size();
		analysis = Double.toString(averageElevation);
	}
	
	// *************************************************************************
	/**
	 * Getter method for the Analysis.
	 */
	@Override
	public String getAnalysis() {
		
		return analysis;
	}
	
	// *************************************************************************
	/**
	 * Setter method for the Analysis.
	 */
	@Override
	public void setAnalysis(String analysis) {
		
		this.analysis = analysis;
	}
	
	// *************************************************************************
	/**
	 * To String Method returns the title of the elevation button.
	 */
	@Override
	public String toString() {
		
		return "Average Elevation: ";
	}
	// *************************************************************************
	
}
