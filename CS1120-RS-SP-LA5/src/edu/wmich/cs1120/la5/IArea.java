package edu.wmich.cs1120.la5;

public interface IArea {
	
	// *************************************************************************
	/**
	 * 
	 * @return
	 */
	double getBasicEnergyCost();
	
	// *************************************************************************
	/**
	 * 
	 * @param basicEnergyCost
	 */
	void setBasicEnergyCost(double basicEnergyCost);
	
	// *************************************************************************
	/**
	 * 
	 * @return
	 */
	double getElevation();
	
	// *************************************************************************
	/**
	 * 
	 * @param elevation
	 */
	void setElevation(double elevation);
	
	// *************************************************************************
	/**
	 * 
	 * @return
	 */
	double getRadiation();
	
	// *************************************************************************
	/**
	 * 
	 * @param radiation
	 */
	void setRadiation(double radiation);
	
	// *************************************************************************
	/**
	 * 
	 * @return
	 */
	double calcConsumedEnergy();
	
	// *************************************************************************
}
