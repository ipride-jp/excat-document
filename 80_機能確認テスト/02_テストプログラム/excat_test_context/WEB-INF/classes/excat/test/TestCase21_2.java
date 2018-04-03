package excat.test;

import java.util.ArrayList;

public class TestCase21_2 extends CommonCase {
	//change for every case
	public static String pub="publi";
	static String pack="packag";
	protected static String prot="protect";
	private final static String caseNo = "21_2";
	

	public static void TestCase21_2(){
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO é©ìÆê∂ê¨Ç≥ÇÍÇΩÉÅÉ\ÉbÉhÅEÉXÉ^Éu
		//new TestCase21_2().setConfigAndRunCase("fire runtime exception in this case");
	}
	
	/**
	 * main process of Test Case 21_2 
	 * fire a RuntimeException
	 * 
	 * if it is necesary, 
	 * call setConfigAndRunCase() to change config file
	 */
	public void runCase(Object caseMessage) throws Throwable{
		System.out.println("in case 21_2");
		
		//do test work of this case
		String caseinfo = " is testedÅ`Ç†Å|22áä111";
		byte atByte = 'a'; 
		short atShort = 123;
		boolean atBoolean = true; 
		char atChar = 'c';
		Object atObject = "object";
		String atString = "str";
		String s ;
		int i;
		
		//ref 
		System.out.println(atByte);
		System.out.println(atShort);
		System.out.println(atBoolean);
		System.out.println(atChar);
		System.out.println(atObject);
		System.out.println(atString);
		
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
