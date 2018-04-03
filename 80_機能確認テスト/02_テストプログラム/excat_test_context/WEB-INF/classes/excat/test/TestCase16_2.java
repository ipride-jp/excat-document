package excat.test;

import java.util.HashMap;

public class TestCase16_2 extends CommonCase {
	//change for every case
	public static String pub="publi";
	static String pack="packag";
	protected static String prot="protect";
	private final static String caseNo = "16_2";
	
	public static HashMap nestDepth1 = new HashMap();
	
		
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO é©ìÆê∂ê¨Ç≥ÇÍÇΩÉÅÉ\ÉbÉhÅEÉXÉ^Éu
		new TestCase16_2().setConfigAndRunCase("fire runtime exception in this case");
	}
	
	/**
	 * main process of Test Case 16_2 
	 * fire a RuntimeException
	 * 
	 * if it is necesary, 
	 * call setConfigAndRunCase() to change config file
	 */
	public void runCase(Object caseMessage) throws Throwable{
		System.out.println("in case 16_2");
		
		HashMap nestDepth15 = new HashMap();
		HashMap nestDepth14 = new HashMap();
		HashMap nestDepth13 = new HashMap();
		HashMap nestDepth12 = new HashMap();
		HashMap nestDepth11 = new HashMap();
		HashMap nestDepth10 = new HashMap();
		HashMap nestDepth9 = new HashMap();
		HashMap nestDepth8 = new HashMap();
		HashMap nestDepth7 = new HashMap();
		HashMap nestDepth6 = new HashMap();
		HashMap nestDepth5 = new HashMap();
		HashMap nestDepth4 = new HashMap();
		HashMap nestDepth3 = new HashMap();
		HashMap nestDepth2 = new HashMap();
	
		nestDepth15.put("15-1","aaaaa");nestDepth15.put("15-2","bbbbb");nestDepth15.put("15-3","ccccc");nestDepth15.put("15-4","ddddd");
		nestDepth14.put("14-1",nestDepth15);nestDepth14.put("14-2","bbbb");nestDepth14.put("14-3","cccc");nestDepth14.put("14-4","dddd");
		nestDepth13.put("13-1",nestDepth14);nestDepth13.put("13-2","bbb");nestDepth13.put("13-3","ccc");nestDepth13.put("13-4","ddd");
		nestDepth12.put("12-1",nestDepth13);nestDepth12.put("12-2","bb");nestDepth12.put("12-3","cc");nestDepth12.put("12-4","dd");
		nestDepth11.put("11-1",nestDepth12);nestDepth11.put("11-2","b");nestDepth11.put("11-3","c");nestDepth11.put("11-4","d");
		nestDepth10.put("10-1",nestDepth11);nestDepth10.put("10-2","bbbbb");nestDepth10.put("10-3","ccccc");nestDepth10.put("10-4","ddddd");
		nestDepth9.put("9-1",nestDepth10);nestDepth9.put("9-2","bbbb");nestDepth5.put("9-3","cccc");nestDepth9.put("9-4","dddd");
		nestDepth8.put("8-1",nestDepth9);nestDepth8.put("8-2","bbb");nestDepth8.put("8-3","ccc");nestDepth8.put("8-4","ddd");
		nestDepth7.put("7-1",nestDepth8);nestDepth7.put("7-2","bb");nestDepth7.put("7-3","cc");nestDepth7.put("7-4","dd");
		nestDepth6.put("6-1",nestDepth7);nestDepth6.put("6-2","b");nestDepth6.put("6-3","c");nestDepth6.put("6-4","d");
		nestDepth5.put("5-1",nestDepth6);nestDepth5.put("5-2","bbbbb");nestDepth5.put("5-3","ccccc");nestDepth5.put("5-4","ddddd");
		nestDepth4.put("4-1",nestDepth5);nestDepth4.put("4-2","bbbb");nestDepth4.put("4-3","cccc");nestDepth4.put("4-4","dddd");
		nestDepth3.put("3-1",nestDepth4);nestDepth3.put("3-2","bbb");nestDepth3.put("3-3","ccc");nestDepth3.put("3-4","ddd");
		nestDepth2.put("2-1",nestDepth3);nestDepth2.put("2-2","bb");nestDepth2.put("2-3","cc");nestDepth2.put("2-4","dd");
		nestDepth1.put("1-1",nestDepth2);nestDepth1.put("1-2","b");nestDepth1.put("1-3","c");nestDepth1.put("1-4","d");
		
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
