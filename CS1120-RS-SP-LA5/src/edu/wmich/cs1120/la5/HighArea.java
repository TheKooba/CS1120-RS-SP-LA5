package edu.wmich.cs1120.la5;

public class HighArea extends Area {
	
	// *************************************************************************
	/**
	 * The constructor method for the class HighArea.
	 * @param basicEnergyCost The variable for the Basic Energy Cost.
	 * @param elevation The variable for the Elevation.
	 * @param radiation The variable for the Radiation.
	 */
	public HighArea(double basicEnergyCost, double elevation, double radiation) {

		super(basicEnergyCost, elevation, radiation);
	}
	
	// *************************************************************************
	/**
	 * This method calculates the energy by multiplying the BasicEnergyCost 
	 * by four.
	 */
	@Override
	public double calcConsumedEnergy() {
		
		return super.getBasicEnergyCost() * 4.0;
	}
	// *************************************************************************
	
}
