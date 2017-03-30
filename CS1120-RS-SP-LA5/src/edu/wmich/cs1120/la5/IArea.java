package edu.wmich.cs1120.la5;

public interface IArea {
	
	// *************************************************************************
	/**
	 * Getter method for the BasicEnergyCost.
	 * @return Returns the value for the Basic Energy Cost.
	 */
	double getBasicEnergyCost();
	
	// *************************************************************************
	/**
	 * Setter method for the BasicEnergyCost.
	 * @param basicEnergyCost The variable for Basic Energy Cost.
	 */
	void setBasicEnergyCost(double basicEnergyCost);
	
	// *************************************************************************
	/**Getter method for the Elevation.
	 * 
	 * @return Returns the value for the elevation.
	 */
	double getElevation();
	
	// *************************************************************************
	/**
	 * Setter method for the Elevation.
	 * @param elevation Uses the value that the Getter retrieved. 
	 */
	void setElevation(double elevation);
	
	// *************************************************************************
	/**
	 * Getter method for the Radiation.
	 * @return Returns the value of the radiation.
	 */
	double getRadiation();
	
	// *************************************************************************
	/**
	 * Setter method for the Radiation.
	 * @param radiation Uses the retrieved value for radiation. 
	 */
	void setRadiation(double radiation);
	
	// *************************************************************************
	/**
	 * This abstract method calculates consumed energy using the information of
	 * if it is a High Area or a Low Area.
	 * @return Returns the value that was calculated.
	 */
	double calcConsumedEnergy();
	
	// *************************************************************************
}
