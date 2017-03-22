package edu.wmich.cs1120.la5;

public class BinaryExpression implements IExpression {
	
	private int val1;
	private int val2;
	
	private Addition add = new Addition();
	private Subtraction sub = new Subtraction();
	
	private Literal a = new Literal(val1);
	private Literal b = new Literal(val2);
	
	// *************************************************************************
	/**
	 * 
	 * @param add
	 * @param a
	 * @param b
	 */
	public BinaryExpression(Addition add, Literal a, Literal b) {
		
		this.add = add;
		this.a = a;
		this.b = b;
	}
	
	// *************************************************************************
	/**
	 * 
	 * @param sub
	 * @param a
	 * @param b
	 */
	public BinaryExpression(Subtraction sub, Literal a, Literal b){
		
		this.sub = sub;
		this.a = a;
		this.b = b;
	}
	
	// *************************************************************************
	/**
	 * 
	 */
	@Override
	public Integer getValue() {
		
		
		return null;
	}
	// *************************************************************************
	
}
