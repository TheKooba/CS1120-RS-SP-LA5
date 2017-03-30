package edu.wmich.cs1120.la5;

public interface IOperation {
	
	// *************************************************************************
	/**
	 * Perform the operation accordingly and return the value
	 * @param left one variable
	 * @param right the other variable
	 * @return the expressions result
	 */
	Integer perform(IExpression left, IExpression right);
	
	// *************************************************************************
}
