package edu.wmich.cs1120.la5;

public abstract class Area implements IArea {
	
	private double basicEnergyCost;
	private double elevation;
	private double radiation;
	
	// *************************************************************************
	/**
	 * 
	 */
	public Area(double basicEnergyCost, double elevation, double radiation) {
		this.basicEnergyCost = basicEnergyCost;
		this.elevation = elevation;
		this.radiation = radiation;
	}
	// *************************************************************************
	
}
