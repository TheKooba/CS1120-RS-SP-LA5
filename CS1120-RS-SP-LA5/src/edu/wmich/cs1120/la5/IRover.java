package edu.wmich.cs1120.la5;

import java.util.ArrayList;

public interface IRover {
	
	// *************************************************************************
	/**
	 * Getter for path
	 * @return path
	 */
	ArrayList<IArea> getPath();
	
	// *************************************************************************
	/**
	 * Setter for the path
	 * @param path the Array List of the path to be taken
	 */
	void setPath(ArrayList<IArea> path);
	
	// *************************************************************************
	/**
	 * Analyzes the path
	 */
	void analyzePath();
	
	// *************************************************************************
	/**
	 * Getter for analysis
	 * @return final analysis
	 */
	String getAnalysis();
	
	// *************************************************************************
	/**
	 * Setter for analysis
	 * @param analysis the string analysis
	 */
	void setAnalysis(String analysis);
	
	// *************************************************************************
	/**
	 * To string method
	 * @return Returns the formatted toString.
	 */
	String toString();
	
	// *************************************************************************
}
