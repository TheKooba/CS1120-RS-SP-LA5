package edu.wmich.cs1120.la5;

public class ExpressionFactory {
	
	// *************************************************************************
	/**
	 * This method will create and return a proper object according 
	 * to the arguments received
	 * @param operator The operator signifies addition or subtraction
	 * @param val1 Value One for the operation
	 * @param val2Value Two for the operation
	 * @return Returns an IExpression Object for use within the If-Statements
	 */
	public static IExpression getExpression(char operator, int val1, int val2) {
		
		Addition add = new Addition();
		Subtraction sub = new Subtraction();
		
		Literal a = new Literal(val1);
		Literal b = new Literal(val2);
		
		// If-Statement for the Addition Operator
		if (operator == '+') {
			IExpression expAdd = new BinaryExpression(add, a, b);
			return expAdd; // IExpression Object
		}
		
		// If-Statement for the Subtraction Operator
		if (operator == '-') {
			IExpression expSub = new BinaryExpression(sub, a, b);
			return expSub; // IExpression Object
		}
		
		return null;
	}
	// *************************************************************************
	
}
