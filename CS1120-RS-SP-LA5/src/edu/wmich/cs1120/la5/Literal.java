package edu.wmich.cs1120.la5;

public class Literal implements IExpression {
	
	private int value;
	// *************************************************************************
	/**
	 * Constructor Method for Literal.
	 * @param val The variable for the value.
	 */
	public Literal(int val) {
		
		this.value = val;
	}
	
	// *************************************************************************
	/**
	 * Getter for value
	 */
	@Override
	public Integer getValue() {
		
		return value;
	}
	// *************************************************************************
	
}
