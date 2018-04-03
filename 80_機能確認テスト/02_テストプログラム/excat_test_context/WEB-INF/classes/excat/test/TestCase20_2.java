package excat.test;

import java.util.ArrayList;

public class TestCase20_2 extends CommonCase {
	//change for every case
	public static String pub="publi";
	static String pack="packag";
	protected static String prot="protect";
	private final static String caseNo = "20_2";
	

	public static void TestCase20_2(){
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO é©ìÆê∂ê¨Ç≥ÇÍÇΩÉÅÉ\ÉbÉhÅEÉXÉ^Éu
		//new TestCase20_2().setConfigAndRunCase("fire runtime exception in this case");
	}
	
	/**
	 * main process of Test Case 20_2 
	 * fire a RuntimeException
	 * 
	 * if it is necesary, 
	 * call setConfigAndRunCase() to change config file
	 */
	public void runCase(Object caseMessage) throws Throwable{
		System.out.println("in case 20_2");
		
		//do test work of this case
		String caseinfo = " is testedÅ`Ç†Å|22áä111";
		byte atByte = 'a'; 
		short atShort = 123;
		boolean atBoolean = true; 
		char atChar = 'c';
		Object atObject = "object";
		//throw new RuntimeException((String)caseMessage + caseinfo);
		throw new RuntimeException("affafÅ`Ç†Å|22áä111");
	}
	
	/**
	 * all case is same for this method
	 */
	//@Override
	public String getCaseNo() {
		return caseNo;
	}
}
