package edu.wmich.cs1120.la5;

import java.util.ArrayList;

public class ElevationAnalyzer implements IRover {
	
	private String analysis;
	private ArrayList<IArea> path = new ArrayList<IArea>();
	private double averageElevation;
	private double totalElevation;
	
	// *************************************************************************
	/**
	 * 
	 */
	@Override
	public ArrayList<IArea> getPath() {
		
		return path;
	}
	
	// *************************************************************************
	/**
	 * 
	 */
	@Override
	public void setPath(ArrayList<IArea> path) {
		
		this.path = path;
	}
	
	// *************************************************************************
	/**
	 * 
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
	 * 
	 */
	@Override
	public String getAnalysis() {
		
		return analysis;
	}
	
	// *************************************************************************
	/**
	 * 
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
