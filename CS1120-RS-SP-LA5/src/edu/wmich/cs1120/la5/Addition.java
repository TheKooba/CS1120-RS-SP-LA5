package edu.wmich.cs1120.la5;

public class Addition implements IOperation {
	
	// *************************************************************************
	/**
	 * Performs the addition of the left and right IExpression objects.
	 */
	@Override
	public Integer perform(IExpression left, IExpression right) {
		
		return (left.getValue() + right.getValue());
	}
	// *************************************************************************
	
}
