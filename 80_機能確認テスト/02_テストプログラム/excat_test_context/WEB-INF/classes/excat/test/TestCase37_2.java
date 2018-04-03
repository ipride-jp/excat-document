package excat.test;

import java.util.ArrayList;

public class TestCase37_2 extends CommonCase {
	//change for every case
	private final static String caseNo = "37_2";
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO é©ìÆê∂ê¨Ç≥ÇÍÇΩÉÅÉ\ÉbÉhÅEÉXÉ^Éu
		new TestCase37_2().setConfigAndRunCase("fire runtime exception in this case");
	}
	
	/**
	 * main process of Test Case 37_2 
	 * fire a RuntimeException
	 * 
	 * if it is necesary, 
	 * call setConfigAndRunCase() to change config file
	 */
	public void runCase(Object caseMessage) throws Throwable{
		System.out.println("in case 37_2");
		
		Object[] oa = new Object[101];
		for(int i=0;i<101;i++) {
			ArrayList lst = new ArrayList();
			lst.add("oa"+i);
			oa[i] = lst;	
		}
		
		m1(oa);
	}
	
	
	
	/**
	 * all case is same for this method
	 */
	//@Override
	public String getCaseNo() {
		return caseNo;
	}
	
	private void m1(Object[] oa) {

		//do test work of this case
		String caseinfo = " is testedÅ`Ç†Å|22áä111";
		//throw new RuntimeException((String)caseMessage + caseinfo);
		throw new RuntimeException("affafÅ`Ç†Å|22áä111");
	}
}
