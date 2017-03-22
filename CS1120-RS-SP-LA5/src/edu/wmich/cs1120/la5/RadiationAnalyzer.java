package edu.wmich.cs1120.la5;

import java.util.ArrayList;

public class RadiationAnalyzer implements IRover {
	
	private String analysis;
	private ArrayList<IArea> path = new ArrayList<IArea>();
	
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
	
}
