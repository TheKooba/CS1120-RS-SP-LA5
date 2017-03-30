package edu.wmich.cs1120.la5;

public abstract class Area implements IArea {
	
	private double basicEnergyCost;
	private double elevation;
	private double radiation;
	
	// *************************************************************************
	/**
	 * The constructor method for the Area class.
	 * @param basicEnergyCost The Basic Energy Cost variable.
	 * @param elevation The Elevation variable.
	 * @param radiation The Radiation variable. 
	 */
	public Area(double basicEnergyCost, double elevation, double radiation) {
		
		this.basicEnergyCost = basicEnergyCost;
		this.elevation = elevation;
		this.radiation = radiation;
	}
	
	// *************************************************************************
	/**
	 * Getter method for the BasicEnergyCost.
	 */
	@Override
	public double getBasicEnergyCost() {
		
		return basicEnergyCost;
	}
	
	// *************************************************************************
	/**
	 * Setter method for the BasicEnergyCost.
	 */
	@Override
	public void setBasicEnergyCost(double basicEnergyCost) {
		
		this.basicEnergyCost = basicEnergyCost;
	}
	
	// *************************************************************************
	/**
	 * Getter method for the Elevation.
	 */
	@Override
	public double getElevation() {
		
		return elevation;
	}
	
	// *************************************************************************
	/**
	 * Setter method for the Elevation.
	 */
	@Override
	public void setElevation(double elevation) {
		
		this.elevation = elevation;
	}
	
	// *************************************************************************
	/**
	 * Getter method for the Radiation.
	 */
	@Override
	public double getRadiation() {
		
		return radiation;
	}
	
	// *************************************************************************
	/**
	 * Setter method for the Radiation.
	 */
	@Override
	public void setRadiation(double radiation) {
		
		this.radiation = radiation;
	}
	
	// *************************************************************************
	/**
	 * This abstract method calculates consumed energy using the information of
	 * if it is a High Area or a Low Area.
	 */
	@Override
	public abstract double calcConsumedEnergy();
	
	// *************************************************************************
	
}
