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
	@Override
	public ArrayList<IArea> getPath() {
		
		return this.path;
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
		
		return this.analysis;
	}
	
	// *************************************************************************
	@Override
	public void setAnalysis(String analysis) {
		
		this.analysis = analysis;
	}
	// *************************************************************************
	
}
