package edu.wmich.cs1120.la5;

import java.util.ArrayList;

import edu.wmich.cs1120.la5.MapCreator;

public class Rover implements IRover {
	
	private String analysis;
	private MapCreator mc = new MapCreator();
	private ArrayList<IArea> path = new ArrayList<IArea>();

	// *************************************************************************
	/**
	 * 
	 */
	public Rover() {
		
	}
	
	// *************************************************************************
	/**
	 * 
	 */
	@Override
	public ArrayList<IArea> getPath() {
		
		return this.path;
	}
	
	// *************************************************************************
	/**
	 * Set the path to be the given argument
	 */
	@Override
	public void setPath(ArrayList<IArea> path) {
		
		this.path = path;
	}
	
	// *************************************************************************
	/**
	 * Analyze the path according to the type of the analyzer
	 */
	@Override
	public void analyzePath() {
		
		
		
	}
	
	// *************************************************************************
	/**
	 * Get the result of the analysis according to the type of the analyzer
	 */
	@Override
	public String getAnalysis() {
		
		return this.analysis;
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
	 * Return the name of the analyzer
	 */
	@Override
	public String toString() {

		return super.toString();
	}
	// *************************************************************************
	
}
