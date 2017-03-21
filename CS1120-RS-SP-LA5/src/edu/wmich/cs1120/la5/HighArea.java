package edu.wmich.cs1120.la5;

public class HighArea extends Area {
	
	private double basicEnergyCost;
	private double elevation;
	private double radiation;
	
	// *************************************************************************
	/**
	 * 
	 * @param basicEnergyCost
	 * @param elevation
	 * @param radiation
	 */
	public HighArea(double basicEnergyCost, double elevation, double radiation) {

		super(basicEnergyCost, elevation, radiation);
	}
	
	// *************************************************************************
	/**
	 * 
	 */
	@Override
	public double getBasicEnergyCost() {
		
<<<<<<< HEAD
		return basicEnergyCost;
=======
		System.out.print("Hi");
		return 0;
>>>>>>> branch 'master' of https://github.com/TheKooba/CS1120-RS-SP-LA5.git
	}
	
	// *************************************************************************
	/**
	 * 
	 */
	@Override
	public void setBasicEnergyCost(double basicEnergyCost) {
		
		this.basicEnergyCost = basicEnergyCost;
	}
	
	// *************************************************************************
	/**
	 * 
	 */
	@Override
	public double getElevation() {
		
		return elevation;
	}
	
	// *************************************************************************
	/**
	 * 
	 */
	@Override
	public void setElevation(double elevation) {
		
		this.elevation = elevation;
	}
	
	// *************************************************************************
	/**
	 * 
	 */
	@Override
	public double getRadiation() {
		
		return radiation;
	}
	
	// *************************************************************************
	/**
	 * 
	 */
	@Override
	public void setRadiation(double radiation) {
		
		this.radiation = radiation;
	}
	
	// *************************************************************************
	/**
	 * 
	 */
	@Override
	public double calcConsumedEnergy() {
		
		return super.getBasicEnergyCost() * 4.0;
	}
	// *************************************************************************
	
}
