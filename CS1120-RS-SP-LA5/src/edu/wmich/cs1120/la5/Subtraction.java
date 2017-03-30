package edu.wmich.cs1120.la5;

public class Subtraction implements IOperation {
	
	// *************************************************************************
	/**
	 * Constructor for the class
	 */
	public Subtraction() {
		
	}
	
	// *************************************************************************
	/**
	 * Subtracts the two inputted values
	 */
	@Override
	public Integer perform(IExpression left, IExpression right) {
		
		return (left.getValue() - right.getValue());
	}
	// *************************************************************************
	
}
