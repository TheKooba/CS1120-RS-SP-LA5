package edu.wmich.cs1120.la5;

public class LowArea extends Area {
	
	// *************************************************************************
	/**
	 * The low area method that fills the Area array
	 * @param basicEnergyCost the cost of the energy	
	 * @param elevation the elevation of the area
	 * @param radiation the radiation of the area
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
