package excat.test;

import java.util.ArrayList;
import java.util.HashMap;

public class TestCase16_4 extends CommonCase {
	//change for every case
	public static String pub="publi";
	static String pack="packag";
	protected static String prot="protect";
	private final static String caseNo = "16_4";
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO é©ìÆê∂ê¨Ç≥ÇÍÇΩÉÅÉ\ÉbÉhÅEÉXÉ^Éu
		new TestCase16_4().setConfigAndRunCase("fire runtime exception in this case");
	}
	
	/**
	 * main process of Test Case 16_4 
	 * fire a RuntimeException
	 * 
	 * if it is necesary, 
	 * call setConfigAndRunCase() to change config file
	 */
	public void runCase(Object caseMessage) throws Throwable{
		System.out.println("in case 16_4");
		
		//do test work of this case
		String caseinfo = " is testedÅ`Ç†Å|22áä111";
		//throw new RuntimeException((String)caseMessage + caseinfo);
		ArrayList list = new ArrayList();
		//ArrayList list2 = new ArrayList();
		HashMap map = new HashMap();
		//HashMap map2 = new HashMap();

		list.add("maplist");
		map.put("lm","listMap");
		
		map.put("ml",list);
		list.add(map);
		
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
