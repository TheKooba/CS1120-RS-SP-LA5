package edu.wmich.cs1120.la5;

public class Addition implements IOperation {
	
	// *************************************************************************
	/**
	 * Adds the expression
	 */
	@Override
	public Integer perform(IExpression left, IExpression right) {
		
		return (left.getValue() + right.getValue());
	}
	// *************************************************************************
	
}
