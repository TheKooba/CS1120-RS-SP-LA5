package edu.wmich.cs1120.la5;

import java.util.ArrayList;

public class ElevationAnalyzer implements IRover {
	
	private String analysis;
	private MapCreator mc = new MapCreator();
	private ArrayList<IArea> path = new ArrayList<IArea>();
	
	// *************************************************************************
	/**
	 * 
	 */
	public ElevationAnalyzer() {
		
	}
	
	// *************************************************************************
	@Override
	public ArrayList<IArea> getPath() {
		
		return path;
	}
	
	// *************************************************************************
	@Override
	public void setPath(ArrayList<IArea> path) {
		
		this.path = path;
	}
	
	// *************************************************************************
	@Override
	public void analyzePath() {
		
		
		
	}
	
	// *************************************************************************
	@Override
	public String getAnalysis() {
		
		return analysis;
	}
	
	// *************************************************************************
	@Override
	public void setAnalysis(String analysis) {
		
		this.analysis = analysis;
	}
	// *************************************************************************
	
}
