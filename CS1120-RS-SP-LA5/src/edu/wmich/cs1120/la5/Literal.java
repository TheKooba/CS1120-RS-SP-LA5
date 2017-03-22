package edu.wmich.cs1120.la5;

public class Literal implements IExpression {
	
	private int value;
	// *************************************************************************
	/**
	 * 
	 */
	public Literal(int val) {
		this.value = val;
	}
	
	// *************************************************************************
	/**
	 * 
	 */
	@Override
	public Integer getValue() {
		
		return value;
	}
	// *************************************************************************
	
}
