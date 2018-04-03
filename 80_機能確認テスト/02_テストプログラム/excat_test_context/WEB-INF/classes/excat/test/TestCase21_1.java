package excat.test;

import java.util.ArrayList;

public class TestCase21_1 extends CommonCase {
	//change for every case
	public static String pub="publi";
	static String pack="packag";
	protected static String prot="protect";
	private final static String caseNo = "21_1";
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO é©ìÆê∂ê¨Ç≥ÇÍÇΩÉÅÉ\ÉbÉhÅEÉXÉ^Éu
		//new TestCase21_1().setConfigAndRunCase("fire runtime exception in this case");
	}

	/**
	 * main process of Test Case 21_1 
	 * fire a RuntimeException
	 * 
	 * if it is necesary, 
	 * call setConfigAndRunCase() to change config file
	 */	
	public void runCase(Object caseMessage) throws Throwable{
		runCase("abc".getBytes()[0],(short)123,true,'c',new Object(), "str");
	}

	/**
	 * all case is same for this method
	 */
	//@Override
	public String getCaseNo() {
		return caseNo;
	}
	
	/**
	 * test virant
	 */
	private void runCase(byte atByte, short atShort, boolean atBoolean,char atChar, Object atObject, String atString) throws Throwable{
		System.out.println("in case 21_1");
		
		//ref parameter
		System.out.println(atByte);
		System.out.println(atShort);
		System.out.println(atBoolean);
		System.out.println(atChar);
		System.out.println(atObject);
		System.out.println(atString);
		
		//do test work of this case
		String caseinfo = " is testedÅ`Ç†Å|22áä111";
		//throw new RuntimeException((String)caseMessage + caseinfo);
		throw new RuntimeException("affafÅ`Ç†Å|22áä111");
	}
}
