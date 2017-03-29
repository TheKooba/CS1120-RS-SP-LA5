package edu.wmich.cs1120.la5;

public class LowArea extends Area {
	
	// *************************************************************************
	/**
	 * 
	 * @param basicEnergyCost
	 * @param elevation
	 * @param radiation
	 */
	public LowArea(double basicEnergyCost, double elevation, double radiation) {
		
		super(basicEnergyCost, elevation, radiation);
	}
	
	@Override
	public double calcConsumedEnergy() {
		
		return super.getBasicEnergyCost() * 2.0;
	}
	// *************************************************************************
	
}
