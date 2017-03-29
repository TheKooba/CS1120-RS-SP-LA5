package edu.wmich.cs1120.la5;

import java.util.ArrayList;

public class EnergyAnalyzer implements IRover {
	
	private String analysis;
	private ArrayList<IArea> path = new ArrayList<IArea>();
	private double totalEnergyCost;
	
	// *************************************************************************
	/**
	 * 
	 */
	public EnergyAnalyzer() {
		
	}
	
	// *************************************************************************
	/**
	 * Getter method for the ArrayList variable.
	 */
	@Override
	public ArrayList<IArea> getPath() {
		
		return path;
	}
	
	// *************************************************************************
	/**
	 * Setter method for the ArrayList variable.
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
			totalEnergyCost += path.get(i).calcConsumedEnergy();
		}
	}
	
	// *************************************************************************
	/**
	 * Getter method for the String variable analysis.
	 */
	@Override
	public String getAnalysis() {
		
		return analysis;
	}
	
	// *************************************************************************
	/**
	 * Setter method for the String variable analysis.
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
		return "Total Energy Cost: " + totalEnergyCost;
	}
	// *************************************************************************
	
}
