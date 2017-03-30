package edu.wmich.cs1120.la5;

public class BinaryExpression implements IExpression {
	
	private IExpression right;
	private IExpression left;
	
	private IOperation op;
	
	// *************************************************************************
	/**
	 * The constructor method for the BinaryExpression Class.
	 * @param left The left side IExpression Object.
	 * @param right The right side IExpression Object.
	 * @param op The IOperation object.
	 */
	public BinaryExpression(IOperation op, IExpression left, IExpression right) {
		
		this.op = op;
		this.left = left;
		this.right = right;
	}
	
	// *************************************************************************
	/**
	 * Uses the op.perform command to return the value using the left and 
	 * right expression objects.
	 */
	@Override
	public Integer getValue() {
		
		return op.perform(left, right);
	}
	// *************************************************************************
	
}
