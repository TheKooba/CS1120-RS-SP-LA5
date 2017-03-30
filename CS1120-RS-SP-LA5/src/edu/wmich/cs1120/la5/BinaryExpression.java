package edu.wmich.cs1120.la5;

public class BinaryExpression implements IExpression {
	
	private IExpression right;
	private IExpression left;
	
	private IOperation op;
	
	// *************************************************************************
	/**
	 * 
	 * @param left
	 * @param right
	 * @param op
	 */
	public BinaryExpression(IOperation op, IExpression left, IExpression right) {
		
		this.op = op;
		this.left = left;
		this.right = right;
	}
	
	// *************************************************************************
	/**
	 * 
	 */
	@Override
	public Integer getValue() {
		
		return op.perform(left, right);
	}
	// *************************************************************************
	
}
