package edu.wmich.cs1120.la5;

public class ExpressionFactory {
	
	public ExpressionFactory() {
		
	}
	
	// *************************************************************************
	/**
	 * This method will create and return a proper object according 
	 * to the arguments received
	 * @param operator The operator signifies addition or subtraction
	 * @param val1 Value One for the operation
	 * @param val2Value Two for the operation
	 * @return
	 */
	public static IExpression getExpression(char operator, int val1, int val2) {
		
		Addition add = new Addition();
		Subtraction subtract = new Subtraction();
		
		Literal a = new Literal(val1);
		Literal b = new Literal(val2);
		
		if (operator == '+') {
			IExpression exp = new BinaryExpression(add, a, b);
		}
		
		if (operator == '-') {
			IExpression exp = new BinaryExpression(subtract, a, b);
		}
		
		return null;
	}
	// *************************************************************************
	
}
