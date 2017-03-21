package edu.wmich.cs1120.la5;

public interface IOperation {
	
	// *************************************************************************
	/**
	 * Perform the operation accordingly and return the value
	 * @param left
	 * @param right
	 * @return
	 */
	Integer perform(IExpression left, IExpression right);
	
	// *************************************************************************
}
