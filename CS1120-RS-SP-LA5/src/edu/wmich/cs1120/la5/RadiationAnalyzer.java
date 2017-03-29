package edu.wmich.cs1120.la5;

import java.util.ArrayList;

public class RadiationAnalyzer implements IRover {
	
	private String analysis;
	private ArrayList<IArea> path = new ArrayList<IArea>();
	private double totalRadiation;
	
	// *************************************************************************
	/**
	 * 
	 */
	public RadiationAnalyzer() {
		
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
		for(int i = 0; i < path.size()-1; i++) {
			totalRadiation += path.get(i).getRadiation();
		}
		
	}
	
	// *************************************************************************
	/**
	 * 
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
	 * To String method returns the name of the analyzer.
	 */
	@Override
	public String toString() {
		analyzePath();
		return "Total Radiation: " + totalRadiation;
	}
	// *************************************************************************
	
}
