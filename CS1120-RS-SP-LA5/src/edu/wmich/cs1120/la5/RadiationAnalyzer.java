package edu.wmich.cs1120.la5;

import java.util.ArrayList;

public class RadiationAnalyzer implements IRover {
	
	private String analysis;
	private ArrayList<IArea> path = new ArrayList<IArea>();
	private double totalRadiation;
	
	// *************************************************************************
	/**
	 * Constructor for the class
	 */
	public RadiationAnalyzer() {
		
	}
	
	// *************************************************************************
	/**
	 * Getter for the path
	 */
	@Override
	public ArrayList<IArea> getPath() {
		
		return this.path;
	}
	
	// *************************************************************************
	/**
	 * Setter for the path
	 */
	@Override
	public void setPath(ArrayList<IArea> path) {
		
		this.path = path;
	}
	
	// *************************************************************************
	/**
	 * Gets the total radiation
	 */
	@Override
	public void analyzePath() {
		for(int i = 0; i < path.size(); i++) {
			totalRadiation += path.get(i).getRadiation();
			analysis = Double.toString(totalRadiation);
		}
		
	}
	
	// *************************************************************************
	/**
	 * Getter for analyzer
	 */
	@Override
	public String getAnalysis() {
		
		return this.analysis;
	}
	
	// *************************************************************************
	/**
	 * Setter for analyzer
	 */
	@Override
	public void setAnalysis(String analysis) {
		
		this.analysis = analysis;
	}
	
	// *************************************************************************
	/**
	 * To String method returns the name of the analyzer.
	 */
	@Override
	public String toString() {
		return "Total Radiation: ";
	}
	// *************************************************************************
	
}
