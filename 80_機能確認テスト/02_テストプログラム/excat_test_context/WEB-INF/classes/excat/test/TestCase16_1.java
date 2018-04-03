package excat.test;

import java.util.ArrayList;

public class TestCase16_1 extends CommonCase {
	//change for every case
	public static String pub="publi";
	static String pack="packag";
	protected static String prot="protect";
	private final static String caseNo = "16_1";
	
	public static ArrayList nestDepth1 = new ArrayList();
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO é©ìÆê∂ê¨Ç≥ÇÍÇΩÉÅÉ\ÉbÉhÅEÉXÉ^Éu
		new TestCase16_1().setConfigAndRunCase("fire runtime exception in this case");
	}
	
	/**
	 * main process of Test Case 16_1 
	 * fire a RuntimeException
	 * 
	 * if it is necesary, 
	 * call setConfigAndRunCase() to change config file
	 */
	public void runCase(Object caseMessage) throws Throwable{
		System.out.println("in case 16_1");
		
		ArrayList nestDepth5 = new ArrayList();
		ArrayList nestDepth4 = new ArrayList();
		ArrayList nestDepth3 = new ArrayList();
		ArrayList nestDepth2 = new ArrayList();
		
		nestDepth5.add("aaaaa");nestDepth5.add("bbbbb");nestDepth5.add("ccccc");nestDepth5.add("ddddd");
		nestDepth4.add(nestDepth5);nestDepth5.add("bbbb");nestDepth5.add("cccc");nestDepth5.add("dddd");
		nestDepth3.add(nestDepth4);nestDepth5.add("bbb");nestDepth5.add("ccc");nestDepth5.add("ddd");
		nestDepth2.add(nestDepth3);nestDepth5.add("bb");nestDepth5.add("cc");nestDepth5.add("dd");
		nestDepth1.add(nestDepth2);nestDepth5.add("b");nestDepth5.add("c");nestDepth5.add("d");
		
		//do test work of this case
		String caseinfo = " is testedÅ`Ç†Å|22áä111";
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
